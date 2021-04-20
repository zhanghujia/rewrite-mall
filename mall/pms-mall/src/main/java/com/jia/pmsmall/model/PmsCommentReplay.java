package com.jia.pmsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 商品评价回复关系(PmsCommentReplay)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:14:40
 */
@Builder
@Data
public class PmsCommentReplay implements Serializable {

    private static final long serialVersionUID = -99438232860469262L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * 评论id
     */
    @ApiModelProperty(value = "评论id", required = true)
    private Long commentId;

    /**
     * 回复id
     */
    @ApiModelProperty(value = "回复id", required = true)
    private Long replyId;
}