
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction implements Comparable<Fraction>
{
    private int n, d;
    
    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
        this.simplify();
    }
    
    public int getN() { return n; }
    
    public int getD() { return d; }
    
    public int compareTo(Fraction other) {
        return this.getN() * other.getD() - other.getN() * this.getD();
    }
    
    private void simplify() {
        for(int i = n; i > 1; i--) {
            if(n % i == 0 && d % i == 0) {
                n /= i;
                d /= i;
            }
        }
    }
}
