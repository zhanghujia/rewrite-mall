package com.jia.wmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 仓库信息(WmsWareInfo)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:29:34
 */
@Builder
@Data
public class WmsWareInfo implements Serializable {

    private static final long serialVersionUID = 524924997203484870L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 仓库名
     */
    @ApiModelProperty(value = "仓库名", required = true)
    private String name;

    /**
     * 仓库地址
     */
    @ApiModelProperty(value = "仓库地址", required = true)
    private String address;

    /**
     * 区域编码
     */
    @ApiModelProperty(value = "区域编码", required = true)
    private String areacode;
}