package com.subverso.sublab.application.service.item.dto;

import java.math.BigDecimal;

import com.subverso.sublab.core.domain.item.enums.Condition;
import com.subverso.sublab.core.domain.item.enums.Gender;
import com.subverso.sublab.core.domain.item.enums.ProductCategory;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class ItemCreateRequest {
    
    @NotNull
    private String name;

    @NotNull
    private ProductCategory category;

    @NotNull
    private Condition condition;

    @NotNull
    private Gender gender;

    @NotNull
    private BigDecimal basePrice;

    @Valid
    private ItemDetailsRequest details; 
}
