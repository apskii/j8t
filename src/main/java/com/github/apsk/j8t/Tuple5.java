package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple5<A,B,C,D,E> {
    @FunctionalInterface
    public static interface Fun<A,B,C,D,E,R> {
        R apply(A arg1, B arg2, C arg3, D arg4, E arg5);
    }

    public A val1;
    public B val2;
    public C val3;
    public D val4;
    public E val5;

    public Tuple5(A val1, B val2, C val3, D val4, E val5) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.val5 = val5;
    }

    public <R> R unpack(Fun<A,B,C,D,E,R> f) {
        return f.apply(val1, val2, val3, val4, val5);
    }

    public <AX,BX,CX,DX,EX> Tuple5<AX,BX,CX,DX,EX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC,
        Function<D,DX> fD,
        Function<E,EX> fE
    ) {
        return new Tuple5<>(
            fA.apply(val1),
            fB.apply(val2),
            fC.apply(val3),
            fD.apply(val4),
            fE.apply(val5)
        );
    }
}