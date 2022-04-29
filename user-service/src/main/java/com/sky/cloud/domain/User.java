package com.sky.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sky
 * @date 2022/4/29
 * @description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String username;

    private String password;
}
