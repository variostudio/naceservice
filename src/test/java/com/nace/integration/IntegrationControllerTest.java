package com.nace.integration;

import com.nace.db.repository.NaceRepository;
import com.nace.dto.NaceData;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class IntegrationControllerTest {
    @Autowired
    private TestRestTemplate rest;

    @LocalServerPort
    private int port;

    @Autowired
    private NaceRepository repository;

    @Test
    public void saveLoadTest() {
        NaceData data = new NaceData();
        data.setLevel(1);
        data.setDescription("test descriptions");

        long cntBeforeSave = repository.count();

        NaceData response = rest.postForObject("http://localhost:" + port + "/nace/api/orders/persist", data, NaceData.class);

        long cntAfterSave = repository.count();

        Assertions.assertEquals(cntBeforeSave + 1, cntAfterSave);
        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getOrder());

        NaceData loaded = rest.getForObject("http://localhost:" + port + "/nace/api/orders/" + response.getOrder(), NaceData.class);

        Assertions.assertNotNull(loaded);
        
        Assertions.assertEquals(data.getLevel(), loaded.getLevel());
        Assertions.assertEquals(data.getDescription(), loaded.getDescription());
    }
}
