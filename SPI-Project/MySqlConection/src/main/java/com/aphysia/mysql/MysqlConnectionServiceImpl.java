package com.aphysia.mysql;

import com.aphysia.sql.DBConnectionService;

public class MysqlConnectionServiceImpl implements DBConnectionService {
    public void connect() {
        System.out.println("mysql数据库正在连接...");
    }
}
