package enshu;

public class Car2 {
    
    static final int MAX_SPEED = 180; //finalは定数
    
    int speed;

    void stepOnAccele(){
        speed += 10;
        if(speed > MAX_SPEED){
            speed = MAX_SPEED;
        }
    }

    static void showMaxSpeed(){
        System.out.println("全車種共通の最高速度は" + MAX_SPEED + "です");
        //System.out.println("現在の速度は" + speed + "です"); <-static変数以外の変数はstaticメソッドで使えない
    }
}
