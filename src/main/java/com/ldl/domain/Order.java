package com.ldl.domain;

import com.ldl.utils.DateUtils;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class Order {
    private Integer id;
    private String orderNum;
    private String productId;
    private float  orderPrice;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private short orderStatus;
    private String orderStatusStr;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;
    private Product product;
    private User user;
    private List<Traveller> travellers;

    public String getCreateTime() {
        if(createTime != null) {
            DateUtils dateUtils = new DateUtils();
            return dateUtils.dateToString("yyyy-MM-dd HH:mm:ss", createTime);
        }
        return "";
    }

    public String getPayTime() {
        if(payTime != null) {
            DateUtils dateUtils = new DateUtils();
            return dateUtils.dateToString("yyyy-MM-dd HH:mm:ss", payTime);
        }
        return "";
    }

    public String getOrderStatusStr() {
        if(orderStatus == 0){
            return "未支付";
        }
        return "已支付";
    }
}
