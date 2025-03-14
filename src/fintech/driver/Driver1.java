package fintech.driver;

import fintech.model.*;
import fintech.model.Transaction;
import java.util.*;

/**
 * @author 12S23009 Dina Marlina Siagian
 * @author 12S23028 Daniel Situmorang
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[100];
        Transaction[] transactions = new Transaction[100];

        int AccountCount = 0;
        int TransactionCount = 0;
        Double harga = 0.0;
        Double saldo = 0.0;

        while(true) {
            String command = input.nextLine().trim();

            if(command.equals("---")){
                break;
            }

            String[] data = command.split("#");

            switch(data[0]){
                case "create-transaction":
                    if(data.length == 5){
                        transactions[TransactionCount] = new Transaction (data[1], saldo, data[3], data[4]);
                    }
                    break;
                case "create-account":
                    if(data.length == 4){
                        harga += saldo;
                        accounts[AccountCount] = new Account (data[1], data[2], harga);
                        AccountCount++;
                    }
                    break;
                
                case "show-account":
                    if(data.length == 4){
                        harga += saldo;
                        accounts[AccountCount] = new Account (data[1], data[2], harga);
                        AccountCount++;
                    }
                    break;
                case "remove-account":
                    if(data.length == 4){
                        harga += saldo;
                        accounts[AccountCount] = new Account (data[1], data[2], harga);
                        AccountCount++;
                    }
                break;

                default :
                    System.out.println("Perintah tidak dikenali");
            
            }

        }
        input.close();

        for (int i = 0; i < AccountCount; i++){
            System.out.println(accounts[i].toString());
        }
    
        for (int i = 0; i < TransactionCount; i++){
            System.out.println(transactions[i].toString());
        }

    }
    

}
