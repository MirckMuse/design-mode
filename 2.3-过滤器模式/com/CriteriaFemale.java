package com.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by S.H.I.E.L.D on 2017/4/11 0011.
 */
public class CriteriaFemale implements Cirteria {
    @Override
    public List<Person> meetCirteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person :
                persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
