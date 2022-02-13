package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        // ApplicationContext : 스프링 컨테이너
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // getBean("찾으려는 객체 이름", 찾으려는 객체 타입) : 원하는 bean을 가져오기
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);  // 회원생성
        memberService.join(member);  // 회원가입

        Member findMember = memberService.findMember(1L);  // 특정 아이디의 회원조회
        System.out.println("new = " + member.getName());  // 생성된 회원의 이름 출력
        System.out.println("find = " + findMember.getName());  // 조회된 회원의 이름 출력
    }
}
