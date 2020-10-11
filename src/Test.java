public class Test {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();

        System.out.println("Telewizor włączony: " + tv1.showStatus());
        tv1.turnOn();
        System.out.println("Telewizor włączony: " + tv1.showStatus());
        tv1.turnOff();
        System.out.println("Telewizor włączony: " + tv1.showStatus());

    }
}
