package tk.mybatis.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: tk.mybatis.generator
 * @ClassName: Generator
 * @Description: 读取 MBG 配置生成代码
 * @author: qiuweijie
 * @date: 2019/12/19  15:10
 */
public class Generator {
    public static void main(String[] args) throws Exception{
        // MBG 执行过程中的警告信息
        List<String> warnings = new ArrayList<>();
        // 当生成的代码重复时，覆盖原代码
        boolean overwrite = true;
        // 读取 MBG 配置文件
        InputStream is = Generator.class.getResourceAsStream("/genarator/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning: warnings){
            System.out.println(warning);
        }
    }
}
