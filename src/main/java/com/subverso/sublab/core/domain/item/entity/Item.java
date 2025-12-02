package com.subverso.sublab.core.domain.item.entity;

import java.math.BigDecimal;

import com.subverso.sublab.core.domain.item.entity.details.ItemDetails;
import com.subverso.sublab.core.domain.item.enums.Condition;
import com.subverso.sublab.core.domain.item.enums.Gender;
import com.subverso.sublab.core.domain.item.enums.ProductCategory;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter @Setter @NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    @Enumerated(EnumType.STRING)
    private Condition condition;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(mappedBy = "item", cascade = CascadeType.ALL)
    private ItemDetails details;

    private BigDecimal basePrice;
    private BigDecimal suggestedPrice;
}

