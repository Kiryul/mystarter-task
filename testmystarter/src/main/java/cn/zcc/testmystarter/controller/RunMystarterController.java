package cn.zcc.testmystarter.controller;

import cn.zcc.mystarter.GetUrlHtmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RunMystarter
 * @Author zhangcece
 * @Description
 * @Date 2020/7/8
 * @Version 1.0.0
 **/
@Component
@RestController
public class RunMystarterController {

    @Autowired
    GetUrlHtmlService getUrlHtmlService;

    @GetMapping("/test")
    public String test(){
        return getUrlHtmlService.getUrlHtml();
    }




}
