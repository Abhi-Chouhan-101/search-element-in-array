import java.util.Scanner;
public class Array_2
  {
    public static void main(String args[])
      {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int num=sc.nextInt();
        int arr[]=new int [num];
        int i;
        int z = 0;
        System.out.print("enter number of element : ");
        for(i=0;i<=num-1;i++)
         {
            arr[i]=sc.nextInt();
         }
        System.out.print("Enter the serching element : ");
        int x=sc.nextInt();
        for(i=0;i<=num-1;i++)
        {
          if(arr[i]==x)
           {
             System.out.println("your searched element at is location number = "+i); 
             z++;
           }     
        } 
        if(z==0)
        {
          System.out.println("The Element you searched for was not found in the array");
        }
         System.out.println("your searched element is = "+x);
         
      }   

  } 