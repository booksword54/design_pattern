package structual.filter.code.filter.abstract_filter;

import structual.filter.code.object.Person;

import java.util.List;

public interface Filter {
    List<Person> meetFilter(List<Person> persons);
}
