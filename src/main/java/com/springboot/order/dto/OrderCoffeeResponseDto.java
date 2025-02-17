package com.springboot.order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderCoffeeResponseDto {
    private long coffeeId;
    private String korName;
    private String engName;
    private Integer price;
    private Integer quantity;
}
