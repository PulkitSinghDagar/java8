package strings;
public class MyAtoi {

    public  int mametoi(String str){
        String re="234";
        int result=0;
        for (int i=0;i<re.length();i++){
            char c = re.charAt(i);
           // System.out.println(c>= '0'&&c<='9');
            if (c>= '0'&&c<='9'){
                System.out.println(c);
                result= result*10+(c-'0');
            }
            else {
                System.out.println("not");
            }

        }
        return result;
    }
    public static void main(String[] args) {
        String re="234";


        MyAtoi m = new MyAtoi();
     System.out.print(" result "+m.mametoi(re))   ;

    }
}
