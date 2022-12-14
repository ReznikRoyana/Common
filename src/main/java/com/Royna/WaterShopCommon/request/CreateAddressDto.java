package com.Royna.WaterShopCommon.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateAddressDto {
    String latitude;
    String longitude;
    Long cityId;
    String street;
    String house;
    String flat;
    String level;
    boolean elevator;
    Long userId;
}
