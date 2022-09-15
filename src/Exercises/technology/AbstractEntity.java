package Exercises.technology;

public abstract class AbstractEntity {
    private int id;

    public AbstractEntity(int id) {
        this.id = id;
    }

    public int createId() {
        return this.id += 1;
    }

    public int getId() {
        return id;
    }
}
