package WEEK4.OOPS;

public class boxdemo {
    

    public static void main(String[] args) {

        Box3D box = new Box3D(10, 5, 8);

        System.out.println("Area = " + box.findArea());
        System.out.println("Volume = " + box.findVolume());
    }
}
