package com.tongji.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wyx20
 * @version 1.0
 * @title PersonalInfoDto
 * @description 用户个人信息（不含密码）
 * @create 2023/12/15 19:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfoDto {
    private String phone;

    private String name;

    private String school;

}
