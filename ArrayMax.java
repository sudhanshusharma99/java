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
