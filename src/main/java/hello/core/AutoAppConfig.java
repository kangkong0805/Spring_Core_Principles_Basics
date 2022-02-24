package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // basePackages: 탐색할 패키지의 시작 위치를 지정
        basePackages = "hello.core",

        // excludeFilters : 특정 조건을 만족하는 객체를 컴포넌트 스캔에서 제외시키는 설정
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION, // 애노테이션 타입
                classes = Configuration.class // @Configuration
        )
)
public class    AutoAppConfig {

}
