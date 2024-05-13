import java.util.Scanner;
class j
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int a[] = new int[n1];
    int b[] = new int[n2];
    for(int i=0;i<n1;i++)
    {
      a[i] = sc.nextInt();
  }
    for(int j=0;j<n2;j++)
    {
      b[j] = sc.nextInt();
    }
    int x =0;
    if(n1==n2){
      for(int k=0;k<n1;k++)
      {
        if(a[k]==b[k])
      {
      x=x+1;
      }
      else if(a[k]!=b[k]){
      x=x-1;
      }
      }
    }
    if(x>0)
    {
    System.out.println("Same");
    }
    else if(x<0 || n1!=n2)
    {
    System.out.println("Not Same");
    }
  }
}