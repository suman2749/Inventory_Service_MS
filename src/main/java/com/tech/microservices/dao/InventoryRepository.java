package com.tech.microservices.dao;

import com.tech.microservices.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
     boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode,Integer Quastity);
}
