package main.java.com.dsa.book.chpt_one.ratio;

public class Ratio implements Comparable {
    protected int num;
    protected int den;

    public static final Ratio ZERO = new Ratio();

    private Ratio() {
        this(0, 1);
    }

    public Ratio(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public int compareTo(Object object) {
        if (this == object) {
            return 0;
        } else if (!(object instanceof Ratio)) {
            throw new IllegalArgumentException("Ratio type expected");
        }
        Ratio that = (Ratio) object;

        return (this.num * that.den - that.num * this.den);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        } else if (!(object instanceof Ratio)) {
            return false;
        }
        Ratio that = (Ratio) object;
        normalize(this);
        normalize(that);
        return (this.num * that.den == that.num * this.den);
    }

    private static void normalize(Ratio ratio) {
        if (ratio.num == 0) { // ratio = Ratio.ZERO
            ratio.den = 1;
        } else if (ratio.den < 0) { // change sign of num and den
            ratio.num *= -1;
            ratio.den *= -1;
        }

    }

    @Override
    public String toString() {
        return String.format("%d/%d", num, den);
    }

    public double value() {
        return (double) num / den;
    }
}
