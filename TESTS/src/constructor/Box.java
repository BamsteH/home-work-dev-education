package constructor;

public class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {}
    double getVolume() {
        return width * height * depth;
    }
}