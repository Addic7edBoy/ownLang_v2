package com.lang.lib;

public final class StringValue implements Value {
    private final String val;
    public StringValue(String val) {
        this.val = val;
    }
    @Override
    public double asNumber() {
        try {
            return Double.parseDouble(val);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    @Override
    public String asString() {
        return val;
    }
    @Override
    public String toString() {
        return asString();
    }
}