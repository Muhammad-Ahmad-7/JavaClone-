package person;

public class Id {
    String id;

    Id(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public Id clone() {
        return new Id(this.id);
    }
}
