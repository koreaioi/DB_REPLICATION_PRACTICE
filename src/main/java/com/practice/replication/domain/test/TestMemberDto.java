package com.practice.replication.domain.test;

import lombok.Builder;

@Builder
public record TestMemberDto(
        String email,
        String password
){
}
