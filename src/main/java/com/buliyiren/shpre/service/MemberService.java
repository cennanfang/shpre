package com.buliyiren.shpre.service;

import com.buliyiren.shpre.model.Member;
import com.buliyiren.shpre.redis.RedisClientTemplate;
import com.buliyiren.shpre.utils.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private RedisClientTemplate redisClientTemplate;

    public void add(Member member) {
        redisClientTemplate.set(member.getId().getBytes(), SerializeUtil.serialize(member));
    }

    public void add(Member member, int ex) {
        redisClientTemplate.setex(member.getId().getBytes(), ex,SerializeUtil.serialize(member));
    }

    public void delete(String id) {

        Long result = redisClientTemplate.delete(id);
        System.out.println(result);
    }

    public Member get(String id) {
        byte[] member = redisClientTemplate.get(id.getBytes());
        return (Member)SerializeUtil.unserialize(member);
    }
}