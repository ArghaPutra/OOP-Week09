public class C implements A, B {
    @Override
    public void displayA() {
        System.out.println("Display A");
    }

    @Override
    public void displayB() {
        System.out.println("Display B");
    }

    public static void main(String[] args) {
        C c = new C();
        c.displayA();   // Memanggil metode dari interface A
        c.displayB();   // Memanggil metode dari interface B
    }
}
