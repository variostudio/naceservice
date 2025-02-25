package com.nace.db.repository;

import com.nace.db.model.NaceEntity;
import org.springframework.data.repository.CrudRepository;

public interface NaceRepository extends CrudRepository<NaceEntity, Long> {
}
