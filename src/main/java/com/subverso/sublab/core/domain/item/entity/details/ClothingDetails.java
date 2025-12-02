package com.subverso.sublab.core.domain.item.entity.details;

import com.subverso.sublab.core.domain.item.enums.ClothingType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clothing_details")
@Getter
@Setter
@NoArgsConstructor
public class ClothingDetails extends ItemDetails {

    @Enumerated(EnumType.STRING)
    private ClothingType clothingType;

    private String size;
    private String fabric;
}
