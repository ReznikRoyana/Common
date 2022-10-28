package com.Royna.WaterShopCommon.request;

import com.Royna.WaterShopCommon.enums.ProductContainerMaterialType;
import com.Royna.WaterShopCommon.enums.ProductType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreatProductDto {
    String name;
    ProductType productType;
    ProductContainerMaterialType productContainerMaterialType;
    int price;
    float volume;
    Long sellerId;
    Long manufactureId;
}
