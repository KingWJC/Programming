/*
 * @Author: KingWJC
 * @Date: 2021-05-31 10:35:54
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-29 15:11:56
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\responsibility\servlet\FilterChain.java
 */
package responsibility.servlet;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> list;
    private int index;

    FilterChain() {
        list = new ArrayList<>();
    }

    public FilterChain add(Filter filter) {
        list.add(filter);
        return this;
    }

    public boolean doNextFilter(Request request, Response response) {
        if (index >= list.size())
            return false;
        Filter filter = list.get(index);
        index++;
        return filter.doFilter(request, response, this);
    }
}
