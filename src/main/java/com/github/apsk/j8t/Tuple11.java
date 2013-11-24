package com.github.apsk.j8t;

public class Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11> {
    @FunctionalInterface
    public static interface Fun<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R> {
        R apply(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8, T9 arg9, T10 arg10, T11 arg11);
    }

    public T1 val1;
    public T2 val2;
    public T3 val3;
    public T4 val4;
    public T5 val5;
    public T6 val6;
    public T7 val7;
    public T8 val8;
    public T9 val9;
    public T10 val10;
    public T11 val11;

    public Tuple11(T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6, T7 val7, T8 val8, T9 val9, T10 val10, T11 val11) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.val5 = val5;
        this.val6 = val6;
        this.val7 = val7;
        this.val8 = val8;
        this.val9 = val9;
        this.val10 = val10;
        this.val11 = val11;
    }

    public <R> R unpack(Fun<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R> f) {
        return f.apply(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11);
    }
}
