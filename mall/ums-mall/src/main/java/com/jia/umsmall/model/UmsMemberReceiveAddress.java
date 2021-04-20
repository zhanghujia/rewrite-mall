package com.jia.umsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 会员收货地址(UmsMemberReceiveAddress)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:47:29
 */
@Builder
@Data
public class UmsMemberReceiveAddress implements Serializable {

    private static final long serialVersionUID = 131864688810052793L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * member_id
     */
    @ApiModelProperty(value = "member_id", required = true)
    private Long memberId;

    /**
     * 收货人姓名
     */
    @ApiModelProperty(value = "收货人姓名", required = true)
    private String name;

    /**
     * 电话
     */
    @ApiModelProperty(value = "电话", required = true)
    private String phone;

    /**
     * 邮政编码
     */
    @ApiModelProperty(value = "邮政编码", required = true)
    private String postCode;

    /**
     * 省份/直辖市
     */
    @ApiModelProperty(value = "省份/直辖市", required = true)
    private String province;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市", required = true)
    private String city;

    /**
     * 区
     */
    @ApiModelProperty(value = "区", required = true)
    private String region;

    /**
     * 详细地址(街道)
     */
    @ApiModelProperty(value = "详细地址(街道)", required = true)
    private String detailAddress;

    /**
     * 省市区代码
     */
    @ApiModelProperty(value = "省市区代码", required = true)
    private String areacode;

    /**
     * 是否默认
     */
    @ApiModelProperty(value = "是否默认", required = true)
    private Byte defaultStatus;
}