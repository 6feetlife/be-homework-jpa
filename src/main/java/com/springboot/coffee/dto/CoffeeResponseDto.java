package com.springboot.coffee.dto;

import com.springboot.coffee.entity.Coffee;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class CoffeeResponseDto {
    private long coffeeId;
    private String korName;
    private String engName;
    private int price;

    private Coffee.CoffeeStatus coffeeStatus; // 커피 상태 추가

    public String getCoffeeStatus() {
        return coffeeStatus.getStatus();
    }
}
