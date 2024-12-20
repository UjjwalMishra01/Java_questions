package src;

public class sort_people {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }

    public void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi =partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }

    public int[] sortArray(int[] nums) {

        int low  = 0;
        int high = nums.length;
        quicksort(nums,low,high-1);

        return nums;
    }
}
