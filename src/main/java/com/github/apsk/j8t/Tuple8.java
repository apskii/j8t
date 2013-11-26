package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple8<A,B,C,D,E,F,G,H> {
    @FunctionalInterface
    public static interface Fun<A,B,C,D,E,F,G,H,R> {
        R apply(A arg1, B arg2, C arg3, D arg4, E arg5, F arg6, G arg7, H arg8);
    }

    public A val1;
    public B val2;
    public C val3;
    public D val4;
    public E val5;
    public F val6;
    public G val7;
    public H val8;

    public Tuple8(A val1, B val2, C val3, D val4, E val5, F val6, G val7, H val8) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.val5 = val5;
        this.val6 = val6;
        this.val7 = val7;
        this.val8 = val8;
    }

    public <R> R unpack(Fun<A,B,C,D,E,F,G,H,R> f) {
        return f.apply(val1, val2, val3, val4, val5, val6, val7, val8);
    }

    public <AX,BX,CX,DX,EX,FX,GX,HX> Tuple8<AX,BX,CX,DX,EX,FX,GX,HX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC,
        Function<D,DX> fD,
        Function<E,EX> fE,
        Function<F,FX> fF,
        Function<G,GX> fG,
        Function<H,HX> fH
    ) {
        return new Tuple8<>(
            fA.apply(val1),
            fB.apply(val2),
            fC.apply(val3),
            fD.apply(val4),
            fE.apply(val5),
            fF.apply(val6),
            fG.apply(val7),
            fH.apply(val8)
        );
    }
}
