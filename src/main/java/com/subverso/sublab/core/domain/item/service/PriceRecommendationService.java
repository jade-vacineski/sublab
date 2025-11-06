package com.subverso.sublab.core.domain.item.service;

import java.math.BigDecimal;

import com.subverso.sublab.core.domain.item.entity.Item;

public interface PriceRecommendationService {
    BigDecimal suggestPrice(Item item);
}
