package com.yexuejc.util.redis.service;

import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.yexuejc.util.redis.service
 * @Description:
 * @author: maxf
 * @date: 2018/1/8 13:28
 */
public abstract class RedisDefSrvImpl implements RedisSrv {

    @Override
    public List<Map<Object, Object>> getRedisAll() {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4Key(String key) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4PayPwd(String mobile) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4AddBankCard(String mobile) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4AddDepositCard(String mobile) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4Cashout(String mobile) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4signUp(String mobile) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4LoginPwd(String mobile) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4Consumer(String mobile) {
        return null;
    }

    @Override
    public Map<Object, Object> getRedis4Admin(String mobile) {
        return null;
    }
}