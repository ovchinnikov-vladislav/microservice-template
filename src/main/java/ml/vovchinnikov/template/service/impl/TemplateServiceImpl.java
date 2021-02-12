package ml.vovchinnikov.template.service.impl;

import lombok.RequiredArgsConstructor;
import ml.vovchinnikov.template.client.TemplateFeignClient;
import ml.vovchinnikov.template.service.TemplateService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemplateServiceImpl implements TemplateService {

    private final TemplateFeignClient client;

    @Override
    public String test() {
        return client.test();
    }
}
