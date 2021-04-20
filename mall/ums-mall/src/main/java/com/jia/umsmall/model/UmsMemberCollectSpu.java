package com.jia.umsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 会员收藏的商品(UmsMemberCollectSpu)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:46:54
 */
@Builder
@Data
public class UmsMemberCollectSpu implements Serializable {

    private static final long serialVersionUID = -62009460979282207L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id", required = true)
    private Long memberId;

    /**
     * spu_id
     */
    @ApiModelProperty(value = "spu_id", required = true)
    private Long spuId;

    /**
     * spu_name
     */
    @ApiModelProperty(value = "spu_name", required = true)
    private String spuName;

    /**
     * spu_img
     */
    @ApiModelProperty(value = "spu_img", required = true)
    private String spuImg;

    /**
     * create_time
     */
    @ApiModelProperty(value = "create_time", required = true)
    private Date createTime;
}