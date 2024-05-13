import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jump {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int f=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                f=1;
            }
            if(a[i]==0 && i==n-1){
                f=0;
            }
        }
        if(f==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}