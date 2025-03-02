package com.nace.db.repository;

import com.nace.db.model.NaceEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface NaceRepository extends ReactiveCrudRepository<NaceEntity, Long> {
}
