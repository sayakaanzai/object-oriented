package enshu7;

public class VendingMachine {
    static final int PRICE = 120;
    int money;
    int stock;

    void refillStock(int stock){
        if(stock >= 10){
            System.out.println("商品がいっぱいです");
        }else{
            this.stock += stock;
            System.out.println("在庫が" + this.stock + "個になりました");
        }        
    }

    void putMoney(int money){
        this.money += money;
        System.out.println("入金金額が" + this.money + "円になりました");
    }

    void buyItem(){
        if(stock <= 0){
            System.out.println("在庫を追加してください");
        }else if(money <= 0){
            System.out.println("お金を入れてください");
        }else if(money < PRICE){
            System.out.println("お金が足りません（現在の残高" + this.money + "円）");
        }else{
            System.out.println("商品を購入しました");
            stock -=1;
            this.money -= PRICE;
            if(stock <= 0){
                System.out.println("在庫切れになりました");
            }
        }
        

    }

}
