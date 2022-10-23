import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String currentCityOfResidence;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, currentCityOfResidence);
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }


    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return currentCityOfResidence != null;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCurrentCityOfResidence() {
        return currentCityOfResidence;
    }

    public void setCurrentCityOfResidence(String currentCityOfResidence) {
        this.currentCityOfResidence = currentCityOfResidence;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setCurrentCityOfResidence(currentCityOfResidence);
    }

    @Override
    public String toString() {
        return name;
    }
}