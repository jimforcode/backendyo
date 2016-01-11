package com.springapp.mvc.utils;

 import org.apache.commons.codec.binary.Hex;
 import org.apache.commons.codec.digest.Crypt;

 import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zengjin on 2016/1/6.
 */
public class MessageDigestUtil {

    public static String encrypMD5(byte[] data) throws NoSuchAlgorithmException {

            MessageDigest md5 = MessageDigest.getInstance("MD5");
         md5.update(data);

         return  Hex.encodeHexString(md5.digest());
    }

    public static String encrypSHA1(byte[] data) throws NoSuchAlgorithmException {

        MessageDigest sha = MessageDigest.getInstance("SHA");
                 sha.update(data);
        return  Hex.encodeHexString(sha.digest());
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password ="zengjin";
        String stored= Crypt.crypt(password);
        System.out.println("stored ==>>>"+stored);
        System.out.println("Crypt.crypt(password,stored) ==>>>"+Crypt.crypt(password,stored));
        System.out.print(stored.equals(Crypt.crypt(password,stored)));



    }
}
