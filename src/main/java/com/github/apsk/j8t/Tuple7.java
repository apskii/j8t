package com.github.apsk.j8t;

import java.util.function.Function;

public class Tuple7<A,B,C,D,E,F,G> {
    @FunctionalInterface
    public static interface Fun<A,B,C,D,E,F,G,R> {
        R apply(A arg1, B arg2, C arg3, D arg4, E arg5, F arg6, G arg7);
    }

    public A $1;
    public B $2;
    public C $3;
    public D $4;
    public E $5;
    public F $6;
    public G $7;

    public Tuple7(A $1, B $2, C $3, D $4, E $5, F $6, G $7) {
        this.$1 = $1;
        this.$2 = $2;
        this.$3 = $3;
        this.$4 = $4;
        this.$5 = $5;
        this.$6 = $6;
        this.$7 = $7;
    }

    public <R> R unpack(Fun<A,B,C,D,E,F,G,R> f) {
        return f.apply($1, $2, $3, $4, $5, $6, $7);
    }

    public <AX,BX,CX,DX,EX,FX,GX> Tuple7<AX,BX,CX,DX,EX,FX,GX> map(
        Function<A,AX> fA,
        Function<B,BX> fB,
        Function<C,CX> fC,
        Function<D,DX> fD,
        Function<E,EX> fE,
        Function<F,FX> fF,
        Function<G,GX> fG
    ) {
        return new Tuple7<>(
            fA.apply($1),
            fB.apply($2),
            fC.apply($3),
            fD.apply($4),
            fE.apply($5),
            fF.apply($6),
            fG.apply($7)
        );
    }
}
