public class IsValidNumber {

    public static boolean isValidNumber(String s) {
        return s.matches("\\(\\d{3}\\) \\d{3}-\\d{4}") ||
               s.matches("\\d{3}-\\d{3}-\\d{4}");
    }

    public static void main(String[] args) {
        System.out.println(isValidNumber("(123) 456-7890")); // true
        System.out.println(isValidNumber("123-456-7890"));   // true
        System.out.println(isValidNumber("1234567890"));     // false
    }
}
