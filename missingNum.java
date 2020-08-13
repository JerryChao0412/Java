public class missingNum {
    static int printMissing(int arr[],int size){
        int total = 1; 
        for (int i = 2; i <= (size + 1); i++) 
        { 
            total += i; 
            total -= arr[i - 2]; 
        } 
        return total; 
    }
    static int printMissing_V2(int arr[],int size){
        int n = size + 1;
        int total = (1+n)*n / 2;
        int sum = 0;
        for(int num:arr)
            sum = sum + num;
        return total - sum;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int size = arr.length;
        System.out.println(printMissing_V2(arr,size));

    }
}