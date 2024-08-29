package com.tongji.mapper;

import com.tongji.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    @Select("SELECT content FROM article WHERE articleId = #{id}")
    String getContentById(String id);

    @Select("SELECT translated_content FROM article WHERE articleId = #{id}")
    String getTranslatedContentById(String id);

    @Select("SELECT title FROM article WHERE articleId = #{id}")
    String getTitleById(String id);

}
