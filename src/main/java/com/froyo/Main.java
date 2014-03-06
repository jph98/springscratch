package com.froyo;

import com.froyo.connector.services.ExecutionService;
import com.froyo.connector.services.storage.StorageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    private ClassPathXmlApplicationContext ac;

    public Main() {
    }

    public void load() {

        ac = new ClassPathXmlApplicationContext("classpath*:**/ac*.xml");
    }

    public void list() {

        ExecutionService executionService = ac.getBean(ExecutionService.class);

        List<StorageService> storageServices = executionService.getStorageServices();

        System.out.println("StorageServices size: " + storageServices.size());
        for (StorageService service: storageServices) {
            System.out.println("StorageService: " + service.getClass().getCanonicalName());
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.load();
        main.list();
    }
}