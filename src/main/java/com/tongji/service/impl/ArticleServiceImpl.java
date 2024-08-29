package com.tongji.service.impl;

import com.tongji.entity.Article;
import com.tongji.mapper.ArticleMapper;
import com.tongji.service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public String getContentById(String id){
        return articleMapper.getContentById(id);
    }

    @Override
    public String getTranslatedContentById(String id){
        return articleMapper.getTranslatedContentById(id);
    }

    @Override
    public String getTitleById(String id) {return articleMapper.getTitleById(id);}
}
