package enshu;

public class UseStatic {

    public static void main(String[] args) {
        Car2 estima = new Car2();
        estima.stepOnAccele();
        System.out.println(estima.MAX_SPEED);
        estima.showMaxSpeed();

        System.out.println(Car2.MAX_SPEED);
        Car2.showMaxSpeed();
    }
}
