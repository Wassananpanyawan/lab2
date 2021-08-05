package D;

public class ClassRun {
    public static void main(String[] args) {
        Ball myball1 = new Ball();
        Ball myball2 = new Ball();

        myball1.name = "Soccer Ball";
        myball1.color = "Brown";

        myball2.name = "Basketball";
        myball2.color = "Blue";

        System.out.println(myball1.name);
        System.out.println(myball1.color);
        myball1.deflate();

        System.out.println(myball2.name);
        System.out.println(myball2.color);
        myball2.inflate();
    }
}