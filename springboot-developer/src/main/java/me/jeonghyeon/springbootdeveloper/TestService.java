package me.jeonghyeon.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        List<Member> members = memberRepository.findAll();
        System.out.println(members);
        return  members;
    }
}
