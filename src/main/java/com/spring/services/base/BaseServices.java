
package com.spring.services.base;

import java.util.List;
import java.util.Optional;

public interface BaseServices<T, ID> {


    long count();

    List<T> findAll();

    Optional<T> findById(ID id);

    void save(T t);

    void update(T t);

    void deleteById(ID id);
}
