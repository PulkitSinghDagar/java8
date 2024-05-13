package Lambdaexpression;

public class LambdaPracticeStarting {
    public static void main(String[] args) {
        mynewclass len=(s)->s.length();
        System.out.println(len.lengthofString("hello"));


    }
}
interface  mynewclass {
    int lengthofString(String s);
}