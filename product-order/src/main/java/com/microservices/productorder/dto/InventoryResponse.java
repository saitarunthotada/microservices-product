package com.microservices.productorder.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class InventoryResponse {

    private String skuCode;
    private boolean isInStock;

    public InventoryResponse(String skuCode, boolean isInStock) {
        this.skuCode = skuCode;
        this.isInStock = isInStock;
    }

}
