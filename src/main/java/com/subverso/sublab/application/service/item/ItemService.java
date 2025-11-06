package com.subverso.sublab.application.service.item;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.subverso.sublab.core.domain.item.entity.Item;
import com.subverso.sublab.core.domain.item.service.PriceRecommendationService;

@Service
public class ItemService {
    private final PriceRecommendationService priceRecommendationService;

    public ItemService(PriceRecommendationService priceRecommendationService) {
        this.priceRecommendationService = priceRecommendationService;
    }

    public Item createItem(Item item) {
       BigDecimal suggestedPrice = priceRecommendationService.suggestPrice(item);
        item.setSuggestedPrice(suggestedPrice);

        System.out.printf("Created item: %s | Suggested price: %.2f%n",
                item.getName(), suggestedPrice);

        return item;
    }
}
