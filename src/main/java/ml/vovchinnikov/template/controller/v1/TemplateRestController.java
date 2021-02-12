package ml.vovchinnikov.template.controller.v1;

import lombok.RequiredArgsConstructor;
import ml.vovchinnikov.template.service.TemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import ml.vovchinnikov.template.api.v1.rest.TemplateApi;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/api/v1")
@RequiredArgsConstructor
public class TemplateRestController implements TemplateApi {

    private final TemplateService service;

    @Override
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> printHelloWorld() {

        return new HashMap<>() {
            {
                put("text", "Hello, World");
            }
        };
    }

    @GetMapping(value = "/feign", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testFeign() {
        return service.test();
    }

}
