package com.ldl.domain;

import com.ldl.utils.DateUtils;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Product {
    private Integer id;
    private String productName;
    private String productNum;
    private String cityName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date departureTime;
    private String departureTimeStr;
    private float productPrice;
    private String productDesc;
    private byte productStatus;
    private String productStatusStr;

    public String getProductStatusStr() {
        if(productStatus == 0){
            return "关闭";
        }else{
            return "开启";
        }

    }

    public String getDepartureTimeStr() {
        if(departureTime != null) {
            DateUtils dateUtils = new DateUtils();
            return dateUtils.dateToString("yyyy-MM-dd", departureTime);
        }
        return "";
    }
}
