package chap_10_inheritance.sec01;

class Human {
    String name;
    int age;
    void eat() {}
    void sleep() {}
}
class Student extends Human {
    int studentID;
    void goToSchool() {}
}
class Worker extends Human {
    int workerID;
    void goToWork() {}
}
public class _01_Inheritance {
    public static void main(String[] args) {
        // Human 객체 생성
        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        // Student 객체 생성
        Student s = new Student();
        s.name = "한병윤";
        s.age = 16;
        s.studentID = 128;      // 추가로 정의한 멤버
        s.eat();
        s.sleep();
        s.goToSchool();         // 추가로 정의한 멤버

        // Worker 객체 생성
        Worker w = new Worker();
        w.name = "봉윤정";
        w.age = 45;
        w.workerID = 128;      // 추가로 정의한 멤버
        w.eat();
        w.sleep();
        w.goToWork();          // 추가로 정의한 멤버
    }
}
