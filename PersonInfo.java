package person;

public class PersonInfo {
    String name;
    DateOfBirth date;
    int age;
    Id c1;

    PersonInfo(String name, int age, DateOfBirth date, Id c1) {
        this.name = name;
        this.age = age;
        this.date = date;
        this.c1 = c1;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", c1=" + c1 +
                '}';
    }

    @Override
    public PersonInfo clone() {
        DateOfBirth date3 = this.date.clone();
        Id c1 = this.c1.clone();
        return new PersonInfo(this.name, this.age, date3, c1);
    }
}

