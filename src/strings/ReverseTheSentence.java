package strings;

public class ReverseTheSentence {
    public static void main(String[] args) {
        String av ="hello my name is";
        String rev="";
        String[] words=av.split(" ");

        for (int i= words.length-1;i>=0;i--){
            rev+= words[i];
            if (i!=0){
                rev+=" ";
            }
        }
        System.out.println(rev);
    }
}
