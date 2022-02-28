import java.util.Scanner;
public class Main {
    static public void main(String[] args){
        Scanner input = new Scanner (System.in);
        String appInformation= ("Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı For Döngüsü ile ");

        System.out.println(appInformation);
        System.out.println("Sayıyı giriniz: ");
        int number1 = input.nextInt();

        System.out.println("Üssü sayıyı giriniz: ");
        int number2 = input.nextInt();
        int total = number1;

        for (int counter=1; counter<number2; counter++ )
        {
            total*=number1;
            System.out.println(total);
        }
        System.out.println("Sonuç: "+ total);




    }
}
