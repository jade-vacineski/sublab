package com.subverso.sublab.core.domain.item.entity.details;

import com.subverso.sublab.core.domain.item.enums.BagType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bag_details")
@Getter
@Setter
@NoArgsConstructor
public class BagDetails extends ItemDetails{

    @Enumerated(EnumType.STRING)
    private BagType bagType;

    private String material;

}
