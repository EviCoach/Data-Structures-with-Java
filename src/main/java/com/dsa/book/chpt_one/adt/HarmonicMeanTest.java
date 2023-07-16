package com.dsa.book.chpt_one.adt;

public class HarmonicMeanTest {
    public Fraction harmonicMean(Fraction x, Fraction y){
        return x.reciprocal().plus(y.reciprocal()).reciprocal().times(2);
    }
}
