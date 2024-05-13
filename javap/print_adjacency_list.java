import java.util.ArrayList;
import java.util.Scanner;
class Main{
    static void buildGraph(int v, int e, Scanner sc)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for(int i=0; i<v; i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0; i<e; i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }

        printList(adj, v);
    }
  static void printList(ArrayList<ArrayList<Integer>> adj, int v){
        for(int i=0; i<adj.size(); i++)
        {
            System.out.print(i);
            for(int vertex: adj.get(i))
            {
               	System.out.print("-> ");
                System.out.print(vertex+"");
            }
          System.out.println();
            }
  }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int v = sc.nextInt();
            int e = sc.nextInt();
            buildGraph(v, e, sc);
        }
    }
}