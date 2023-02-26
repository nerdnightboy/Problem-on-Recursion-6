public class Sum_of_Array {
    static int sumOfArray(int [] arr, int idx){
        //base case
        if(idx==arr.length-1){
            return arr[idx];
        }

        //recursive work
        int sum = sumOfArray(arr, idx+1);

        //self work
        return arr[idx] + sum;



    }
    public static void main(String[] args) {
        int [] arr = {1,5,6,4,8,465,5};
        System.out.println(sumOfArray(arr, 0));
    }
}
