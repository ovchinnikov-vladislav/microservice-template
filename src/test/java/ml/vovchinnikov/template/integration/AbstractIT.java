package ml.vovchinnikov.template.integration;

import lombok.Getter;
import ml.vovchinnikov.template.config.Constants;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
@ActiveProfiles(Constants.TEST_PROFILE)
public abstract class AbstractIT {

    @Getter
    @LocalServerPort
    private int localServerPort;
}

