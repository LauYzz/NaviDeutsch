package com.tongji.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tongji.entity.Word;
import com.tongji.entity.WordForm;
import com.tongji.mapper.WordFormMapper;
import com.tongji.mapper.WordMapper;
import com.tongji.service.WordService;
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
public class WordServiceImpl extends ServiceImpl<WordMapper, Word> implements WordService {
    @Autowired
    private WordMapper wordMapper;

    @Autowired
    private WordFormMapper wordFormMapper;

    @Override
    public Word getTranslationAndLevelByForm(String form) {
        QueryWrapper<WordForm> formWrapper = new QueryWrapper<>();
        formWrapper.eq("form", form);
        WordForm wordForm = wordFormMapper.selectOne(formWrapper);

        if (wordForm != null) {
            return wordMapper.selectById(wordForm.getWordId());
        } else {
            return null;
        }
    }
}
