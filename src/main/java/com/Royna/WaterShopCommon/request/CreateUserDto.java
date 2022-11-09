package com.Royna.WaterShopCommon.request;

import com.Royna.WaterShopCommon.enums.UserType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateUserDto {
    UserType type;
    String fullName;
    String login;
    String password;
    //    String email;
    String phoneNumber;
//    Long cityId;
//    Long addressId;
}
