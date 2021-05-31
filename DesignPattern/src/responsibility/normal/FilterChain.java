package responsibility.normal;

import java.util.ArrayList;

public class FilterChain {
    private ArrayList<Filter> list;

    FilterChain() {
        list = new ArrayList<>();
    }

    public FilterChain add(Filter filter) {
        list.add(filter);
        return this;
    }

    public boolean doFilter(Msg messMsg) {
        for (Filter filter : list) {
            if (!filter.doFilter(messMsg))
                return false;
        }
        return true;
    }
}
