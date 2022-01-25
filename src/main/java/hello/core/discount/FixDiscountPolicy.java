package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;    // 1000원 고정 금액 할인

    @Override
    public int discount(Member member, int price){

        // 고객이 VIP이면 할인 적용
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else {
            return 0;
        }
    }

}
