public class Search {
    static int binarySearch(int arr[],int t){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int m = l + (r-1) / 2;
            if(arr[m] == t)
                return m;
            if(arr[m] < t)
                l = m + 1;
            else
                r = m - 1;

        }
        return -1;
    }

    static int linearSearch(int arr[],int t){
        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] == t)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {10,11,12,31,15};
        int target = 3,target2 = 31;
        int Binaryresult = binarySearch(arr,target);
        int Linearesult = linearSearch(arr2,target2);
        if(Binaryresult== -1)
            System.out.println("BinarySearch Target not exist!");
        else
            System.out.println("BinarySearch Target at index: "+Binaryresult);

        if(Linearesult == -1)
            System.out.println("LinearSearch Target not exist!");
        else
            System.out.println("LinearSearch Target at index: "+Linearesult);
    }
    
}