package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);
        printCities(cities);

        System.out.println();

        // Use state comparator here
        StateComparator comparator2 = new StateComparator();
        cities.sort(comparator2);
        printCities(cities);

        System.out.println();


        // Use population comparator here
        PopulationComparator comparator3 = new PopulationComparator();
        cities.sort(comparator3);
        printCities(cities);

        System.out.println();

        // Use area comparator here
        AreaComparator comparator4 = new AreaComparator();
        cities.sort(comparator4);
        printCities(cities);

        System.out.println();



    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
