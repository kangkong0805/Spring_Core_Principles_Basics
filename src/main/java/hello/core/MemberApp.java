package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);  // 회원생성
        memberService.join(member);  // 회원가입

        Member findMember = memberService.findMember(1L);  // 특정 아이디의 회원조회
        System.out.println("new = " + member.getName());  // 생성된 회원의 이름 출력
        System.out.println("find = " + findMember.getName());  // 조회된 회원의 이름 출력
    }
}
