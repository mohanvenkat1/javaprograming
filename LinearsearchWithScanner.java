import java.util.Scanner;
class LinearsearchWithScanner{
    public static int LinearsearchWithScanner(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return i+1;
        }
        return -1;
    }
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array ; ");
    int n=in.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements :- ");
    for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
    }
    System.out.println("Enter the number you want find in the array : ");
    int key=in.nextInt();
    int res=LinearsearchWithScanner(arr,key);
    if (res!= -1) {
        System.out.println("Element found at : " + res);
    } else {
        System.out.println("Element not found in the array.");
    }

}
}
