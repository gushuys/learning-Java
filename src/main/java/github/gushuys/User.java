package github.gushuys;

public abstract class User {
    private String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUser() {
        return String.format("Имя: %s, возраст: %d", name, getAge());
    }

    @Override
    public String toString() {
        return getUser();
    }

    public abstract int getAge();
}