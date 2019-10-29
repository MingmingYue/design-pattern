package com.design.pattern.filterPattern;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zmm on 2018/12/7
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        otherCriteriaItems.stream().filter(ss -> !firstCriteriaItems.contains(ss)).collect(Collectors.toList());

        return firstCriteriaItems;
    }
}