package com.jia.umsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 会员等级(UmsMemberLevel)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:47:09
 */
@Builder
@Data
public class UmsMemberLevel implements Serializable {

    private static final long serialVersionUID = -15051869113047542L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 等级名称
     */
    @ApiModelProperty(value = "等级名称", required = true)
    private String name;

    /**
     * 等级需要的成长值
     */
    @ApiModelProperty(value = "等级需要的成长值", required = true)
    private Integer growthPoint;

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    @ApiModelProperty(value = "是否为默认等级[0->不是；1->是]", required = true)
    private Byte defaultStatus;

    /**
     * 免运费标准
     */
    @ApiModelProperty(value = "免运费标准", required = true)
    private Double freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    @ApiModelProperty(value = "每次评价获取的成长值", required = true)
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    @ApiModelProperty(value = "是否有免邮特权", required = true)
    private Byte priviledgeFreeFreight;

    /**
     * 是否有会员价格特权
     */
    @ApiModelProperty(value = "是否有会员价格特权", required = true)
    private Byte priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    @ApiModelProperty(value = "是否有生日特权", required = true)
    private Byte priviledgeBirthday;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = true)
    private String note;
}