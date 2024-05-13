import java.util.*;
import java.io.*;
import java.lang.*;

class detect_cycle_undirected_graph
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}

class DetectCycle
{
    static int find(int[] p,int i)
    {
        if(p[i]==-1)
            return i;
        return find(p,p[i]);
    }
    static void union(int[] p,int x,int y)
    {
        
        int xt = find(p,x);
        int yt = find(p,y);
        p[xt] = yt;
    }
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for(int i=0;i<V;i++)
            list1.add(new ArrayList<Integer>());
       int[] p = new int[V];
       for(int i=0;i<V;i++)
            p[i] = -1;
        for(int i=0;i<V;i++)
        {
            for(int j:list.get(i))
            {
                if(!list1.get(i).contains(j)) {
                    list1.get(j).add((Integer)i);
                }
                
            }
        }
        list = list1;
       for(int i=0;i<V;i++)
       {
           for(int j:list.get(i))
           {
                int x = find(p,i);
                int y = find(p,j);
                if(x==y)
                    return true;
                    
                union(p,x,y);    
           }
       }
       return false;
    }
}