package ml.vovchinnikov.template.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "http://template:8888")
public interface TemplateFeignClient {

    @GetMapping(value = "/api/v1/test", produces = MediaType.APPLICATION_JSON_VALUE)
    String test();

}
