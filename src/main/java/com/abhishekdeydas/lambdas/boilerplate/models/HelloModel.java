package com.abhishekdeydas.lambdas.boilerplate.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class HelloModel {
    private String message;
    private int statusCode;
}
