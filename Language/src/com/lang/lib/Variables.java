package com.lang.lib;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class Variables {
    private static Map<String, Value> var;
    private static final Stack<Map<String, Value>> stack;
    static {
        stack = new Stack<>();
        var = new HashMap<>();
        var.put("E", new NumberValue(Math.E));
    }
    public static void push() {
        stack.push(new HashMap<>(var));
    }
    public static void pop() {
        var = stack.pop();
    }
    public static boolean isExists(String key) {
        return var.containsKey(key);
    }
    public static Value get(String key) {
        if (!isExists(key)) return NumberValue.ZERO;
        return var.get(key);
    }
    public static void set(String key, Value value) {
        var.put(key, value);
    }
}