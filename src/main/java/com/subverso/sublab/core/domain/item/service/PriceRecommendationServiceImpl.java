package com.subverso.sublab.core.domain.item.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.subverso.sublab.core.domain.item.entity.Item;

@Service
public class PriceRecommendationServiceImpl implements PriceRecommendationService {

    @Override
    public BigDecimal suggestPrice(Item item) {
        if (item.getBasePrice() == null) {
            return BigDecimal.ZERO;
        }

        return item.getBasePrice().multiply(BigDecimal.valueOf(1.2));
    }
}