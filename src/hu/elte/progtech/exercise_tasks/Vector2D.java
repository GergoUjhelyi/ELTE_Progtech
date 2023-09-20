package hu.elte.progtech.exercise_tasks;

public class Vector2D {

    private double a1;
    private double a2;
    private double length;

    public Vector2D(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
        this.length = calculateLength(this.a1, this.a2);
    }

    private double calculateLength(double a1, double a2) {
        return Math.sqrt( (Math.pow(a1, 2) + Math.pow(a2, 2)));
    }

    public static double calculateScalarProduct(Vector2D a, Vector2D b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("The vectors can't be null");
        }
        return ((a.a1 * b.a1) + (a.a2 * b.a2));
    }

    public static double calculateScalarProduct(Vector2D a, Vector2D b, double cos) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("The vectors can't be null");
        }
        return (a.length * b.length * Math.cos(Math.toRadians(cos)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector2D vector2D = (Vector2D) o;

        if (Double.compare(a1, vector2D.a1) != 0) return false;
        if (Double.compare(a2, vector2D.a2) != 0) return false;
        return Double.compare(length, vector2D.length) == 0;
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double getLength() {
        return length;
    }
}
