public class Circle {
    private final double radius;

    // 构造方法将半径初始化为0
    public Circle() {
        this.radius = 0;
    }

    // 构造方法，将半径初始化为r
    public Circle(double r) {
        this.radius = r;
    }

    // 获取圆的半径值
    public double getRadius() {
        return radius;
    }

    // 获取圆的周长
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // 获取圆的面积
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 输出圆的信息
    public void disp() {
        System.out.println("圆的半径：" + radius);
        System.out.println("圆的周长：" + getPerimeter());
        System.out.println("圆的面积：" + getArea());
    }
}
