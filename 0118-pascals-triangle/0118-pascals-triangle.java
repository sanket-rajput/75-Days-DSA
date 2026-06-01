class Solution {
    public List<List<Integer>> generate(int numRow) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(numRow == 0) return res;

        List <Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);

        if(numRow == 1) return res;

        for(int i =1; i<numRow; i++){

            List<Integer> prow = res.get(i-1);

            List <Integer> row = new ArrayList<>();

            row.add(1);

            for(int j =1; j<i; j++){
                row.add(prow.get(j) + prow.get(j-1));
            }
            row.add(1);
            res.add(row);

        }
        return res;
        
    }
}