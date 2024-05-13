public class c
{
    public static void main(String[] args) 
    {
        int arr[] = {3,1,4,5,6,2};
        int l=0;
        int r=arr.length-1;
        int max = 0;
        int y=1;
        while(l<=r)
        {
            if(arr[l]<arr[r])
            {
                max = max + arr[l]*y;
                l=l+1;
                y=y+1;
            }
            else if(arr[l]>arr[r])
            {
                max = max + arr[r]*y;
                y=y+1;
                r=r-1;
            }
        }
        System.out.println(max);
    }
}
