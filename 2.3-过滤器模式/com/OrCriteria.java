package com.Singleton;

import java.util.List;

/**
 * Created by S.H.I.E.L.D on 2017/4/11 0011.
 */
public class OrCriteria implements Cirteria{
    private Cirteria cirteria;
    private Cirteria otherCirteria;

    public OrCriteria(Cirteria cirteria, Cirteria otherCirteria) {
        this.cirteria = cirteria;
        this.otherCirteria = otherCirteria;
    }

    @Override
    public List<Person> meetCirteria(List<Person> persons) {
        List<Person> firstCriteriaItems=cirteria.meetCirteria(persons);
        List<Person> otherCriteriaItems=otherCirteria.meetCirteria(persons);

        for (Person person :
                otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
