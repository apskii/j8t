package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple6<A,B,C,D,E,F> {
    @FunctionalInterface
    public static interface Fun<A,B,C,D,E,F,R> {
        R apply(A arg1, B arg2, C arg3, D arg4, E arg5, F arg6);
    }

    public A $1;
    public B $2;
    public C $3;
    public D $4;
    public E $5;
    public F $6;

    public Tuple6(A $1, B $2, C $3, D $4, E $5, F $6) {
        this.$1 = $1;
        this.$2 = $2;
        this.$3 = $3;
        this.$4 = $4;
        this.$5 = $5;
        this.$6 = $6;
    }

    public <R> R unpack(Fun<A,B,C,D,E,F,R> f) {
        return f.apply($1, $2, $3, $4, $5, $6);
    }

    public <AX,BX,CX,DX,EX,FX> Tuple6<AX,BX,CX,DX,EX,FX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC,
        Function<D,DX> fD,
        Function<E,EX> fE,
        Function<F,FX> fF
    ) {
        return new Tuple6<>(
            fA.apply($1),
            fB.apply($2),
            fC.apply($3),
            fD.apply($4),
            fE.apply($5),
            fF.apply($6)
        );
    }
}