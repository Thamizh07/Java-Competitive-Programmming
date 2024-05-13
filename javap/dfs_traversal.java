import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class dfs_traversal {

    public static void dfs_traversal(ArrayList<ArrayList<Integer>> adj, int v1, int v2) {
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }
    
    public static void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stk = new Stack<>();
        stk.push(i);
        vis[i] = true;
        //System.out.print(" ");
        while(!stk.isEmpty()){
            int temp = stk.pop();
            System.out.print(temp+" ");
            for(int vertex: adj.get(temp)){
                if(!vis[temp]){
                    stk.push(vertex);
                    vis[vertex] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        if(v==0){
            
            sc.close();
            return;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        boolean[] vis = new boolean[v];

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }

        for(int i = 0; i < v; i++){
            if(!vis[i]){
                dfs(i, vis, adj);
            }
        }
        sc.close();
    }
}
