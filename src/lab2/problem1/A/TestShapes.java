package lab2.problem1.A;

public class TestShapes {
    public static void main(String[] args) {
        Shape3D[] shapes = new Shape3D[3];
        shapes[0] = new Cylinder(5, 10);
        shapes[1] = new Sphere(3);
        shapes[2] = new Cube(4);

        for (Shape3D s : shapes) {
            System.out.println(s.toString());
            System.out.println("Volume: " + s.volume());
            System.out.println("Surface Area: " + s.surfaceArea());
            System.out.println("-------------------------");
        }
    }
}