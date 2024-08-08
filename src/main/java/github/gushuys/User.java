package github.gushuys;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUser() {
        return String.format("Имя: %s, возраст: %d", name, age);
    }

}
