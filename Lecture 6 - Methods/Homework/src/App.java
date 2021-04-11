import java.util.Scanner;

public class App {
    static int ans[] = new int[2];
    static int num = 10;
    static int array[] = new int[num];
    static int maxmin[] = new int[num];
    public static void main(String[] args) throws Exception {
        System.out.println("How many elements do you want to input?");

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        for (int i=0; i<num; i++)
        {
            array[i] = scan.nextInt();
        }
        ans = MaxandMin(array);
    }

    public static int[] MaxandMin(int arr[]){
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxmin[0])
            {
                maxmin[0] = arr[i];
            }
        }
        maxmin[1] = arr[0];
        for (int i=0; i<num; i++)
        {
            if(arr[i]<maxmin[1]){
                maxmin[1] = arr[i];
            }
        }
        System.out.println("Max: "+maxmin[0]);
        System.out.println("Min: "+maxmin[1]);
        return maxmin;
    }
}
