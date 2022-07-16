package org.example.controller;


import org.example.domain.Member;
import org.example.service.MemberService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/members")
public class MemCon {

   private MemberService memberservice;

   public MemCon (MemberService memberservice) {
       this.memberservice = memberservice;
   }

    @GetMapping
    public Collection<Member> getMember() {
       return memberservice.getAllMembers();
    }

    @PostMapping
    public void setMember(@RequestBody Member member) {
       memberservice.createMember(member);
    }

   /* @PostMapping
    public void deleteAll(@RequestBody Member member) {
       memberservice.deleteAll();
    }*/    //в базе однажды - в базе навсегда


}
