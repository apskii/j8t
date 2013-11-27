package com.github.apsk.j8t;

public class Tuples {
    public static <A,B> Tuple2<A,B> tuple(A $1, B $2) {
        return new Tuple2<>($1, $2);
    }
    public static <A,B,C> Tuple3<A,B,C> tuple(A $1, B $2, C $3) {
        return new Tuple3<>($1, $2, $3);
    }
    public static <A,B,C,D> Tuple4<A,B,C,D> tuple(A $1, B $2, C $3, D $4) {
        return new Tuple4<>($1, $2, $3, $4);
    }
    public static <A,B,C,D,E> Tuple5<A,B,C,D,E> tuple(A $1, B $2, C $3, D $4, E $5) {
        return new Tuple5<>($1, $2, $3, $4, $5);
    }
    public static <A,B,C,D,E,F> Tuple6<A,B,C,D,E,F> tuple(
        A $1, B $2, C $3, D $4, E $5, F $6
    ) {
        return new Tuple6<>($1, $2, $3, $4, $5, $6);
    }
    public static <A,B,C,D,E,F,G> Tuple7<A,B,C,D,E,F,G> tuple(
        A $1, B $2, C $3, D $4, E $5, F $6, G $7
    ) {
        return new Tuple7<>($1, $2, $3, $4, $5, $6, $7);
    }
    public static <A,B,C,D,E,F,G,H> Tuple8<A,B,C,D,E,F,G,H> tuple(
        A $1, B $2, C $3, D $4, E $5, F $6, G $7, H $8
    ) {
        return new Tuple8<>($1, $2, $3, $4, $5, $6, $7, $8);
    }
}
