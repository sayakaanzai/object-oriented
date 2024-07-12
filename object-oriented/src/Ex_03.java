public class Ex_03 {
    public static void main(String[] args) {

       // Car estima = new Car(50, "エスティマ", 100);
        //Car prius = new Car(30, "プリウス" , 20);

        //estima.display();
        //prius.display();

        
        Car[] cars = new Car[3];   //3個分のCarオブジェクトが入る配列の作成
        //Car型　配列名　＝　new　Carオブジェクト3つ分（の配列の箱）　
        cars[0] = new Car(10, "プリウス", 100);   //配列要素0にCarインスタンスを入れる
        cars[1] = new Car(20, "エスティマ", 110);   //配列要素1にCarインスタンスを入れる
        cars[2] = new Car(30, "ベンツ", 200);   //配列要素2にCarインスタンスをいれる

        String totalName = makeTotalName(cars);  //String型のtotalNameという変数にmakeTotalNameの戻り値を入れる
        System.out.println(totalName);   //totalNameを表示する
    }
    
    static String makeTotalName (Car[] cars){    //配列carsを引数に受け取ったmakeTotalNameメソッド
        String totalName = "";
        //for (int i = 0; i < cars.length; i++){   //0~cars回分(=3)繰り返す
        for(Car i : cars ){
            totalName += i + "." + i.name + "\n";  //totalNameに”i.要素iの名前”（最後に改行）を入れる。
        }
        return totalName;   //totalNameを呼び出しもとに戻り値として返す
    }
}

