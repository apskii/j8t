package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple2<A,B> {
    @FunctionalInterface
    public static interface Fun<A,B,R> {
        R apply(A arg1, B arg2);
    }

    public A $1;
    public B $2;

    public Tuple2(A $1, B $2) {
        this.$1 = $1;
        this.$2 = $2;
    }

    public <R> R unpack(Fun<A,B,R> f) {
        return f.apply($1, $2);
    }

    public <AX,BX> Tuple2<AX,BX> map(
        Function<A,AX> fA,
        Function<B,BX> fB
    ) {
        return new Tuple2<>(
            fA.apply($1),
            fB.apply($2)
        );
    }
}
