import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int adet=0;
        int toplam=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number=scanner.nextInt();
        for (int i=1;i<=number;i++){
            if(i%3==0 && i%4==0){
                adet++;
                toplam+=i;
            }
        }
        double ortalama=toplam/adet;
        System.out.println(" Ortalama : "+ortalama);
    }
}
