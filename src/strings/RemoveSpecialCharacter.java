package strings;

public class RemoveSpecialCharacter {
    public static String RemoveSpecialcharecter(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        else {
            return str.replaceAll("[^a-zA-Z0-9]", "");
        }
    }
    public static void main(String[] args) {
String input="hello!@@@java123";
String output=RemoveSpecialcharecter(input);
        System.out.println(output);
    }
}
