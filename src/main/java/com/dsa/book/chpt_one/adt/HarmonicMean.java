package main.java.com.dsa.book.chpt_one.adt;

public class HarmonicMean {
    public static void main(){
        
    }

    public Fraction harmonicMean(Fraction x, Fraction y){
        return x.reciprocal().plus(y.reciprocal()).reciprocal().times(2);
    }
}
