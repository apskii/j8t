package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple4<A,B,C,D> {
    @FunctionalInterface
    public static interface Fun<A,B,C,D,R> {
        R apply(A arg1, B arg2, C arg3, D arg4);
    }

    public A $1;
    public B $2;
    public C $3;
    public D $4;

    public Tuple4(A $1, B $2, C $3, D $4) {
        this.$1 = $1;
        this.$2 = $2;
        this.$3 = $3;
        this.$4 = $4;
    }

    public <R> R unpack(Fun<A,B,C,D,R> f) {
        return f.apply($1, $2, $3, $4);
    }

    public <AX,BX,CX,DX> Tuple4<AX,BX,CX,DX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC,
        Function<D,DX> fD
    ) {
        return new Tuple4<>(
            fA.apply($1),
            fB.apply($2),
            fC.apply($3),
            fD.apply($4)
        );
    }
}