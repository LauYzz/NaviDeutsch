package com.tongji.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Word对象", description="")
public class Word implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("wordId")
    private String wordId;

    private String word;

    private String translation;

    private String level;

}
