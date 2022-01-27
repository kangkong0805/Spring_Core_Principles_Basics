package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
    /* 역할에 따른 구현 정리 */

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());  // 회원 저장소 구현체를 생성자를 통해 주입(연결)
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), discountPolicy());  // 회원 저장소 구현체와 할인 정책 구현체를 생성자를 통해 주입(연결)
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
