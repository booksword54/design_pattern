package structual.filter.code.filter;

import structual.filter.code.filter.abstract_filter.Filter;
import structual.filter.code.object.Person;

import java.util.List;

public class OrFilter implements Filter {

    private Filter filter;
    private Filter otherFilter;

    public OrFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetFilter(List<Person> persons) {
        List<Person> firstCriteriaItems = filter.meetFilter(persons);
        List<Person> otherCriteriaItems = otherFilter.meetFilter(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
