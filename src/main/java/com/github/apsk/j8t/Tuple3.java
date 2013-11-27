package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple3<A,B,C> {
    @FunctionalInterface
    public static interface Fun<A,B,C,R> {
        R apply(A arg1, B arg2, C arg3);
    }

    public A $1;
    public B $2;
    public C $3;

    public Tuple3(A $1, B $2, C $3) {
        this.$1 = $1;
        this.$2 = $2;
        this.$3 = $3;
    }

    public <R> R unpack(Fun<A,B,C,R> f) {
        return f.apply($1, $2, $3);
    }

    public <AX,BX,CX> Tuple3<AX,BX,CX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC
    ) {
        return new Tuple3<>(
            fA.apply($1),
            fB.apply($2),
            fC.apply($3)
        );
    }
}
