package enshu7;

public class Ex07 {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.buyItem();
        vm.refillStock(3);
        vm.buyItem();
        vm.putMoney(500);
        for(int i = 0;i <=2;i++){
            vm.buyItem();
        }
        vm.refillStock(3);
        for(int i = 0;i <=2;i++){
            vm.buyItem();
        }
    }
}
