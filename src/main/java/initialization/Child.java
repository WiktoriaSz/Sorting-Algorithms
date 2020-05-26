package initialization;

public class Child extends Parent {

    int someInt = 3;
    int secondInt = 4;

    public Child() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Child{" +
                "someInt=" + someInt +
                ", secondInt=" + secondInt +
                '}';
    }
}
