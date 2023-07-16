package com.dsa.book.chpt_one.adt;

public interface Fraction {
    Fraction plus(Fraction fraction);
    Fraction times(Integer integer);
    Fraction times(Fraction fraction);
    Fraction reciprocal();
    double value();
}
