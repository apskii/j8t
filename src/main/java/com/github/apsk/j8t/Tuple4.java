package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple4<A,B,C,D> {
    @FunctionalInterface
    public static interface Fun<A,B,C,D,R> {
        R apply(A arg1, B arg2, C arg3, D arg4);
    }

    public A val1;
    public B val2;
    public C val3;
    public D val4;

    public Tuple4(A val1, B val2, C val3, D val4) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
    }

    public <R> R unpack(Fun<A,B,C,D,R> f) {
        return f.apply(val1, val2, val3, val4);
    }

    public <AX,BX,CX,DX> Tuple4<AX,BX,CX,DX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC,
        Function<D,DX> fD
    ) {
        return new Tuple4<>(
            fA.apply(val1),
            fB.apply(val2),
            fC.apply(val3),
            fD.apply(val4)
        );
    }
}