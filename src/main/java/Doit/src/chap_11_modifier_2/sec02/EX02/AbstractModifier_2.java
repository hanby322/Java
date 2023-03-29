package chap_11_modifier_2.sec02.EX02;

abstract class Animal {
    abstract void cry();
}
class Cat extends Animal {
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}
public class AbstractModifier_2 {
    public static void main(String[] args) {
        // 객체 생성
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        // 메서드 호출
        animal1.cry(); // 야옹
        animal2.cry(); // 멍멍
    }
}
