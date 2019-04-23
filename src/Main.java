import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int [] numar_zile = {31, 28, 31, 30,31,30,31,31,30,31,30,31};
        Scanner user_input = new Scanner(System.in);
        System.out.println("Introduceti numarul lunii pentru a aflat cate zile are (<12)");
        int i = user_input.nextInt();
        switch (i){
            case 1:
                System.out.println("Ianuarie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 2:
                System.out.println("Februarie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 3:
                System.out.println("Martie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 4:
                System.out.println("Aprilie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 5:
                System.out.println("Mai");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 6:
                System.out.println("Iunie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 7:
                System.out.println("Iulie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 8:
                System.out.println("August");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 9:
                System.out.println("Septembrie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 10:
                System.out.println("Octombrie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 11:
                System.out.println("Noiembrie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            case 12:
                System.out.println("Decembrie");
                System.out.println(numar_zile[i-1]+ " de zile");
                break;
            default:
                System.out.println("Numar prea mare / Luna incorecta / Format gresit");
                break;
        }

    }
}
