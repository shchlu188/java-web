package com.scl.shop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * @package: com.scl.shop.domain
 * @author: chenglu
 * @create: 2020/4/4
 * @desc:
 */
@Data
@NoArgsConstructor

public class User implements Serializable {

    private String email;
    private String username;

    private String password;
}
