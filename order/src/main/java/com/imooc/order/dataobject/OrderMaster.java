package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName;

    private  String buyerPhone;

    private  String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Date createTime;

    private Date updateTime;
}
