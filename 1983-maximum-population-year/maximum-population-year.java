class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[2052];
        for(int[] a: logs){
            arr[a[0]]++;
            arr[a[1]]--;
        }
        int max = -1;
        int maxYear = 0;
        for(int i = 1; i < arr.length; i++) arr[i] += arr[i - 1];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxYear = i;
            }
        }
        return maxYear;
    }
}