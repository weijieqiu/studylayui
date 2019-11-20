package com.example.studyMybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @PackageName: com.example.studyMabatis.utils
 * @ClassName: SqlSessionFactoryUtils
 * @Description: SqlSessionFactory 双重锁加载单例类
 * @author: qiuweijie
 * @date: 2019/11/16  16:34
 */


public class SqlSessionFactoryUtils {
    private final static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;

    private static SqlSessionFactory sqlSessionFactory = null;


    public SqlSessionFactoryUtils() {
    }

    private static SqlSessionFactory getSqlSessionFactory() {
        if(sqlSessionFactory != null){
            synchronized (LOCK){
                if(sqlSessionFactory != null){
                    return sqlSessionFactory;
                }
                String resource = "mybatis/mybatis-config.xml";
                InputStream inputStream;
                try{
                    inputStream = Resources.getResourceAsStream(resource);
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                }catch (IOException e){
                    e.printStackTrace();
                    return null;
                }
            }
            return sqlSessionFactory;
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession() {
        if(sqlSessionFactory == null){
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
