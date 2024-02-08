class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setColumns;
        Set<Integer> setRows;

        int size = matrix.length;
        for(int i=1;i<=size;i++)
            set.add(i);
        int count = 0;
        for(int i=0;i<size;i++){
            setRows = new HashSet<>();
            for(int j=0;j<size;j++)
                setRows.add(matrix[i][j]);
            if(setRows.size() != size)
                return false;
        }
        
        for(int i=0;i<size;i++){
          setColumns  = new HashSet<>();
            for(int j=0;j<size;j++)
                setColumns.add(matrix[j][i]);
            if(setColumns.size() != size)
                return false;
        }
        return true;
    }
}