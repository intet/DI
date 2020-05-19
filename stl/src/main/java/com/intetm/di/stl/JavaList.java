package com.intetm.di.stl;

import java.util.ArrayList;
import java.util.Collection;

public class JavaList<T> implements List<T> {
    private java.util.List<T> arr = new ArrayList<T>();

    public void add(T object) {
      arr.add(object);
    }

    public T get(int i) {
        return arr.get(i);
    }

    public int getSize() {
        return arr.size();
    }

    public void addAll(Collection<? extends T> collection) {
        arr.addAll(collection);
    }


}
