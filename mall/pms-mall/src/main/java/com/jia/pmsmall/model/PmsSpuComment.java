package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


/**
 * 商品评价(PmsSpuComment)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:15:00
 */
@Builder
@Data
public class PmsSpuComment implements Serializable {

    private static final long serialVersionUID = 168511647807020959L;


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
     * spu_id
     */
    @ApiModelProperty(value = "spu_id", required = true)
    private Long spuId;

    /**
     * 商品名字
     */
    @ApiModelProperty(value = "商品名字", required = true)
    private String spuName;

    /**
     * 会员昵称
     */
    @ApiModelProperty(value = "会员昵称", required = true)
    private String memberNickName;

    /**
     * 星级
     */
    @ApiModelProperty(value = "星级", required = true)
    private Byte star;

    /**
     * 会员ip
     */
    @ApiModelProperty(value = "会员ip", required = true)
    private String memberIp;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 显示状态[0-不显示，1-显示]
     */
    @ApiModelProperty(value = "显示状态[0-不显示，1-显示]", required = true)
    private Byte showStatus;

    /**
     * 购买时属性组合
     */
    @ApiModelProperty(value = "购买时属性组合", required = true)
    private String spuAttributes;

    /**
     * 点赞数
     */
    @ApiModelProperty(value = "点赞数", required = true)
    private Integer likesCount;

    /**
     * 回复数
     */
    @ApiModelProperty(value = "回复数", required = true)
    private Integer replyCount;

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    @ApiModelProperty(value = "评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]", required = true)
    private String resources;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容", required = true)
    private String content;

    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户头像", required = true)
    private String memberIcon;

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    @ApiModelProperty(value = "评论类型[0 - 对商品的直接评论，1 - 对评论的回复]", required = true)
    private Byte commentType;
}