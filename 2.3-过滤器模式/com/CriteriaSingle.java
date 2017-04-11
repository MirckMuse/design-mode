package com.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by S.H.I.E.L.D on 2017/4/11 0011.
 */
public class CriteriaSingle implements Cirteria {
    @Override
    public List<Person> meetCirteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person :
                persons) {
            if (person.getMaritalStatu().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
