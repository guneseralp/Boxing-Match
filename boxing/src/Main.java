//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner (System.in);


        /*for(int i= 1; i <= 2;i++){
            System.out.println(i + ". Dövüşçü: ");
            String nam = sc.nextLine();
            System.out.println(i + ". Dövüşçünün Hasarı: ");
            int damage = sc.nextInt();
            System.out.println(i + ". Dövüşçünün Canı: ");
            int health = sc.nextInt();
            System.out.println(i + ". Dövüşçünün Ağırlığı: ");
            int weight = sc.nextInt();
            System.out.println(i + ". Dövüşçünün Bloklama Şansı: ");
            int dodgeChance = sc.nextInt();
        }*/

        Fighter f1 = new Fighter ("Ali", 10,120,100,30);
        Fighter f2 = new Fighter ("Veli",20,85,85,30);

        Match match = new Match (f1,f2,85,100);
        match.run();
    }
}