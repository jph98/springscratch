package com.froyo.connector.services.storage;

import org.springframework.stereotype.Component;

@Component
public class FTPStorageService implements StorageService {

    public FTPStorageService() {

        System.out.println("FTPStorageService constructed");
    }

    @Override
    public void execute() {

    }
}
