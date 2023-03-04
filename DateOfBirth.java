package person;

import java.util.Date;

public
class DateOfBirth {
    Date date;

    DateOfBirth(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DateOfBirth{" +
                "date=" + date +
                '}';
    }

    @Override
    public DateOfBirth clone() {
        return new DateOfBirth(new Date(date.getTime()));
    }
}
