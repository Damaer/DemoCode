package com.aphysia.test;

import com.aphysia.sql.DBConnectionService;

import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {

        ServiceLoader<DBConnectionService>  serviceLoader= ServiceLoader.load(DBConnectionService.class);
        for (DBConnectionService dbConnectionService : serviceLoader) {
            dbConnectionService.connect();
        }
    }
}
