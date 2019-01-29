/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length+ arr2.length];
        int selected = 0;
        for(int i = 0; i < arr1.length;i++)
        {
            for(int j = i; j< arr2.length; j++)
            {
                if(arr2[j] < arr1[i])
                {
                    selected = arr2[j];
                }
                else
                {
                    selected = arr1[i];
                }
            }
        }
        return out;
    }

}
