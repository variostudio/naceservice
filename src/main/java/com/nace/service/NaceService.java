package com.nace.service;

import com.nace.db.model.NaceEntity;
import com.nace.db.repository.NaceRepository;
import com.nace.dto.NaceData;
import com.nace.util.ConversionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NaceService {
    @Autowired
    private NaceRepository repository;

    @Cacheable("nace")
    public NaceData getById(Long id) {
        if (id == null || id < 0) {
            return null;
        } else {
            Optional<NaceEntity> nace = repository.findById(id);
            if (!nace.isPresent()) {
                return null;
            }
            NaceEntity entity = nace.get();

            return ConversionUtil.toData(entity);
        }
    }

    public NaceData save(NaceData data) {
        NaceEntity nace = ConversionUtil.toEntity(data);

        NaceEntity saved = repository.save(nace);

        return ConversionUtil.toData(saved);
    }
}
