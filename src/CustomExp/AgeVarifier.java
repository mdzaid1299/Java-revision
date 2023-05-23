package CustomExp;

public class AgeVarifier {
    public void verifyAge(int age) throws InvalidAgeException {
        if (age < 13) {
            throw new InvalidAgeException("Cannot " +
                    "register to platform "+ "age not valid");
        }
    }
}
