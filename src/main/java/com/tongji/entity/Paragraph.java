package com.tongji.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Paragraph对象", description="")
public class Paragraph implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("paragraphId")
    private String paragraphid;

    private String content;

    @TableField("articleId")
    private String articleid;

    @TableField("paragraphOrder")
    private String paragraphorder;

    private String translated_content;

    private String recordResource;
}
