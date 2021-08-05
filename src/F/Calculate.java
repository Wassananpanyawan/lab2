package F;

public class Calculate {

    // static method --> non create cbject
   static int sumAdd(int a ,int b){
        int z;
        z =a+b;
        return  z;
    }

    public static void main(String[] args) {
        int numbers;
        numbers = sumAdd(20,30);
        System.out.println(numbers);
    }
}
