package com.tech.microservices.restController;

import com.tech.microservices.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
        @Autowired
        private final InventoryService inventoryService;

        @GetMapping
        @ResponseStatus(HttpStatus.OK)
       public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
            return inventoryService.IsInStock(skuCode, quantity);
        }
}
