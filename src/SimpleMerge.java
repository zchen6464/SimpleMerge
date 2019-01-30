/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length+ arr2.length];
        int last = arr1.length;
        for(int i = 0; i < arr1.length; i++)
        {
            out[i] = arr1[i];
        }
        for(int i = arr2.length; i >= 0; i--)
        {
            for(int j = last; j >=0; j--)
            {
                if(arr2[i] < out[j])
                {
                    int temp = out[j];
                    out[j] = arr2[i];
                    out[j+1] = temp;
                }
            }
        }
        
        return out;
    }

}
