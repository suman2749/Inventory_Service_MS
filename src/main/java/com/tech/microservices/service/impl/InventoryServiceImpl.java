package com.tech.microservices.service.impl;

import com.tech.microservices.dao.InventoryRepository;
import com.tech.microservices.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private final InventoryRepository inventoryRepository;

    public boolean IsInStock(String skuCode, Integer quantity) {
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
