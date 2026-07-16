import java.util.Arrays;

public class Problem5{
    static int[] parent;

    public static int find(int x){
        if(parent[x]!=x)
            parent[x]=find(parent[x]);
        return parent[x];
    }

    public static boolean union(int x,int y){
        int px=find(x);
        int py=find(y);
        if(px==py)
            return false;
        parent[px]=py;
        return true;
    }

    public static int earliestAcq(int[][] logs,int n){
        Arrays.sort(logs,(a,b)->a[0]-b[0]);
        parent=new int[n];
        for(int i=0;i<n;i++)
            parent[i]=i;
        int count=n;
        for(int[] log:logs){
            if(union(log[1],log[2])){
                count--;
                if(count==1)
                    return log[0];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[][] logs={
            {20190101,0,1},
            {20190104,3,4},
            {20190107,2,3},
            {20190211,1,5},
            {20190224,2,4},
            {20190301,0,3},
            {20190312,1,2},
            {20190322,4,5}
        };
        int n=6;
        System.out.println(earliestAcq(logs,n));
    }
}