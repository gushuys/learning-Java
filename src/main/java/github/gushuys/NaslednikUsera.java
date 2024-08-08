package github.gushuys;

public class NaslednikUsera extends User {
    public NaslednikUsera(String name, int age) {
        super(name, age);
    }

    @Override
    public int getAge() {
        return this.age;
    }

}
