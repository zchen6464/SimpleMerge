import java.util.Arrays;

/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            out[i] = arr1[i];
        }
        for(int i = arr1.length; i < out.length; i++)
        {
            out[i] = arr2[index];
            index++;
        }
        mergeSort(out);
        return out;
    }
    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1, temp);
    }
    public static void mergeSortHelper(int[] arr,int from, int to, int[]temp)
    {
        if(from<to)
        {
            int middle = (from+to)/2;
            mergeSortHelper(arr,from,middle,temp);
            mergeSortHelper(arr,middle+1,to,temp);
            merge(arr,from,middle,to,temp);
        }
    }
    public static void merge(int[] arr, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid +1;
        int k = from;

        while(i <= mid && j <= to)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= to)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = from; k <= to; k++)
        {
            arr[k] = temp[k];
        }
    }
}
