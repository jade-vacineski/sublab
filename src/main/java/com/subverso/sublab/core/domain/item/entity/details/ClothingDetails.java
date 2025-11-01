package com.subverso.sublab.core.domain.item.entity.details;

import com.subverso.sublab.core.domain.item.entity.Item;

import com.subverso.sublab.core.domain.item.enums.ClothingType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clothing_details")
@Getter
@Setter
@NoArgsConstructor
public class ClothingDetails implements ItemDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Enumerated(EnumType.STRING)
    private ClothingType clothingType;

    private String size;
    private String fabric;
}
