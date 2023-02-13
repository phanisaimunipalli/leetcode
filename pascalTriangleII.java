class Solution {
    public List<Integer> getRow(int rowIndex) {
       
        // val[n] ==> prev[n] + prev[n - 1]


        // pascal traingle can be stored as an array list of each row
        List<Integer> rows = new ArrayList<>(rowIndex + 1);
        rows.add(1);    // add the first value manually

        for(int i = 0; i < rowIndex; i++){
            // first time since j = i, j starts from second increment after becoming 1
            for(int j = i; j > 0; j--){
                rows.set(j, rows.get(j) + rows.get(j - 1)); // row.set(1, 1 + ())
            }
            // because first time it skips j loop, it adds 1 below so that second row is filled with [1, 1]
            rows.add(1);
        }

        return rows;

    }

    // just a debugguing function | not required for original solution
    public void printList(List<Integer> rows){
        for(int n : rows){
            System.out.print(n + " | ");
        }
        System.out.println("");
    }
}




// 1 | 
// i: 0
// i: 1
// j: 1
// rows.get(i): 1
// rows.get(j): 1
// rows.get(j - 1): 1
// 1 | 1 | 
// i: 2
// j: 2
// rows.get(i): 1
// rows.get(j): 1
// rows.get(j - 1): 2
// 1 | 2 | 1 | 
// j: 1
// rows.get(i): 3
// rows.get(j): 2
// rows.get(j - 1): 1
// 1 | 2 | 3 | 
