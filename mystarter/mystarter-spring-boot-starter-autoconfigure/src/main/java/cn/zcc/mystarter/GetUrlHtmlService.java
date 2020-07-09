package cn.zcc.mystarter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName GetUrlHtmlService
 * @Author zhangcece
 * @Description
 * @Date 2020/7/8
 * @Version 1.0.0
 **/
@Getter
@Setter
public class GetUrlHtmlService {

    private String url;

    public String getUrlHtml(){
        try {
            URL url=new URL(this.url);
            URLConnection urlConnection=url.openConnection();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"utf8"));
            StringBuffer stringBuffer=new StringBuffer();
            while(bufferedReader.readLine()!=null){
                stringBuffer.append(bufferedReader.readLine()).append("\n");
            }
            return stringBuffer.toString();
        } catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }
}
