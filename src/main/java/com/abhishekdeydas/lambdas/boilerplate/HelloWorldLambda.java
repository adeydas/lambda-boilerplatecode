package com.abhishekdeydas.lambdas.boilerplate;

import com.abhishekdeydas.lambdas.boilerplate.models.HelloModel;
import com.amazonaws.services.lambda.runtime.Context;

public class HelloWorldLambda {

    public HelloModel sayHello(final Context lambdaContext) {

        return HelloModel.builder()
                .message("Hello there")
                .statusCode(200)
                .build();

    }

}
