package game.business;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;
import org.omg.CORBA.DynAnyPackage.Invalid;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void peopleWithSameNameAndMoneyShouldBeEqual() {
        Person person1 = new Person("Person", 1000);
        Person person2 = new Person("Person", 1000);
        assertEquals(person2, person1);
        assertEquals(person2.hashCode(), person1.hashCode());
    }

    @Test
    public void personShouldBeAbleToCreditAmount() {
        Person person = new Person("Person", 100);
        person.credit(100);
        assertEquals(new Person("Person", 200), person);
    }

    @Test(expected = IllegalArgumentException.class)
    public void personShouldThroughExceptionForCreditingNegetiveAmout() {
        Person person = new Person("Person", 100);
        person.credit(-100);
    }

    @Test
    public void personShouldBeAbleToDebitAmount() {
        Person person = new Person("Person", 100);
        person.debit(100);
        assertEquals(new Person("Person", 0), person);
    }

    @Test(expected = IllegalArgumentException.class)
    public void personShouldThroughExceptionForDebitNegetiveAmout() {
        Person person = new Person("Person", 100);
        person.credit(-100);
    }

}
