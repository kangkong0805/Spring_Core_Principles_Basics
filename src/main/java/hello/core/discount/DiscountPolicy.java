package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @param member 회원
     * @param price 지불 금액
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
