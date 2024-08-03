public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.a = 5;
        triangle.b = 12;
        triangle.c = 8;

        System.out.println("Площадь данного треугольника: " + triangle.area());
        System.out.printf("Округлённо ~~ %.1f",triangle.area());


    }
}