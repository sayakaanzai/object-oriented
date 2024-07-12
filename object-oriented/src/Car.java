public class Car {
    int speed ;
    String name;
    int gasoline;

    Car(){}

    Car(int newSpeed, String newName, int newGasoline){
        speed = newSpeed;
        name = newName;
        gasoline = newGasoline;
    }

    void display(){
        System.out.println(name + "の速度は" + speed + "km/hでガソリン残量は" + name + "リットルです。");
    }

    void stepOnAccele(){
        speed += 10;
        gasoline -= 10;
    }

    void stepOnBrake(){
        speed -= 10;
    }

    void refuel(int newGasoline){
        name += newGasoline;
    }
}
