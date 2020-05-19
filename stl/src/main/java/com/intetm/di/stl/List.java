package com.intetm.di.stl;

import java.util.Collection;

public interface List <T> {

    public void add(T object);

    public T get(int i);

    public int getSize();

    public void addAll(Collection<? extends T> collection);
}
