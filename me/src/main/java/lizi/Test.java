package lizi;

public class Test {
    public static void main(String[] args) {
        Base base = new Derived();
        base.f();
        base.g();
        System.out.println("first commit");
    }
}
