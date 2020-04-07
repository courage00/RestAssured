package com.example.demo.service.impl;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        member.setMid(UUID.randomUUID().toString().replaceAll("-", ""));
        member.setCreateTime(new Date());
        memberRepository.save(member);
        return member;
    }

}
