class Solution {
    public int[][] merge(int[][] arr) {

    Arrays.sort(arr, (a,b)-> Integer.compare(a[0],b[0]));

List<int []> ans = new ArrayList<>();

int[] newinter = arr[0];
ans.add(newinter);

for(int[] inter : arr){

    if(inter[0] <= newinter[1]){

        newinter[1]  = Math.max(inter[1] , newinter[1]);

    }else{
        newinter = inter;
        ans.add(newinter);
    }
}
return ans.toArray(new int[ans.size()][]);
        
    }
}