package com.tongji.service;

import com.tongji.entity.Word;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface WordService extends IService<Word> {
    Word getTranslationAndLevelByForm(String form);
}
