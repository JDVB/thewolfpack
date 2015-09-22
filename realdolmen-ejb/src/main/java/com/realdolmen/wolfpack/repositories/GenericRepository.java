package com.realdolmen.wolfpack.repositories;

import com.realdolmen.wolfpack.entities.AbstractEntity;
import com.realdolmen.wolfpack.repositories.interfaces.RemoteGenericRepository;

import java.util.List;

/**
 * Created by YDEAX41 on 22/09/2015.
 */
public class GenericRepository<T extends AbstractEntity> implements RemoteGenericRepository<T>{

    protected List<T> entityList;

    public GenericRepository(List<T> entityList) {
        this.entityList = entityList;
    }

    @Override
    public List<T> findAll() {
        return entityList;
    }
}
