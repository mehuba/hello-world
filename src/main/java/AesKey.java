import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by zhaoyibin on 16:59 07/03/2018
 */
public class AesKey {

    public static void main(String[] args) throws Exception {
        String aesKey = "unicom-mobike~!@";
        String seed = "1234567890123456";
        String mobile = "13552912076";
        String idCode = "123456789987654321";

        System.out.println("idcode=" + encrypt(idCode, aesKey, seed));
        System.out.println("mobile=" + encrypt(mobile, aesKey, seed));

    }

    /**
     * AES加密
     * @param input  需要加密的明文
     * @param key    对称秘钥
     * @param iv     seed
     * @return
     * @throws Exception
     */
    public static String encrypt(String input, String key, String iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec k = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, k, new IvParameterSpec(iv.getBytes()));
        byte[] e = cipher.doFinal(input.getBytes("utf-8"));
        return new String(Base64.encodeBase64(e));
    }
}
