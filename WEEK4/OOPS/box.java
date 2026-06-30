package WEEK4.OOPS;

public class box {
    
    protected int length;
    protected int breadth;

    public box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int findArea() {
        return length * breadth;
    }
}

class Box3D extends box {

    private int height;

    public Box3D(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int findVolume() {
        return length * breadth * height;
    }
}