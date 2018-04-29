package microservices.boot.socialmultiplication.domain;

/**
 * Created by javiermolinamarcilla on 29/4/18.
 */
public class Multiplication
{
    //Both factors
    private int factorA;
    private int factorB;

    //Result
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        result = factorA * factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", result(A*B)=" + result +
                '}';
    }
}
