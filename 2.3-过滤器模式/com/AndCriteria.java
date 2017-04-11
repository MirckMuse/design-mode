package com.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by S.H.I.E.L.D on 2017/4/11 0011.
 */
public class AndCriteria implements Cirteria{
    private Cirteria cirteria;
    private Cirteria otherCriteria;

    public AndCriteria(Cirteria cirteria, Cirteria otherCriteria) {
        this.cirteria = cirteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCirteria(List<Person> persons) {
        List<Person> firstCriteriaPersons=cirteria.meetCirteria(persons);
        return otherCriteria.meetCirteria(firstCriteriaPersons);
    }
}
