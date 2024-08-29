package com.tongji.service.impl;

import com.tongji.entity.Paragraph;
import com.tongji.mapper.ArticleMapper;
import com.tongji.mapper.ParagraphMapper;
import com.tongji.service.ParagraphService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class ParagraphServiceImpl extends ServiceImpl<ParagraphMapper, Paragraph> implements ParagraphService {
    @Autowired
    private ParagraphMapper paragraphMapper;
    @Override
    public String getContentByParaId(String articleId, String paragraphId){
        return paragraphMapper.getContentByParaId(articleId,paragraphId);
    }

    @Override
    public String getTranslatedContentByParaId(String articleId, String paragraphId){
        return paragraphMapper.getTranslatedContentByParaId(articleId,paragraphId);
    }

    @Override
    public String getRecordResourceByParaId(String articleId, String paragraphId){
        return paragraphMapper.getRecordResourceByParaId(articleId,paragraphId);
    }
}
