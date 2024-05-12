package com.example.demo.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class DeviceRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;
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

    private Date create_time;
}
