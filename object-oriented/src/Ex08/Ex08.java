package Ex08;

public class Ex08 {
    public static void main(String[] args) {
        /*
        int[] hairetu1 = {0, 1, 2, 3, 4};
        for(int a = 0;0 < hairetu1.length;a++){

            System.out.print(hairetu1[a] + " ");
        } */
        
        String[] hairetu2 = new String[10];
        hairetu2[0] = "安西紗也夏";
        hairetu2[5] = "安西紗也夏";
        for(String b : hairetu2){
            if(b.equals("null")){
            System.out.print(b + " ");
            }
        }
    }

}
