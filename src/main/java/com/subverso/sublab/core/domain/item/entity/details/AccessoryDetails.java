package com.subverso.sublab.core.domain.item.entity.details;

import com.subverso.sublab.core.domain.item.enums.AccessoryType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accessory_details")
@Getter
@Setter
@NoArgsConstructor
public class AccessoryDetails extends ItemDetails  {

    @Enumerated(EnumType.STRING)
    private AccessoryType accessoryType;

    private String material;
    private String color;
}
