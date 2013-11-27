package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple5<A,B,C,D,E> {
    @FunctionalInterface
    public static interface Fun<A,B,C,D,E,R> {
        R apply(A arg1, B arg2, C arg3, D arg4, E arg5);
    }

    public A $1;
    public B $2;
    public C $3;
    public D $4;
    public E $5;

    public Tuple5(A $1, B $2, C $3, D $4, E $5) {
        this.$1 = $1;
        this.$2 = $2;
        this.$3 = $3;
        this.$4 = $4;
        this.$5 = $5;
    }

    public <R> R unpack(Fun<A,B,C,D,E,R> f) {
        return f.apply($1, $2, $3, $4, $5);
    }

    public <AX,BX,CX,DX,EX> Tuple5<AX,BX,CX,DX,EX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC,
        Function<D,DX> fD,
        Function<E,EX> fE
    ) {
        return new Tuple5<>(
            fA.apply($1),
            fB.apply($2),
            fC.apply($3),
            fD.apply($4),
            fE.apply($5)
        );
    }
}