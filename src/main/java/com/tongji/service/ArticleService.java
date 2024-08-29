package com.tongji.service;

import com.tongji.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface ArticleService extends IService<Article> {
    String getContentById(String id);
    String getTranslatedContentById(String id);
    String getTitleById(String id);
}
