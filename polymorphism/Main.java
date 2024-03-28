package polymorphism;
public class Main {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 5;
        Math math = new Math();
        System.out.println(math.num());
        System.out.println(math.num(num1, num2));
    }
}