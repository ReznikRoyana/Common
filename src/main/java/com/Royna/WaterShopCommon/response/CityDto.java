package com.Royna.WaterShopCommon.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CityDto {
    Long id;
    String name;
    CountryDto country;
}
