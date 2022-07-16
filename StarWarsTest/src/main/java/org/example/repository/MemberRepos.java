package org.example.repository;

import org.example.domain.Member;
import java.util.Collection;

public interface MemberRepos {

    Collection<org.example.domain.Member> getAll();



    public Member createMember(Member member);



    public void deleteAll();


    Member getMember(Member member);
}
