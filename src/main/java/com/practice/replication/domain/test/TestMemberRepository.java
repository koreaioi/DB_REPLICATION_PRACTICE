package com.practice.replication.domain.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMemberRepository extends JpaRepository<TestMember, Long> {
}
