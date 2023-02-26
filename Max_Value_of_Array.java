public class Max_Value_of_Array {
    static int maxInArray(int [] arr, int idx){
        //base case
        if(idx == arr.length-1){
            return arr[idx];
        }

        //small problem
        int smallAns = maxInArray(arr, idx+1);

        //self work
        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int [] arr = {1,5,6,4,8,465,5};
        System.out.println(maxInArray(arr, 0));
    }
}
