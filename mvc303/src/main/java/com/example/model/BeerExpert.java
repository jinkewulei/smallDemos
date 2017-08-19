package com.example.model;
import java.util.*;

/**
 * Created by william on 16/7/19.
 */

public class BeerExpert {
    public List getBrands(String color) {
        List brands = new ArrayList();

        if (color.equals("amber")) {
            brands.add("Jack Anber");
            brands.add("Red Mouse");
        }
        else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
