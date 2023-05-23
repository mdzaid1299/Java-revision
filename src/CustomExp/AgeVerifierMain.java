package CustomExp;

public class AgeVerifierMain {
    public static void main(String[] args) {
        AgeVarifier ageVarifier = new AgeVarifier();
        try {
            ageVarifier.verifyAge(1);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
