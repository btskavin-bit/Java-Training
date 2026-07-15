import java.util.HashMap;
public class Problem6{
    public static String minWindow(String s,String t){
        if(s.length()<t.length()) return "";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        int left=0,count=t.length(),start=0,min=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0) count--;
                map.put(ch,map.get(ch)-1);
            }
            while(count==0){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }
                char c=s.charAt(left);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                    if(map.get(c)>0) count++;
                }
                left++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
    public static void main(String[] args){
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));
    }
}