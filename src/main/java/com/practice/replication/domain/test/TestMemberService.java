package com.practice.replication.domain.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestMemberService {

    private final TestMemberRepository testMemberRepository;

    @Transactional(readOnly = true)
    public void findTestMember() {

        Optional<TestMember> findMember = testMemberRepository.findById(1L);

        TestMember testMember = findMember.get();

        System.out.println(testMember.getEmail() + " " + testMember.getPassword());

    }

}
