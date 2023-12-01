public class Main {
    public static void main(String[] args) {
        System.out.println(isNumber('2'));
    }
    public static boolean isNumber(char x) {
        if (Character.isDigit(x)){
            return true;
        } else {
            throw new RuntimeException("il char non è un numero");
        }
    }
}
