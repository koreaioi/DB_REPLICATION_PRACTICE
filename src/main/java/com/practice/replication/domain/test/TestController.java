package com.practice.replication.domain.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestMemberRepository testMemberRepository;
    private final TestMemberService testMemberService;

    @PostMapping("/test1")
    public String test1(@RequestBody TestMemberDto dto) {

        testMemberRepository.save(
                TestMember.builder()
                        .email("test1@gmail.com")
                        .password("1234")
                        .build()
        );

        return "SUCCESS!!";
    }

    @GetMapping("/test2")
    public String test2() {

        testMemberService.findTestMember();

        return "조회 성공!!";
    }

}

