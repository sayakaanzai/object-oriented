public class Ex_02 {
    public static void main(String[] args) {
        Car estima = new Car();
        estima.speed = 50;
        estima.name = "エスティマ";

        Car prius = new Car();
        prius.speed = 30;
        prius.name = "プリウス";

        estima.stepOnAccele();
        estima.stepOnAccele();
        estima.stepOnBrake();
        System.out.println(estima.name + "の現在の速度は" + estima.speed + "km/hです。");

        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnBrake();
        prius.stepOnBrake();
        prius.stepOnBrake();
        System.out.println(prius.name + "の現在の速度は" + prius.speed + "km/hです。");
    }
}
