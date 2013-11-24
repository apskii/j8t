package com.github.apsk.j8t;

public class Tuple3<T1,T2,T3> {
    @FunctionalInterface
    public static interface Fun<T1,T2,T3,R> {
        R apply(T1 arg1, T2 arg2, T3 arg3);
    }

    public T1 val1;
    public T2 val2;
    public T3 val3;

    public Tuple3(T1 val1, T2 val2, T3 val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public <R> R unpack(Fun<T1,T2,T3,R> f) {
        return f.apply(val1, val2, val3);
    }
}
