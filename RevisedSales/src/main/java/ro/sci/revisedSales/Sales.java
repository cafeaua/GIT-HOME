package ro.sci.revisedSales;

import java.lang.reflect.Array;

public class Sales extends Agent {

    static Agent[] spot = new Agent[20];

    public static void main(String[] args) {
        initAgent(0, 1, "Ana", 200, 70);
        initAgent(1, 1, "Oli", 100, 70);
        initAgent(2, 1, "Mo", 115, 90);

        initAgent(3, 2, "Jack", 233, 50);
        initAgent(4, 2, "Daniel", 180, 123);
        initAgent(5, 2, "Hog", 90, 164);

        initAgent(6, 3, "Laci", 373, 20);
        initAgent(7, 3, "Pali", 172, 45);
        initAgent(8, 3, "Karcsi", 98, 345);

        System.out.println(spot[1].quota*spot[1].sales);
    }



}
