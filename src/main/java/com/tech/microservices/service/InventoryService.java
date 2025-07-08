package com.tech.microservices.service;

public interface InventoryService {
    public boolean IsInStock(String skuCode, Integer quantity);
}
