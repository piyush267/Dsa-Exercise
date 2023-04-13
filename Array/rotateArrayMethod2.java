public class rotateArrayMethod2 
    {
        //Function to rotate an array by d elements in counter-clockwise direction. 
        public static void main(int arr[], int d, int n)
       {
           // add your code here
            d = d % n;
            d=n-d;
            reverse(0,n-d-1, arr);
            reverse(n-d,n-1, arr);
            reverse(0,n-1, arr);
       }
          static void reverse(int i,int j,int arr[])
        {
            int temp;
            while(i<j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
    }
}
