package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName tb_data_wlw
 */
@TableName(value ="tb_data_wlw")
@Data
public class wlwData implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer device_id;

    /**
     * 
     */
    private Date create_time;

    /**
     * 
     */
    private BigDecimal celsius;

    /**
     * 
     */
    private BigDecimal humidity;

    /**
     * 
     */
    private BigDecimal fdegree;

    /**
     * 
     */
    private BigDecimal findex;

    /**
     * 
     */
    private BigDecimal cindex;

    /**
     * 
     */
    private BigDecimal smoisture;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}