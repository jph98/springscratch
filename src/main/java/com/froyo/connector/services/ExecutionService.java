package com.froyo.connector.services;

import com.froyo.connector.services.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExecutionService {

    private ReportingService reportingService;

    private List<StorageService> storageServices;

    public ExecutionService() {

        this.storageServices = new ArrayList<>();

        System.out.println("ExecutionService constructed");
    }

    @Autowired
    public void setReportingService(ReportingService reportingService) {
        this.reportingService = reportingService;
    }

    @Autowired
    public void setStorageServices(List<StorageService> storageServices) {
        this.storageServices = storageServices;
    }


    public List<StorageService> getStorageServices() {
        return storageServices;
    }
}