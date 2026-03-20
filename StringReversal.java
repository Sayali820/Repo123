public class StringReversal {
    public String reverse(String s) {

        // handle null case
        if (s == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        // reverse using StringBuilder
        return new StringBuilder(s).reverse().toString();
    }
    
}
