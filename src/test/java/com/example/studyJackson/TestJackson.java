package com.example.studyJackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @PackageName: com.example.studyJackson
 * @ClassName: TestJackson
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/26  11:15
 */
public class TestJackson {

    private final static Logger logger = LoggerFactory.getLogger(TestJackson.class);
    public static void main(String[] args) {
        //writeJsonObject();
        //readJsonObject();
        readJsonMap();
    }
    // 序列化到文件
    public static void writeJsonObject(){
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person("alter", 23);
        try{
            mapper.writeValue(new File("./person.json"), person);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 直接将一个 json 转化为对象
    public static void readJsonObject(){
        ObjectMapper mapper = new ObjectMapper();
        try{
            Person person = mapper.readValue(new File("./person.json"), Person.class);
            logger.debug("name:" + person.getName() + "age:" + person.getAge());
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readJsonMap(){
        ObjectMapper mapper = new ObjectMapper();
        try{
            // 需要注意的是这里的 Map 实际为一个 LikedHashMap, 即链式哈希表，可以按照读入顺序遍历
            Map map = mapper.readValue(new File("./person.json"),Map.class);
            logger.debug(map.get("name") + ":" + map.get("age"));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
