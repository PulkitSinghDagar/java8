package strings;

public class LongestCommonPrefix {
    public String common(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        int n = Math.min(s1.length(), s2.length());

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i)); // Append the common character
            } else break;
        }
        return sb.toString();
    }
    public String LCP(String[ ] str){
        String res= str[0];
        for (int i=1;i<str.length;i++){
            res=common(res,str[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        String[] strs = { "geeksforgeeks", "geeks", "geek",
                "geezer" };
        LongestCommonPrefix LCP= new LongestCommonPrefix();
        System.out.println(LCP.LCP(strs));
    }
}
