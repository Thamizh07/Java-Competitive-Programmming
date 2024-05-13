import java.util.Scanner;
class s
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    double x1 = Math.pow((x-3),2);
    double y1 = Math.pow((y-4),2);
    double d = Math.sqrt((x1+y1));
    int v = (int)Math.round(d);
    System.out.println(v);
    }
}