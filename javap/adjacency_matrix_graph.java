// Adjacency Matrix representation in Java
import java.util.Scanner;
public class adjacency_matrix_graph{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of nodes in the graph");
        int nodes = scanner.nextInt();

        System.out.println("Please enter the number of edges in the graph");
        int edgesCount = scanner.nextInt();

        System.out.println("Is the graph directed ");
        boolean isDirected = scanner.next().equalsIgnoreCase("yes");
        System.out.println("Adjacency Matrix Representation:");
        int a[][]=new int[100][100];
        for(int i=0;i<nodes;i++){
          for(int j=0;j<edgesCount;j++){
            a[i][j]=0;
          }
        }
      for(int i=0;i<nodes;i++){
        for(int j=0;j<edgesCount;j++){
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
        int[][] adjacencyMatrix = new int[nodes][nodes];
        for (int i = 0; i < edgesCount; i++) {
            System.out.println("Enter the start node, end node and weight of edge no " + (i + 1) );
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int weight = scanner.nextInt();
            adjacencyMatrix[start - 1][end - 1] = weight;
            if (!isDirected) {
                adjacencyMatrix[end - 1][start - 1] = weight;
            }
        }
        System.out.println("Adjacency Matrix Representation:");
        printAdjacencyMatrix(adjacencyMatrix); scanner.close();
    }
  private static void printAdjacencyMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}