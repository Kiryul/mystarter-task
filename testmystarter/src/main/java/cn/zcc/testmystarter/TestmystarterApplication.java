package cn.zcc.testmystarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.zcc")
public class TestmystarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmystarterApplication.class, args);
    }

}
