package Programmers;


import java.util.logging.SocketHandler;

public class Test00 {

    public static class Car{

        static String brand;

        String name;
        String color;
        int MaxSpeed;

        Car(String name, String color, int MaxSpeed){
            this.name = name;
            this.color = color;
            this.MaxSpeed = MaxSpeed;

        }

        public void acc(String key){

            System.out.println("부릉부릉");
        }



    }



    public static void main(String[] args) {

        Car car01 = new Car("케이파이브", "블랙", 300);

       car01.acc("key");
    }
}
