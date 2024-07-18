package structual.filter.code;

import structual.filter.code.filter.*;
import structual.filter.code.filter.abstract_filter.Filter;
import structual.filter.code.object.Person;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Filter male = new FilterMale();
        Filter female = new FilterFemale();
        Filter single = new FilterSingle();
        Filter singleMale = new AndFilter(single, male);
        Filter singleOrFemale = new OrFilter(single, female);

        System.out.println("Males: ");
        printPersons(male.meetFilter(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetFilter(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetFilter(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetFilter(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                                       + ", Gender : " + person.getGender()
                                       + ", Marital Status : " + person.getMaritalStatus()
                                       + " ]");
        }
    }

}
