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
//        byte[] result= md5.digest(data);
        md5.update(data);

//        return  Hex.encodeHexString(result);
        return  Hex.encodeHexString(md5.digest());
    }

    public static String encrypSHA1(byte[] data) throws NoSuchAlgorithmException {

        MessageDigest sha = MessageDigest.getInstance("SHA");
//        byte[] result= sha.digest(data);
                sha.update(data);
        return  Hex.encodeHexString(sha.digest());
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(encrypMD5("zengjin".getBytes()));
        System.out.println(encrypMD5("zengjin".getBytes()).equals(encrypMD5("zengjin".getBytes())));
        System.out.println(encrypMD5("zengjin".getBytes()));
        System.out.println(encrypMD5("zengjin".getBytes()));
        System.out.println(Crypt.crypt("zengjin"));
        System.out.println(Crypt.crypt("zengjin"));
        System.out.println(Crypt.crypt("zengjin"));
        System.out.println(Crypt.crypt("zengjin"));
        System.out.println(encrypSHA1("zengjin".getBytes()));
        System.out.println(encrypSHA1("zengjin".getBytes()));
        System.out.println(encrypSHA1("zengjin".getBytes()));
        System.out.println(encrypSHA1("zengjin".getBytes()));


    }
}
