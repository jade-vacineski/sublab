package com.subverso.sublab.application.service.item.dto;

import com.subverso.sublab.core.domain.item.enums.ClothingType;

public class ClothingDetailsRequest extends ItemDetailsRequest {
    private ClothingType clothingType;
    private String size;
    private String fabric;
}
