package com.jia.wmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 库存工作单(WmsWareOrderTaskDetail)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:29:48
 */
@Builder
@Data
public class WmsWareOrderTaskDetail implements Serializable {

    private static final long serialVersionUID = 187600565691696359L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * sku_id
     */
    @ApiModelProperty(value = "sku_id", required = true)
    private Long skuId;

    /**
     * sku_name
     */
    @ApiModelProperty(value = "sku_name", required = true)
    private String skuName;

    /**
     * 购买个数
     */
    @ApiModelProperty(value = "购买个数", required = true)
    private Integer skuNum;

    /**
     * 工作单id
     */
    @ApiModelProperty(value = "工作单id", required = true)
    private Long taskId;
}