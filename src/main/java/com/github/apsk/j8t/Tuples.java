package com.github.apsk.j8t;

public class Tuples {
    public static <T1,T2> Tuple2<T1,T2> tuple(T1 val1, T2 val2) {
        return new Tuple2<>(val1, val2);
    }
    public static <T1,T2,T3> Tuple3<T1,T2,T3> tuple(T1 val1, T2 val2, T3 val3) {
        return new Tuple3<>(val1, val2, val3);
    }
    public static <T1,T2,T3,T4> Tuple4<T1,T2,T3,T4> tuple(T1 val1, T2 val2, T3 val3, T4 val4) {
        return new Tuple4<>(val1, val2, val3, val4);
    }
    public static <T1,T2,T3,T4,T5> Tuple5<T1,T2,T3,T4,T5> tuple(T1 val1, T2 val2, T3 val3, T4 val4, T5 val5) {
        return new Tuple5<>(val1, val2, val3, val4, val5);
    }
    public static <T1,T2,T3,T4,T5,T6> Tuple6<T1,T2,T3,T4,T5,T6> tuple(
        T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6
    ) {
        return new Tuple6<>(val1, val2, val3, val4, val5, val6);
    }
    public static <T1,T2,T3,T4,T5,T6,T7> Tuple7<T1,T2,T3,T4,T5,T6,T7> tuple(
        T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6, T7 val7
    ) {
        return new Tuple7<>(val1, val2, val3, val4, val5, val6, val7);
    }
    public static <T1,T2,T3,T4,T5,T6,T7,T8> Tuple8<T1,T2,T3,T4,T5,T6,T7,T8> tuple(
        T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6, T7 val7, T8 val8
    ) {
        return new Tuple8<>(val1, val2, val3, val4, val5, val6, val7, val8);
    }
    public static <T1,T2,T3,T4,T5,T6,T7,T8,T9> Tuple9<T1,T2,T3,T4,T5,T6,T7,T8,T9> tuple(
        T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6, T7 val7, T8 val8, T9 val9
    ) {
        return new Tuple9<>(val1, val2, val3, val4, val5, val6, val7, val8, val9);
    }
    public static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10> Tuple10<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10> tuple(
        T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6,
        T7 val7, T8 val8, T9 val9, T10 val10
    ) {
        return new Tuple10<>(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10);
    }
    public static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11> Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11> tuple(
        T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6,
        T7 val7, T8 val8, T9 val9, T10 val10, T11 val11
    ) {
        return new Tuple11<>(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11);
    }
    public static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12> Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12> tuple(
            T1 val1, T2 val2, T3 val3, T4 val4, T5 val5, T6 val6,
            T7 val7, T8 val8, T9 val9, T10 val10, T11 val11, T12 val12
    ) {
        return new Tuple12<>(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
    }
}
