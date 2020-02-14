package com.ali.faizan.coding;

import java.util.List;

public interface GenericInterface<T> extends List<T> {
    void setPayload(T o);
}
