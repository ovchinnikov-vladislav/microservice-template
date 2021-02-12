package ml.vovchinnikov.template.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class TemplateWebController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

}
