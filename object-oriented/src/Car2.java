public class Car2 {
    int speed;
    String name;

    Car2(int newSpeed, String newName){
        speed = newSpeed;
        name = newName;
    }
    void stepOnAccele(){
        speed += 10;
        System.out.println("スピードが" + speed + "km/hに増えました。");
    }
    void stepOnBrake(){
        speed -= 10;
        System.out.println("スピードが" + speed + "km/hに増えました。");
    }
}
