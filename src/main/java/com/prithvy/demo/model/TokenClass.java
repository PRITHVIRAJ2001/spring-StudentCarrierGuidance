package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("com.prithvy.demo.model.TokenClass")
public class TokenClass {

    private String token;
}
