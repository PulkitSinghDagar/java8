package strings;

public class LicenseKeyFormatting {
    public String licenseKeyFormat(String s, int k) {
        StringBuilder sb = new StringBuilder(s.replaceAll("-", "").toUpperCase());
        StringBuilder res = new StringBuilder();
        sb.reverse();
        int n = sb.length();

        for (int i = 0; i < n; i = i + k) {
            if (i + k <= n) {
                res.append(sb.substring(i, i + k));
            } else {
                res.append(sb.substring(i));
            }
            if (i + k < n) {
                res.append("-");
            }

        }return res.reverse().toString();

    }

    public static void main(String[] args) {


        LicenseKeyFormatting kk= new LicenseKeyFormatting();

        System.out.println(kk.licenseKeyFormat("as2dfea2",5));

    }
}
