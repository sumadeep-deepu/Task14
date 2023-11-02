package PracticeCodes;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{

        System.out.println("enter the size of array");
        int number=sc.nextInt();
            if(number<0){
                throw new IllegalArgumentException("arrray size cannot be negative");
            }
            int arr[]=new int[number];
            System.out.println("array created with size : "+number);
            }
            catch(IllegalArgumentException e){
                System.out.println("error : "+e.getMessage());

            }
            catch(Exception e){
                System.out.println("unknown error please try again !");
            }
            finally{
                sc.close();
            }
            
            
    }
}