package Homework.Homework07;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class CryptText {
    private static final String ALGORITHM = "AES";
    private static final String CIPHER_TRANSFORMATION = "AES/ECB/PKCS5Padding";

    public static String encryptText(String plainText, String password) throws Exception{
            password = setPasswordToBase64(password);
            SecretKeySpec secretKey = new SecretKeySpec(password.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
    } 

    public static String decryptText(String encryptedText, String password) throws Exception {
            password = setPasswordToBase64(password);
            SecretKeySpec secretKey = new SecretKeySpec(password.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    public static String setPasswordToBase64(String password) {
        if(password.length() < 16) {
            password += "00000000000000000000000000000000";
            password = password.substring(0, 16);
        }
        else if(password.length() < 32 || password.length() > 32) {
            password += "00000000000000000000000000000000";
            password = password.substring(0, 32);

        }
        return password;
    }

}
