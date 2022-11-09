package com.Royna.WaterShopCommon.request;

import com.Royna.WaterShopCommon.enums.PayMethodType;
import com.Royna.WaterShopCommon.response.SelectProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderDto {
    Long userId;
    String name;
    String address;
    String phoneNumber;
    PayMethodType payMethodType;
    List<SelectProductDto> products;
}
