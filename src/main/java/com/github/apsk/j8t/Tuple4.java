package com.github.apsk.j8t;

public class Tuple4<T1,T2,T3,T4> {
    @FunctionalInterface
    public static interface Fun<T1,T2,T3,T4,R> {
        R apply(T1 arg1, T2 arg2, T3 arg3, T4 arg4);
    }

    public T1 val1;
    public T2 val2;
    public T3 val3;
    public T4 val4;

    public Tuple4(T1 val1, T2 val2, T3 val3, T4 val4) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
    }

    public <R> R unpack(Fun<T1,T2,T3,T4,R> f) {
        return f.apply(val1, val2, val3, val4);
    }
}