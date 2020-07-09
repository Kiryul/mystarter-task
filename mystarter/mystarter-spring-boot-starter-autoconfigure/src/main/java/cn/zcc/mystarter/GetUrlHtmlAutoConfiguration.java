package cn.zcc.mystarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @ClassName GetUrlHtmlAutoConfiguration
 * @Author zhangcece
 * @Description
 * @Date 2020/7/8
 * @Version 1.0.0
 **/
@Configuration
@EnableConfigurationProperties(GetUrlHtmlProperties.class)
public class GetUrlHtmlAutoConfiguration {

    @Resource
    private GetUrlHtmlProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public GetUrlHtmlService init(){
        GetUrlHtmlService getUrlHtmlService=new GetUrlHtmlService();
        String url=properties.getUrl();
        getUrlHtmlService.setUrl(url);
        return getUrlHtmlService;
    }
}
