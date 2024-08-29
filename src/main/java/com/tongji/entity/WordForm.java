package com.tongji.entity;

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
@ApiModel(value="WordForm对象", description="")
public class WordForm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("wordId")
    private String wordId;

    private String form;


}
