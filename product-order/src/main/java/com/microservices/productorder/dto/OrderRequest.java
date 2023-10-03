package com.microservices.productorder.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequest {

    public OrderRequest() {
    }

    public OrderRequest(List<OrderLineItemsDto> orderLineItemsDtosList) {
        this.orderLineItemsDtosList = orderLineItemsDtosList;
    }

    private List<OrderLineItemsDto> orderLineItemsDtosList;
}
