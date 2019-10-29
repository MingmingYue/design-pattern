package com.design.pattern.filterPattern;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zmm on 2018/12/7
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = persons.stream().filter(ss -> ss.getMaritalStatus().equalsIgnoreCase("SINGLE")).collect(Collectors.toList());
        return singlePersons;
    }
}
