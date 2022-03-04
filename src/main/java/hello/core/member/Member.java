package hello.core.member;

public class Member {

    private Long id;        // 아이디
    private String name;    // 이름
    private Grade grade;   // 등급

    // 생성자
    public Member(Long id, String name, Grade gradee) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // 데이터 접근 및 설정
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade gradle) {
        this.grade = grade;
    }
}
