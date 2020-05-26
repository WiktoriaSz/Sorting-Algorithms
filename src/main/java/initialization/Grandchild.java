package initialization;

public class Grandchild extends Child {

    int someInt = 1;
    int secondInt = 2;
    int combinedInt = super.secondInt * secondInt;

    public Grandchild() {
        System.out.println(this);
        System.out.println("Child's field secondInt accessed from Grandchild: " + super.secondInt);
        System.out.println("Parent's field initializedChar accessed from Grandchild: " + super.initializedChar);

    }

    @Override
    public String toString() {
        return "Grandchild{" +
                "someInt=" + someInt +
                ", secondInt=" + secondInt +
                ", combinedInt=" + combinedInt +
                '}';
    }
}
