package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원이 저장소에 저장
    Optional<Member> findById(Long id); // findById로 id 찾아오기
    Optional<Member> findByName(String name); //findByName으로 name 찾아오기
    List<Member> findAll(); //지금까지 저장된 모든 리스트를 반환
}
