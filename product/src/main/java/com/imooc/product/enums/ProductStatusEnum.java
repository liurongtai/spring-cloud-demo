package com.imooc.product.enums;

import lombok.Getter;

/**
 * 商品状态
 *
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
        ;
    private Integer code;
    private String message;

    ProductStatusEnum(int i, String m) {
        this.code = i;
        this.message = m;
    }
}
