package com.adsIn.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.mustache.MustacheTemplateLoader;
import org.springframework.web.servlet.view.mustache.MustacheViewResolver;

/**
 * Created by NareshL on 18-07-2016.
 */
@Configuration
public class AdsInConfiguration {

    @Bean
    public ViewResolver getViewResolver(ResourceLoader resourceLoader) {
        MustacheViewResolver mustacheViewResolver = new MustacheViewResolver();
        mustacheViewResolver.setPrefix("classpath:/templates/");
        mustacheViewResolver.setSuffix(".html");
        mustacheViewResolver.setCache(false);
        mustacheViewResolver.setContentType("text/html;charset=utf-8");

        MustacheTemplateLoader mustacheTemplateLoader = new MustacheTemplateLoader();
        mustacheTemplateLoader.setResourceLoader(resourceLoader);

        mustacheViewResolver.setTemplateLoader(mustacheTemplateLoader);
        return mustacheViewResolver;
    }

}
