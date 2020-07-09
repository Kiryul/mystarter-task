package cn.zcc.mystarter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName GetUrlHtmlProperties
 * @Author zhangcece
 * @Description
 * @Date 2020/7/8
 * @Version 1.0.0
 **/

@ConfigurationProperties(prefix = "geturl")
@Getter
@Setter
public class GetUrlHtmlProperties {

    private String url="http://www.baidu.com/";
}
