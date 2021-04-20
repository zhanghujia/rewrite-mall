package com.jia.umsmall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)实体类
 *
 * @author makejava
 * @since 2020-10-15 14:47:01
 */
@Builder
@Data
public class UmsMemberCollectSubject implements Serializable {

    private static final long serialVersionUID = 495237399524761708L;


    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private Long id;

    /**
     * subject_id
     */
    @ApiModelProperty(value = "subject_id", required = true)
    private Long subjectId;

    /**
     * subject_name
     */
    @ApiModelProperty(value = "subject_name", required = true)
    private String subjectName;

    /**
     * subject_img
     */
    @ApiModelProperty(value = "subject_img", required = true)
    private String subjectImg;

    /**
     * 活动url
     */
    @ApiModelProperty(value = "活动url", required = true)
    private String subjectUrll;
}