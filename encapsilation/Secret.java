package encapsilation;
public class Secret {
    public String iAmVisible = "You can see me everywhere";
    private String iAmHidden = "Only class can see me";
    String iAmPackage = "I am seen at the package level";

    public static void main(String[] args) {
        Secret secret = new Secret();
        System.out.println(secret.iAmVisible);
        System.out.println(secret.iAmHidden);
        System.out.println(secret.iAmPackage);
    }
}
