package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple2<A,B> {
    @FunctionalInterface
    public static interface Fun<A,B,R> {
        R apply(A arg1, B arg2);
    }

    public A val1;
    public B val2;

    public Tuple2(A val1, B val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public <R> R unpack(Fun<A,B,R> f) {
        return f.apply(val1, val2);
    }

    public <AX,BX> Tuple2<AX,BX> map(
        Function<A,AX> fA,
        Function<B,BX> fB
    ) {
        return new Tuple2<>(
            fA.apply(val1),
            fB.apply(val2)
        );
    }
}
