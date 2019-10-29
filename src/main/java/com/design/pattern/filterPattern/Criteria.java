package com.design.pattern.filterPattern;

import java.util.List;

/**
 * Created by zmm on 2018/12/7
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}