package com.ali.faizan.coding.callback;

import java.util.List;

public interface GenericInterface<T> extends List<T> {
    void setPayload(T o);
}
