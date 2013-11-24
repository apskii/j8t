package com.github.apsk.j8t;

public class Tuple2<T1,T2> {
    @FunctionalInterface
    public static interface Fun<T1,T2,R> {
        R apply(T1 arg1, T2 arg2);
    }

    public T1 val1;
    public T2 val2;

    public Tuple2(T1 val1, T2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public <R> R unpack(Fun<T1,T2,R> f) {
        return f.apply(val1, val2);
    }
}
