package com.example.studyMybatis.enums;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.example.studyMybatis.enums
 * @ClassName: EnabledTypeHandler
 * @Description: 类型处理器
 * @author: qiuweijie
 * @date: 2019/12/2  15:22
 */
public class EnabledTypeHandler implements TypeHandler<Enabled> {

    private final Map<Integer, Enabled> enabledMap = new HashMap<>();

    public EnabledTypeHandler() {
        for(Enabled enabled : Enabled.values()){
            enabledMap.put(enabled.getValue(), enabled);
        }
    }

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Enabled enabled, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public Enabled getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public Enabled getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Enabled getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
