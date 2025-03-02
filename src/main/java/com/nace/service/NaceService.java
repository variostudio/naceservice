package com.nace.service;

import com.nace.db.model.NaceEntity;
import com.nace.db.repository.NaceRepository;
import com.nace.dto.NaceData;
import com.nace.util.ConversionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class NaceService {
    @Autowired
    private NaceRepository repository;

    public Mono<NaceData> getById(Long id) {
        if (id == null || id < 0) {
            return Mono.empty();
        } else {
            return repository.findById(id).map(ConversionUtil::toData);
        }
    }

    public Mono<NaceData> save(NaceData data) {
        NaceEntity nace = ConversionUtil.toEntity(data);

        return repository.save(nace).map(ConversionUtil::toData);
    }
}
