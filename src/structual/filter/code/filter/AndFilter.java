package structual.filter.code.filter;

import structual.filter.code.filter.abstract_filter.Filter;
import structual.filter.code.object.Person;

import java.util.List;

public class AndFilter implements Filter {

    private Filter filter;
    private Filter otherFilter;

    public AndFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetFilter(List<Person> persons) {
        return otherFilter.meetFilter(filter.meetFilter(persons));
    }
}
