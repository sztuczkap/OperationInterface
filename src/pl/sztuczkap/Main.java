package pl.sztuczkap;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        // przyjmujemy i zwracamy ten sam tym pomnozony przez 2
        UnaryOperator<Integer> unaryOperator = numer -> numer * 2;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = Integer::sum; // (i1, i2) -> i1+ i2;
        System.out.println(binaryOperator.apply(10, 15));
    }
}
