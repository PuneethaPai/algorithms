package game.business;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Objects;

public class Person {
    private final String name;
    private double amount;

    public Person(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person1 = (Person) o;
        return Double.compare(person1.amount, amount) == 0 &&
                Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    public void credit(double amount) throws IllegalArgumentException {
        if(amount < 0){
            throw new IllegalArgumentException("Credit Amount Can not be negative value");
        }
        this.amount += amount;
    }

    public void debit(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Debit Amount Can not be negative value");
        }
        this.amount -= amount;
    }
}
