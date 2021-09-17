package Hash.Functions;

import java.util.Scanner;

public class HashTexts {

    public static String setAlgo(int n){
        switch (n){
            case 1:
                return "MD2";
            case 2:
                return  "MD5";
            case 3:
                return  "SHA-1";
            case 4:
                return  "SHA-224";
            case 5:
                return  "SHA-256";
            case 6:
                return  "SHA-384";
            case 7:
                return  "SHA-512";
            default:
                return "";
        }
    }

    public static void displayMessage(){
        System.out.println("\n ## Select The Algorithm To Be Used ## \n");
        System.out.println(" 1. MD-2 ");
        System.out.println(" 2. MD-5 ");
        System.out.println(" 3. SHA-1 ");
        System.out.println(" 4. SHA-224 ");
        System.out.println(" 5. SHA-256 ");
        System.out.println(" 6. SHA-384 ");
        System.out.println(" 7. SHA-512 ");
        System.out.println("\n Press The Relative Numeric Key For Selecting Algorithm");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("****##  Welcome To JHash *****##");
        System.out.println(" This is a Command Line version \n");
        System.out.println(" Enter The Message / Text To Be Hashed \n");
        String str = sc.nextLine();

        displayMessage();
        int key = sc.nextInt();
        String  algo = setAlgo(key);

        HashFunctions hashfunctions = new HashFunctions();
        hashfunctions.setValues(str,algo);
        String HashedStr = hashfunctions.getHash();
        System.out.println(" Hash Value is --> "+HashedStr+"\n");
        System.out.println("****##  Thank You *****##");
        System.out.println("****##  Created by Hash Pathak *****## \n");

    }
}
