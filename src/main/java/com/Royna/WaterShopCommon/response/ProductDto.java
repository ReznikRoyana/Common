package com.Royna.WaterShopCommon.response;

import com.Royna.WaterShopCommon.enums.ProductContainerMaterialType;
import com.Royna.WaterShopCommon.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    long id;
    String name;
    ProductType productType;
    ProductContainerMaterialType productContainerMaterialType;
    int price;
    float volume;
    SellerDto seller;
    ManufacturerDto manufacturer;
}
