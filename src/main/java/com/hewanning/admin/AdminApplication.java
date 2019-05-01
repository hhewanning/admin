package com.hewanning.admin;

import com.hewanning.admin.common.security.annotation.EnablePigResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnablePigResourceServer
@SpringBootApplication(scanBasePackages = "com.hewanning.admin")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
