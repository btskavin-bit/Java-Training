public class Problem3{
    public static boolean checkInclusion(String s1,String s2){
        if(s1.length()>s2.length()) return false;
        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        if(equal(a,b)) return true;
        for(int i=s1.length();i<s2.length();i++){
            b[s2.charAt(i)-'a']++;
            b[s2.charAt(i-s1.length())-'a']--;
            if(equal(a,b)) return true;
        }
        return false;
    }
    public static boolean equal(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s1="ab";
        String s2="eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}