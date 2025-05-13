public class BinarySearch {
    public static void main(String[] args) {
        int[] array={-2,3,4,7,8,9,11,13};
        int target=11;
        BinarySearch.search(array,target);

    }
    public static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(int)Math.floor((start+end)/2);
            if (arr[mid]==target){
                System.out.println("Found "+arr[mid]);
                return arr[mid];
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
