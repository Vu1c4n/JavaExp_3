// 学生基类
public class Student {
    protected int studentID;
    protected String name;
    protected int[] scores;

    public Student(int studentID, String name, int[] scores) {
        this.studentID = studentID;
        this.name = name;
        this.scores = scores;
    }

    public double getAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public void displayInfo() {
        System.out.println("学生ID: " + studentID);
        System.out.println("姓名: " + name);
        System.out.println("各门课程成绩: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("课程 " + (i + 1) + ": " + scores[i]);
        }
        System.out.println("平均分: " + getAverageScore());
    }
}

// 本科生类
class Undergraduate extends Student {
    public Undergraduate(int studentID, String name, int[] scores) {
        super(studentID, name, scores);
    }

    public boolean canGetDegree() {
        return getAverageScore() > 60;
    }
}

// 研究生类
class Graduate extends Student {
    public Graduate(int studentID, String name, int[] scores) {
        super(studentID, name, scores);
    }

    public boolean canGetDegree() {
        double average = getAverageScore();
        for (int score : scores) {
            if (score < 60) {
                return false; // 有一门不及格则返回false
            }
        }
        return average > 80; // 所有科目及格且平均分超过80返回true
    }
}
