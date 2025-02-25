package com.nace;

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
public class IntegrationTest {
    @Autowired
    private NaceService service;

    @Autowired
    private NaceRepository repository;

    @Test
    public void saveLoadTest() {
        long id = 1L;

        NaceData data = new NaceData();
        data.setOrder(id);
        data.setLevel(1);
        data.setDescription("test descriptions");

        long cntBeforeSave = repository.count();

        service.save(data);

        long cntAfterSave = repository.count();

        Assertions.assertEquals(cntBeforeSave + 1, cntAfterSave);

        NaceData loaded = service.getById(id);
        Assertions.assertNotNull(loaded);

        Assertions.assertEquals(data.getOrder(), loaded.getOrder());
        Assertions.assertEquals(data.getLevel(), loaded.getLevel());
        Assertions.assertEquals(data.getDescription(), loaded.getDescription());
    }
}
