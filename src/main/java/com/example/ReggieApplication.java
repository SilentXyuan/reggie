package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ServletComponentScan
 * 在SpringBootApplication上使用@ServletComponentScan注解后，
 * Servlet（控制器）、Filter（过滤器）、Listener（监听器）可以直接通过
 * @WebServlet、@WebFilter、@WebListener注解自动注册到Spring容器中，无需其他代码。
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class ReggieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
    }

}
