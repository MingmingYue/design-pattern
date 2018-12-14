package com.design.pattern.interceptingPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmm on 2018/12/14
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
