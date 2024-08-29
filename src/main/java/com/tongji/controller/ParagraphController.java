package com.tongji.controller;


import com.tongji.entity.Paragraph;
import com.tongji.service.ArticleService;
import com.tongji.service.ParagraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 */
@RestController
@RequestMapping("/paragraph")
public class ParagraphController {
    @Autowired
    private ParagraphService paragraphService;
    @GetMapping("/api/reading/article/{articleId}/paragraph/{paragraphId}/original")
    public String getContentByParaId(@PathVariable String articleId,@PathVariable String paragraphId){
        return paragraphService.getContentByParaId(articleId, paragraphId);
    }

    @GetMapping("/api/reading/article/{articleId}/paragraph/{paragraphId}/translation")
    public String getTranslatedContentByParaId(@PathVariable String articleId,@PathVariable String paragraphId){
        return paragraphService.getTranslatedContentByParaId(articleId, paragraphId);
    }

    @GetMapping("/api/reading/article/{articleId}/paragraph/{paragraphId}/record")
    public String getRecordResourceByParaId(@PathVariable String articleId,@PathVariable String paragraphId){
        return paragraphService.getRecordResourceByParaId(articleId, paragraphId);
    }
}
