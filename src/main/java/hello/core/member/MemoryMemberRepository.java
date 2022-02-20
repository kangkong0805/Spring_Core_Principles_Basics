package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();   // 회원 저장소

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);  // 회원 저장소에 회원 정보 추가 ( key: 회원 아이디, value: 회원정보 )
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); // 회원 아이디에 해당하는 회원정보 반환
    }
}
