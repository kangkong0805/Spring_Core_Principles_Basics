package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        memberRepository.save(member);  // 회원가입 시 회원저장
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId); // 회원정보 반환
    }
}
