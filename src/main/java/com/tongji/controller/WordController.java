package com.tongji.controller;


import com.tongji.entity.Word;
import com.tongji.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 */
@RestController
@RequestMapping("/word")
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping("/search")
    public ResponseEntity<Word> getWordByForm(@RequestParam String form) {
        Word word = wordService.getTranslationAndLevelByForm(form);
        if (word != null) {
            return ResponseEntity.ok(word);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
