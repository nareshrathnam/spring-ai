package com.demo.springapp.client;

import org.springframework.stereotype.Service;

@Service
public class PoetryServiceImpl implements PoetryService {
    public static final String WRITE_ME_HAIKU_ABOUT_CAT ="Write me Haiku about cat,haiku should start with the word cat obligatory";

    private final AiClient aiClient = null;

    // constructor
    

    @Override
    public String getCatHaiku() {
        return aiClient.generate(WRITE_ME_HAIKU_ABOUT_CAT);
    }
}
