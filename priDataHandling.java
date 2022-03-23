public class priDataHandling {
    public static void main(String[] args) {
        String num1 = "20";
        String num2 = "20.4";
        String num3 = "267.2";
        System.out.println(Integer.parseInt(num1));
        System.out.println(Double.parseDouble(num2));
        System.out.println(Float.parseFloat(num3));

        char ch = 'j';
        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isSpaceChar(ch));

    }
}
