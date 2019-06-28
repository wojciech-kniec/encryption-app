public class CryptoApp {
    public static void main(String[] args) {
        Crypto crypto = new BasicCrypto();

        String data = "Some nice text";
        String enc = new String(crypto.encrypt(data.getBytes()));
        String dec = new String(crypto.decrypt(enc.getBytes()));

        System.out.println("Original: " + data);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
