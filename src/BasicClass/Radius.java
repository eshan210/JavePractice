package BasicClass;

public class Radius {
    public int radius;

    public Radius(int radius) {
        this.radius = radius;
    }
    public void getRadius() {
        System.out.println(radius);
    }
    public void getCircumference(){
        System.out.println( 2 * 3.14 * radius);
    }
    public void getArea(){
        System.out.println(3.14*radius*radius);
    }

    }

