package com.froyo.connector.services.storage;

import org.springframework.stereotype.Component;

@Component
public class DatabaseStorageService implements StorageService {

    public DatabaseStorageService() {

        System.out.println("DatabaseStorageService constructed");
    }

    @Override
    public void execute() {
    }
}