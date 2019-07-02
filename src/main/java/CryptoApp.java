
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CryptoApp {
    public static void main(String[] args){
        Crypto crypto = new BasicCrypto();

        String data = "Some nice text is going to be encoded";
        String enc = new String(crypto.encrypt(data.getBytes()));
        String dec = new String(crypto.decrypt(enc.getBytes()));

        System.out.println("Original: " + data);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);

        byte[] data1 = new byte[0];
        try {
            data1 = Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/src/main/java/data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] data2 = crypto.encrypt(data1);
        byte[] data3 = crypto.decrypt(data2);

        try {
            Files.write(Paths.get(System.getProperty("user.dir")+"/src/main/java/data2.txt"),data2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get(System.getProperty("user.dir")+"/src/main/java/data3.txt"),data3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
