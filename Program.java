/*Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
Создать интерфейс, скорость плаванья
Добавить новое животное, способное плавать
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре */
package OOP2;

public class Program {
    public static void main(String[] args) {
        
        Zoo zoo = new Zoo();
        System.out.println("speak");
        zoo.talk();
        System.out.println("run");
        zoo.run();
        System.out.println("fly");
        zoo.fly();
        System.out.println("swim");
        zoo.swim();
    }
}