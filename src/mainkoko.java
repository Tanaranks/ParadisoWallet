import java.math.BigDecimal;
import java.util.Scanner;

public class mainkoko extends Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Paradiso E-Wallet platform \n");
        System.out.println("These are the wallet networks available, What would you like to do? ");
        System.out.println("[1]YingWallet (YRC) \n[2]YangWallet (Yp2) \n[3]Leave platform");
        int opt = sc.nextInt();
        System.out.println(opt);
        switch (opt){
            case 1:
                YingWallet();
                break;
            case 2:
                YangWallet();
                break;
            case 3:
                System.out.println("Platform exiting");
                System.exit(0);
            default:
                System.out.println("ERROR!!! \n Invalid input");
        }
    }

    public static void YingWallet(){
        System.out.println("Platform loading...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("YingWallet Network(YRC)");
        bankmenu();

    }
    public static void YangWallet(){
        System.out.println("Platform loading...");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("YangWallet (Yp2)");
        bankmenu();

    }


    public static void bankmenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Action");
        System.out.println("[1]Deposit \n [2]Withdraw \n [3]Exit");
        int action = sc.nextInt();
        if(action == 1){
            YingWallet bill = new YingWallet(null);
            bill.topUp(BigDecimal.valueOf(23));
        }
        else if(action == 2){
            YingWallet bill = new YingWallet(null);
            bill.topUp(BigDecimal.valueOf(40));
        }
        else if(action == 3){
            System.exit(0);
        }

    }

}
