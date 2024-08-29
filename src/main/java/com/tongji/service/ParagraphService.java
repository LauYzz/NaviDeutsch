package com.tongji.service;

import com.tongji.entity.Paragraph;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface ParagraphService extends IService<Paragraph> {
    String getContentByParaId(String articleId, String paragraphId);
    String getTranslatedContentByParaId(String articleId,String paragraphId);
    String getRecordResourceByParaId(String articleId,String paragraphId);
}
