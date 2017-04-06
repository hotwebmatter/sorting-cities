package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by modus on 4/5/17.
 * StateComparator results in alphabetical sorting by state
 */
public class StateComparator implements Comparator<City> {

@Override
public int compare(City o1, City o2) {
        return o1.getState().compareTo(o2.getState());
        }
}
