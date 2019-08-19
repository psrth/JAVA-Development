package Arrays;

//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the
//adjacent elements if they are in wrong order

import java.util.Scanner;            
public class bubbleSort {
    public static void main(String[] args){
        int i,j,tmp; 
        int arr[]=new int[10];     //new blank array of width '10' has been created        
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++){
                    System.out.println("Enter element number: "+(i+1));
                    arr[i]=sc.nextInt(); //array variables are being initialized
        }
        for(i=0;i<10;i++)
           System.out.println(arr[i]+" "); //printing unsorted array
        
           for(i=0;i<10;i++){
              for(j=0;j<9-i;j++){
                 if(arr[j]>arr[j+1]){
                       tmp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=tmp;
                 }
                }
              }
         
         
        for(i=0;i<10;i++)
            System.out.print(arr[i]+" ");  //printing the sorted array
        }
    }

        