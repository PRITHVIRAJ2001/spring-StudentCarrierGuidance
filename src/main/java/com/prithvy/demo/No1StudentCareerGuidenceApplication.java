package com.prithvy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.prithvy.demo")
@EnableSwagger2
@Configuration
public class No1StudentCareerGuidenceApplication {


    public static void main(String[] args) {
        SpringApplication.run(No1StudentCareerGuidenceApplication.class, args);
    }
    
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.prithvy.demo")).build();

    }
//
//    @Bean
//    public void connectDB()
//    {
//        System.out.println("Connecting to database ......" );
////        List<ServerAddress> seeds = new ArrayList<>();
////        seeds.add(new ServerAddress("cluster0-shard-00-00.zqniq.mongodb.net", 27017));
////        seeds.add(new ServerAddress("cluster0-shard-00-01.zqniq.mongodb.net", 27017));
////        seeds.add(new ServerAddress("cluster0-shard-00-02.zqniq.mongodb.net", 27017));
////
////        String mongoUri = "mongodb+srv://username:Password123@cluster0.zqniq.mongodb.net/CarrierGuidance?retryWrites=true&w=majority";
////        MongoClient mongoClient =  new MongoClient(new MongoClientURI(mongoUri));
////        System.out.println("Database Connected....");
//        }


}
