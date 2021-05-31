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

    public boolean doFilter(Request request, Response response ) {
        if (index >= list.size())
            return false;
        Filter filter = list.get(index);
        index++;
        return filter.doFilter(request, response,this);
    }
}
