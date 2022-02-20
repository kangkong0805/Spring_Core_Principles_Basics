package hello.core.scan;

import hello.core.order.AutoAppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void BasicScan() {
        new AnnotationConfigApplicationContext(AutoAppConfig.class)
    }
}
