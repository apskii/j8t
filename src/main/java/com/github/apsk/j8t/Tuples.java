package com.github.apsk.j8t;

public class Tuples {
    public static <A,B> Tuple2<A,B> tuple(A val1, B val2) {
        return new Tuple2<>(val1, val2);
    }
    public static <A,B,C> Tuple3<A,B,C> tuple(A val1, B val2, C val3) {
        return new Tuple3<>(val1, val2, val3);
    }
    public static <A,B,C,D> Tuple4<A,B,C,D> tuple(A val1, B val2, C val3, D val4) {
        return new Tuple4<>(val1, val2, val3, val4);
    }
    public static <A,B,C,D,E> Tuple5<A,B,C,D,E> tuple(A val1, B val2, C val3, D val4, E val5) {
        return new Tuple5<>(val1, val2, val3, val4, val5);
    }
    public static <A,B,C,D,E,F> Tuple6<A,B,C,D,E,F> tuple(
        A val1, B val2, C val3, D val4, E val5, F val6
    ) {
        return new Tuple6<>(val1, val2, val3, val4, val5, val6);
    }
    public static <A,B,C,D,E,F,G> Tuple7<A,B,C,D,E,F,G> tuple(
        A val1, B val2, C val3, D val4, E val5, F val6, G val7
    ) {
        return new Tuple7<>(val1, val2, val3, val4, val5, val6, val7);
    }
    public static <A,B,C,D,E,F,G,H> Tuple8<A,B,C,D,E,F,G,H> tuple(
        A val1, B val2, C val3, D val4, E val5, F val6, G val7, H val8
    ) {
        return new Tuple8<>(val1, val2, val3, val4, val5, val6, val7, val8);
    }
}
