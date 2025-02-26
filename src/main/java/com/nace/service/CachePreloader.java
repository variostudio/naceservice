package com.nace.service;

import com.nace.db.model.NaceEntity;
import com.nace.db.repository.NaceRepository;
import com.nace.util.ConversionUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class CachePreloader {
    @Autowired
    private NaceRepository repository;

    @Autowired
    CacheManager cacheManager;

    @PostConstruct
    public void preload() {
        Cache cache = cacheManager.getCache("nace");
        for (NaceEntity entity : repository.findAll()) {
            cache.put(entity.getOrder(), ConversionUtil.toData(entity));
        }
    }
}
