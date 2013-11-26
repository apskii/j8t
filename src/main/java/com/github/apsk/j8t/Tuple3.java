package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple3<A,B,C> {
    @FunctionalInterface
    public static interface Fun<A,B,C,R> {
        R apply(A arg1, B arg2, C arg3);
    }

    public A val1;
    public B val2;
    public C val3;

    public Tuple3(A val1, B val2, C val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public <R> R unpack(Fun<A,B,C,R> f) {
        return f.apply(val1, val2, val3);
    }

    public <AX,BX,CX> Tuple3<AX,BX,CX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC
    ) {
        return new Tuple3<>(
            fA.apply(val1),
            fB.apply(val2),
            fC.apply(val3)
        );
    }
}
