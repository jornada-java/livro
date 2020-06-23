package com.jornadajava;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.eclipse.jnosql.diana.redis.keyvalue.RedisBucketManagerFactory;
import org.eclipse.jnosql.diana.redis.keyvalue.RedisConfiguration;

import jakarta.nosql.keyvalue.BucketManager;

@ApplicationScoped
public class BancoDeDados {

    private static final String BUCKET = "usuarios";

    private RedisConfiguration configuration;

    private RedisBucketManagerFactory managerFactory;

    @PostConstruct
    public void init() {
        configuration = new RedisConfiguration();
        managerFactory = configuration.get();
    }

    @Produces
    public BucketManager getManager() {
        return managerFactory.getBucketManager(BUCKET);

    }

}
