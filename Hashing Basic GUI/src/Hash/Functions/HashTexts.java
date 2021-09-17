package Hash.Functions;
import javax.swing.JOptionPane;
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

    public static int displayMessage(){
        JOptionPane.showMessageDialog(null," ## Select The Algorithm To Be Used ## \n"+"\n 1. MD-2 \n"+""+"\n 2. MD-5 \n"+"\n 3. SHA-1 \n"+"\n 4. SHA-224 \n"+"\n 5. SHA-256 \n"+"\n 6. SHA-384 \n"+"\n 7. SHA-512 \n");
       int num= Integer.parseInt(JOptionPane.showInputDialog("\n Press The Relative Numeric Key For Selecting Algorithm"));
       return num;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"****##  Welcome To JHash *****##");
        String str = JOptionPane.showInputDialog(" Enter The Message / Text To Be Hashed \n");

        int key = displayMessage();
        String  algo = setAlgo(key);

        HashFunctions hashfunctions = new HashFunctions();
        hashfunctions.setValues(str,algo);
        String HashedStr = hashfunctions.getHash();
        JOptionPane.showMessageDialog(null,"\t Hash Value is \n"+HashedStr+"\n"+"\n\t****##  Thank You *****##\n"+"\n\t****##  Created by Hash Pathak *****## \n");

    }
}
