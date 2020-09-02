package com.muffin.web.util;
public interface GenericService<T> {
    Iterable<T> findAll();
    Long count();
    void delete(T t);
    boolean exists(String id);
}
