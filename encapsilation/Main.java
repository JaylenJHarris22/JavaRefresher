package encapsilation;

public class Main {
    public static void main(String[] args){
        Secret secret = new Secret();
        System.out.println(secret.iAmVisible);
        System.out.println(secret.iAmPackage);
    }
}