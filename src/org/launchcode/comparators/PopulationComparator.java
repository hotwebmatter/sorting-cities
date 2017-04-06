package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by modus on 4/5/17.
 * PopulationComparator - results in sorting by population, from largest to smallest
 */
public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return o1.getPopulation() - o2.getPopulation();
    }
}
