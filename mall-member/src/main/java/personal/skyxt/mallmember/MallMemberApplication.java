package personal.skyxt.mallmember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@EnableFeignClients("personal.skyxt.mallmember.feign")
@EnableDiscoveryClient
@MapperScan("personal.skyxt.mallmember.dao")
@SpringBootApplication
public class MallMemberApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MallMemberApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = String.valueOf(applicationContext.getEnvironment().getProperty("user.age"));
        System.err.println("user name :" +userName+"; age: "+userAge);
    }

}
