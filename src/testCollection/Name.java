package testCollection;

import java.util.Objects;

public class Name implements Comparable {
    private String firstName, lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name name = (Name) obj;
            return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();    //先equals后才会调用hashCode，因此只对比firstName即可
    }

    //重写compareTo方法用于排序
    @Override
    public int compareTo(Object o) {
        Name n = (Name) o;
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
}
