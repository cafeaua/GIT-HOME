package ro.sci.revisedSales;

import static ro.sci.revisedSales.Sales.spot;

/*
Created by Sipos Zoltan 19 Sept 2017
This is a sorting program, it uses a bubble sort method, and it uses arrays.
 */
public class Agent {
    String name;
    int team;
    int sales;
    int quota;


    public static void initAgent(int position, int team, String name, int sales, int quota) {
        spot[position] = new Agent();
        spot[position].name = name;
        spot[position].sales = sales;
        spot[position].quota = quota;
    }
}
