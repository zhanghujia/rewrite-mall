package com.jia.smsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:22:09
 */
@Builder
@Data
public class SmsHomeSubject implements Serializable {

    private static final long serialVersionUID = -72768349201775655L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 专题名字
     */
    @ApiModelProperty(value = "专题名字", required = true)
    private String name;

    /**
     * 专题标题
     */
    @ApiModelProperty(value = "专题标题", required = true)
    private String title;

    /**
     * 专题副标题
     */
    @ApiModelProperty(value = "专题副标题", required = true)
    private String subTitle;

    /**
     * 显示状态
     */
    @ApiModelProperty(value = "显示状态", required = true)
    private Byte status;

    /**
     * 详情连接
     */
    @ApiModelProperty(value = "详情连接", required = true)
    private String url;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;

    /**
     * 专题图片地址
     */
    @ApiModelProperty(value = "专题图片地址", required = true)
    private String img;
}