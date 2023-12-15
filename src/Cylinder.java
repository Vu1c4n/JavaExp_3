import java.util.Scanner;

public class Cylinder extends Circle {
    private final double height;

    // 构造方法，初始化圆柱体的圆半径和高度
    public Cylinder(double r, double h) {
        super(r); // 调用父类构造方法，初始化圆的半径
        this.height = h;
    }

    // 获取圆柱体的高度
    public double getHeight() {
        return height;
    }

    // 获取圆柱体的体积
    public double getVolume() {
        return super.getArea() * height;
    }

    // 输出圆柱体的体积
    public void dispVol() {
        System.out.println("圆柱体的体积：" + getVolume());
    }
}
