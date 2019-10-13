class ArrayMax{
public static void main(String args[])
{
int a[]={10,2, 3, 4, 5};
int max=a[0],min=a[0];
for(int i=1;i<a.length;i++)
{ if(a[i]>max)
  max=a[i];
 if(a[i]<min)
   min=a[i];
}
class Simple{  
    public static void main(String args[]){  
     System.out.println("result of max and min calculated");  
    }  
}    
System.out.println("Max is"+max);
System.out.println("Min is"+min);
}
}

public class reverseArray { 
  
    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr, arr.length); 
    } 
} 
