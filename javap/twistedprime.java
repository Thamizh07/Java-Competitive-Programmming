import java.util.*;
public class twistedprime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int c1=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                c=1;
            }
        }
        int r = 0;  
        if(c==0)
        {
            while(n != 0)   
            {  
                int rem = n % 10;  
                r = r * 10 + rem;  
                n = n/10;  
            }
            for(int i=2;i<r/2;i++)
            {
                if(r%i==0)
                {
                    c1=1;
                }
            }
        }
        if(c==0 && c1==0)
        {
            System.out.println("The number is Twisted Prime");
        }
        else if(c==0 && c1!=0)
        {
            System.out.println("The number is Just Prime");
        }
        else
        {
            System.out.println("The number is not Prime");
        }
    }
}


