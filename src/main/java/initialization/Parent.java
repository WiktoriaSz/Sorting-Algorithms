package initialization;

public class Parent {

    int parentIntNotInitialized;
    OutsideInheritance obj;
    char initializedChar = 'c';
    static String str = "Static Parent String field";

    public Parent() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentIntNotInitialized=" + parentIntNotInitialized +
                ", obj=" + obj +
                ", initializedChar=" + initializedChar +
                '}';
    }
}
