package com.subverso.sublab.application.service.item.dto;

import com.subverso.sublab.core.domain.item.enums.AccessoryType;

public class AccessoryDetailsRequest extends ItemDetailsRequest {
    private AccessoryType accessoryType;
    private String material;
    private String color;
}
