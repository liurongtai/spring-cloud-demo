package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg("success");
        resultVO.setCode(0);
        resultVO.setData(object);
        return resultVO;
    }

}
