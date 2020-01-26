package com.lang.lib;

public final class NumberValue implements Value {
    public static final NumberValue ZERO = new NumberValue(0);
    private final double val;
    public NumberValue(boolean val) {
        this.val = val ? 1 : 0;
    }
    public NumberValue(double val) {
        this.val = val;
    }
    @Override
    public double asNumber() {
        return val;
    }
    @Override
    public String asString() {
        return Double.toString(val);
    }
    @Override
    public String toString() {
        return asString();
    }
}