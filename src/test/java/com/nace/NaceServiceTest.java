package com.nace;

import com.nace.db.model.NaceEntity;
import com.nace.db.repository.NaceRepository;
import com.nace.dto.NaceData;
import com.nace.service.NaceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class NaceServiceTest {
    @Mock
    private NaceRepository repository;

    @InjectMocks
    private NaceService service;

    @Test
    void testGetById() {
        Long id = 1L;
        NaceEntity ent = new NaceEntity();

        ent.setOrd(id);
        ent.setRef("test ref");
        ent.setAlso("test also");
        ent.setRulings("test rulings");
        //....

        Mockito.when(repository.findById(Mockito.eq(id))).thenReturn(Mono.just(ent));

        NaceData data = service.getById(id).block();
        Assertions.assertEquals(ent.getOrd(), data.getOrd());
        Assertions.assertEquals(ent.getRef(), data.getRef());
        Assertions.assertEquals(ent.getAlso(), data.getAlso());
        Assertions.assertEquals(ent.getRulings(), data.getRulings());
        //.....
    }

    @Test
    void testGetByIdNotFound() {
        Long id = -1L;

        NaceData data = service.getById(id).block();

        Assertions.assertNull(data);
    }
}
