package com.nace.integration;

import com.nace.db.repository.NaceRepository;
import com.nace.dto.NaceData;
import com.nace.service.NaceService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IntegrationServiceTest {
    @Autowired
    private NaceService service;

    @Autowired
    private NaceRepository repository;

    @Test
    public void saveLoadTest() {
        NaceData data = new NaceData();
        data.setLevel(1);
        data.setDescription("test descriptions");

        long cntBeforeSave = repository.count();

        NaceData saved = service.save(data);

        long cntAfterSave = repository.count();

        Assertions.assertEquals(cntBeforeSave + 1, cntAfterSave);
        Assertions.assertNotNull(saved);
        Assertions.assertNotNull(saved.getOrder());

        NaceData loaded = service.getById(saved.getOrder());
        Assertions.assertNotNull(loaded);

        Assertions.assertEquals(data.getLevel(), loaded.getLevel());
        Assertions.assertEquals(data.getDescription(), loaded.getDescription());
    }
}
