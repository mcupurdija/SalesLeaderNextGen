package com.intelisale.core.di.base;

public interface BaseComponent<T> {

    void inject(T target);
}
