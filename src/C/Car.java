package C;

public class Car {
    private String name = "Honda City";
    private String model = "2021";
    private String color = "Blue";
    private  int tyres = 4;

    void method1(){
        System.out.println("This car drive Method1");
    }
    void method2(){
        System.out.println("This car drive Method2");
    }
    void method3(){
        System.out.println("This car drive Method3");
    }

    public static void main(String[] args) {
        Car Mitsu = new Car();
        Mitsu.method1();
        Mitsu.method2();
        Mitsu.method3();
    }
}
