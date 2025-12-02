package com.subverso.sublab.core.domain.item.entity.details;

import com.subverso.sublab.core.domain.item.enums.FootwearType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "footwear_details")
@Getter
@Setter
@NoArgsConstructor
public class FootwearDetails extends ItemDetails{

    @Enumerated(EnumType.STRING)
    private FootwearType footwearType;

    private int sizeNumber;
    private String material;
}
