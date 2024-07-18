package structual.filter.code.filter;

import structual.filter.code.filter.abstract_filter.Filter;
import structual.filter.code.object.Person;

import java.util.ArrayList;
import java.util.List;

public class FilterSingle implements Filter {
    @Override
    public List<Person> meetFilter(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;    }
}
