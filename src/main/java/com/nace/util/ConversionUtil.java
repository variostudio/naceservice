package com.nace.util;

import com.nace.db.model.NaceEntity;
import com.nace.dto.NaceData;

public class ConversionUtil {
    public static NaceEntity toEntity(NaceData data) {
        NaceEntity entity = new NaceEntity();
        entity.setOrd(data.getOrd());
        entity.setDescription(data.getDescription());
        entity.setCode(data.getCode());
        entity.setInc(data.getInc());
        entity.setParent(data.getParent());
        entity.setLevel(data.getLevel());
        entity.setAlso(data.getAlso());
        entity.setExcl(data.getExcl());
        entity.setRulings(data.getRulings());
        entity.setRef(data.getRef());

        return entity;
    }

    public static NaceData toData(NaceEntity entity) {
        NaceData data = new NaceData();
        data.setOrd(entity.getOrd());
        data.setDescription(entity.getDescription());
        data.setCode(entity.getCode());
        data.setInc(entity.getInc());
        data.setParent(entity.getParent());
        data.setLevel(entity.getLevel());
        data.setAlso(entity.getAlso());
        data.setExcl(entity.getExcl());
        data.setRulings(entity.getRulings());
        data.setRef(entity.getRef());

        return data;
    }
}
