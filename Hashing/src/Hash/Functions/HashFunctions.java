package Hash.Functions;


import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class HashFunctions {
      private  byte [] input;
      private  String algorithm ="";


    public void setValues(String inp, String al){
        this.input=inp.getBytes();
        this.algorithm=al;
    }
    public String getHash(){
        String hashValue="";
        try{
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(input);
            byte[] digestedBytes = messageDigest.digest();
            hashValue = DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
        }
        catch (Exception e){
        }
        return hashValue;

    }
}
