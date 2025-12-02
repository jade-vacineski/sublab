package com.subverso.sublab.application.service.item.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ClothingDetailsRequest.class, name = "CLOTHING"),
        @JsonSubTypes.Type(value = FootwearDetailsRequest.class, name = "FOOTWEAR"),
        @JsonSubTypes.Type(value = BagDetailsRequest.class, name = "BAG"),
        @JsonSubTypes.Type(value = AccessoryDetailsRequest.class, name = "ACCESSORY")
})
public abstract class ItemDetailsRequest {
    private String type;   
}
