package com.yami.shop.bean.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("farm")
public class Farm implements Serializable {

    @TableId
    private Long id;

    private String name;

    private String longitude;

    private String latitude;

    private String address;

    private String openingTime;

    private String status;

    private String distance;

}
