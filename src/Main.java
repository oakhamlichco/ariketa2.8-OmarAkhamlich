import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hautatu eragiketa bat: ");
        System.out.println("1: Batuketa");
        System.out.println("2: Kenketa");
        System.out.println("3: Biderketa");
        System.out.println("4: Zatiketa");
        int aukera = scanner.nextInt();

        System.out.print("Sartu lehen zenbakia: ");
        double zenb1 = scanner.nextDouble();
        System.out.print("Sartu bigarren zenbakia: ");
        double zenb2 = scanner.nextDouble();

        double emaitza = 0;
        switch (aukera) {
            case 1:
                emaitza = zenb1 + zenb2;
                break;
            case 2:
                emaitza = zenb1 - zenb2;
                break;
            case 3:
                emaitza = zenb1 * zenb2;
                break;
            /*case 4:
                if (zenb2 != 0) {
                    emaitza = zenb1 / zenb2;
                } else {
                    System.out.println("Errorea: Ezinezkoa da zeroz zatitzea.");
                    return;
                }
                break;
            default:
                System.out.println("Aukera ez da egokia.");
                return;*/
        }
        System.out.println("Emaitza: " + emaitza);
    }
}
