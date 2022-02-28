package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // basePackages: 탐색할 패키지의 시작 위치를 지정한다.
        // basePackageClasses : 지정한 클래스의 패키지를 탐색 시작 위치로 지정한다.
        // 지정 안했을 때 : '@ComponentScan'이 붙은 설정 정보 클래스의 패키지가 시작 위치로 된다.
        basePackages = "hello.core",

        // excludeFilters : 특정 조건을 만족하는 객체를 컴포넌트 스캔에서 제외시키는 설정
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION, // 애노테이션 타입
                classes = Configuration.class // @Configuration
        )
)
public class AutoAppConfig {

        @Bean(name = "memoryMemberRepository")
        public MemberRepository memberRepository() {
                return new MemoryMemberRepository();
        }
}
