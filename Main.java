package person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Id c1 = new Id("35202");
        DateOfBirth d1 = new DateOfBirth(new Date(2003, 7, 19));
        PersonInfo p1 = new PersonInfo("Ahmad", 19, d1, c1);

        PersonInfo p2 = p1.clone();
        System.out.println(p1);
        System.out.println(p2);
    }
}
