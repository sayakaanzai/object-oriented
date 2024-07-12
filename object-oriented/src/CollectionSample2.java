import java.util.ArrayList;
import java.util.List;

public class CollectionSample2 {
    public static void main(String[] args) {
         List<Car> carList = new ArrayList<>();

        carList.add(new Car(30, "プリウス", 80));
        carList.add(new Car(20, "エスティマ", 100));
        carList.add(new Car(40, "ベンツ", 70));

        for(int i = 0;i < carList.size();i++){
            Car car = carList.get(i);
            System.out.println(car.name);
            System.out.println(car.speed);
        }

        for(Car i : carList){
            System.out.println(i.name);
            System.out.println(i.speed);
        }

    }
}
