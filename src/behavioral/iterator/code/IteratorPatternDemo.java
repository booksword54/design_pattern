package behavioral.iterator.code;

import behavioral.iterator.code.object.NameContainer;
import behavioral.iterator.code.iterator.Iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameContainer namesRepository = new NameContainer();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

    }
}