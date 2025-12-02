package com.subverso.sublab.application.service.item.dto;

import com.subverso.sublab.core.domain.item.enums.FootwearType;

public class FootwearDetailsRequest extends ItemDetailsRequest {
    private FootwearType footwearType;
    private int sizeNumber;
    private String material;
}
