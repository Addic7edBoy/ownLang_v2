package com.lang.lib;

import java.util.Arrays;

public final class ArrayValue implements Value {
    private final Value[] elems;
    public ArrayValue(int size) {
        this.elems = new Value[size];
    }
    public ArrayValue(Value[] elems) {
        this.elems = new Value[elems.length];
        System.arraycopy(elems, 0, this.elems, 0, elems.length);
    }
    public ArrayValue(ArrayValue arr) {
        this(arr.elems);
    }
    public Value get(int ind) {
        return elems[ind];
    }
    public void set(int ind, Value val) {
        elems[ind] = val;
    }
    @Override
    public double asNumber() {
        throw new RuntimeException("Array! = Number");
    }
    @Override
    public String asString() {
        return Arrays.toString(elems);
    }
    @Override
    public String toString() {
        return asString();
    }
}
