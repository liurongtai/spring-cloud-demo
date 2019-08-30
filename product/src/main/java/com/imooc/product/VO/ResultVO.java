package com.imooc.product.VO;

import lombok.Data;

/**
 * 返回对象
 * @param <T>
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 内容
     */
    private T data;

}
