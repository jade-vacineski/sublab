package com.subverso.sublab.application.service.item.dto;

import com.subverso.sublab.core.domain.item.enums.BagType;

public class BagDetailsRequest extends ItemDetailsRequest {
    private BagType bagType;
    private String material;
}
