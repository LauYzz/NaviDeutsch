package com.tongji.mapper;

import com.tongji.entity.Paragraph;
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
public interface ParagraphMapper extends BaseMapper<Paragraph> {
    @Select("SELECT content FROM paragraph WHERE articleId = #{articleId} AND paragraphId = #{paragraphId}")
    String getContentByParaId(String articleId,String paragraphId);

    @Select("SELECT translated_content FROM paragraph WHERE articleId = #{articleId} AND paragraphId = #{paragraphId}")
    String getTranslatedContentByParaId(String articleId,String paragraphId);

    @Select("SELECT record_resource FROM paragraph WHERE articleId = #{articleId} AND paragraphId = #{paragraphId}")
    String getRecordResourceByParaId(String articleId,String paragraphId);
}
