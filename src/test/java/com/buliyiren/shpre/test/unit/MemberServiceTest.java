package com.buliyiren.shpre.test.unit;

import com.buliyiren.shpre.Contants;
import com.buliyiren.shpre.model.Member;
import com.buliyiren.shpre.model.User;
import com.buliyiren.shpre.service.MemberService;
import com.buliyiren.shpre.service.UserService;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenkaihua on 15-9-15.
 */
public class MemberServiceTest extends  BaseUnitTest{



    @Autowired
    MemberService memberService;


    @Test
    public void testAdd(){
//        Member member = new Member();
//        member.setId("1");
//        member.setNickname("guoxiaoming");
//        memberService.add(member);
        Member member = new Member();
        member.setId("2");
        member.setNickname("guoxiaoming");
        memberService.add(member, Contants.REDIS_EXPIRE);
    }

    @Test
    public void testFind(){
        Member member = this.memberService.get("2");

        System.out.println(member.getId() + "   " + member.getNickname());
    }

    @Test
    public void testDelete() {
        memberService.delete("2");
    }
}
