import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testCylinder();
        testStudent();
    }
    public static void testStudent(){
            // 本科生示例
            int[] undergradScores = {70, 65, 80};
            Undergraduate undergraduate = new Undergraduate(1001, "小明", undergradScores);
            System.out.println("本科生信息：");
            undergraduate.displayInfo();
            System.out.println("是否获得学位: " + (undergraduate.canGetDegree() ? "是" : "否")); // 使用三元运算符，简化代码
            System.out.println();

            // 研究生示例
            int[] gradScores = {85, 90, 75};
            Graduate graduate = new Graduate(2001, "小红", gradScores);
            System.out.println("研究生信息：");
            graduate.displayInfo();
            System.out.println("是否获得学位: " + (graduate.canGetDegree() ? "是" : "否"));
    }
    public static void testCylinder(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入圆的半径：");
        double radius = scanner.nextDouble();

        System.out.print("请输入圆柱体的高度：");
        double height = scanner.nextDouble();

        scanner.close();

        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.dispVol();
    }
}
