package constructor;

public class Main {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
//Не можем использовать конструктор по умолчанию
        Box myBox3 = new Box();

        System.out.println("Объем: " + myBox1.getVolume());
        System.out.println("Объем: " + myBox2.getVolume());
        System.out.println("Объем: " + myBox3.getVolume());
    }
}