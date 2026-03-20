public class PasswordValidator {
    public boolean isValid(String password) {

        if (password == null) {
            return false;
        }

        // condition 1: length >= 8
        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
        }

        // ❗ INTENTIONAL BUG:
        // using OR instead of AND
        if (hasDigit || hasUpper) {
            return true;
        }

        return false;
    }
}
