package ml.vovchinnikov.template.api.v1.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;

@Api(value = "Hello Controller")
public interface TemplateApi {

    @ApiOperation(value = "print hello, world", notes = "print hello, world")
    HashMap<String, String> printHelloWorld();
}
