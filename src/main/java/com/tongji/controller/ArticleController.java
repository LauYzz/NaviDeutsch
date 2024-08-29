package com.tongji.controller;


import com.tongji.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/api/reading/article/{id}/original")
    public String getContentById(@PathVariable String id){
        System.out.println("aaaaabbbbb");
        System.out.println("传入的id是：");
        System.out.println(id);
        return articleService.getContentById(id);
    }

//    @GetMapping("/api/reading/article/original")
//    public String getContentById(@RequestParam String id){
//        System.out.println("传入的id是：");
//        System.out.println(id);
//        System.out.println("aaaaabbbbb");
//        return articleService.getContentById(id);
//    }

    @GetMapping("/api/reading/article/{id}/translation")
    public String getTranslatedContentById(@PathVariable String id){
        System.out.println("获取翻译传入的id是：");
        System.out.println(id);
        return articleService.getTranslatedContentById(id);
    }

    @GetMapping("/api/reading/article/{id}/title")
    public String getTitleById(@PathVariable String id){
        return articleService.getTitleById(id);
    }

//    @GetMapping("/test")
//    public String test(){
//        return "Test successful";
//    }
}
