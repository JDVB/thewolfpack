package com.realdolmen.wolfpack.repositories.interfaces;

import java.util.List;

/**
 * Created by YDEAX41 on 22/09/2015.
 */
public interface RemoteGenericRepository<T> {
    List<T> findAll();
}
