package ml.socshared.template.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import ml.socshared.template.api.v1.rest.HelloApi;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloController implements HelloApi {

    @Override
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> printHelloWorld() {
        return new HashMap<>() {
            { put("text", "Hello, World"); }
        };
    }

}
