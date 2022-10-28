package com.Royna.WaterShopCommon.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerDto {
    Long id;
    String logo;
    String name;
}
