package com.design.pattern.filterPattern;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zmm on 2018/12/7
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = persons.stream().filter(ss -> ss.getGender().equalsIgnoreCase("MALE")).collect(Collectors.toList());
        return malePersons;
    }
}
