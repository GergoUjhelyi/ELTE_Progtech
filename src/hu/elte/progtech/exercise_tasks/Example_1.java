package hu.elte.progtech.exercise_tasks;

/**
 * More information:
 * https://www.baeldung.com/java-pass-by-value-or-pass-by-reference
 */
public class Example_1 {

    public static void main(String[] args) {
        int a = 40;
        add(a, 10);
        System.out.println(a);

        Dog b = new Dog("Pamacs", 2);
        passAYear(b);

        System.out.println("Name:" + b.getName() + " Age:" + b.getAge());
    }

    public static void add(int a, int b) {
        a += b;
    }

    public static void passAYear(Dog f) {
        f.age++;
    }

}
