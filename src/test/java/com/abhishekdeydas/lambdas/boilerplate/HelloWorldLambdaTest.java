package com.abhishekdeydas.lambdas.boilerplate;

import com.abhishekdeydas.lambdas.boilerplate.models.HelloModel;
import com.amazonaws.services.lambda.runtime.Context;
import org.easymock.Mock;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class HelloWorldLambdaTest extends UnitTestBase {

    private HelloWorldLambda unit;

    @Mock private Context lambdaContext;

    @Before
    public void setup() {
        unit = new HelloWorldLambda();
    }

    @Test
    public void testHappyPath() throws Exception {
        final HelloModel helloModel = unit.sayHello(lambdaContext);

        assertEquals("Hello there", helloModel.getMessage());
        assertEquals(200, helloModel.getStatusCode());
    }

}