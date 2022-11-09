package com.Royna.WaterShopCommon.response;

import com.Royna.WaterShopCommon.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    Long id;
    UserType type;
    String fullName;
    String login;
    String password;
    //    String email;
    String phoneNumber;
//    CityDto city;
//    AddressDto address;
}
