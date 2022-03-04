package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;    // 고정 할인 금액

    @Override
    public int discount(Member member, int price) {

        // 고객이 VIP이면 할인 적용
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else {
            return 0;
        }
    }

}
