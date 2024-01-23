class Solution {
    public int numRookCaptures(char[][] board) {
        int x  = 0;
        int y = 0;
        int res = 0;
outer:        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j] == 'R'){
                    x = j;
                    y = i;
                    break outer;
                }
                    
            }
        }
        for(int i=x;i<8;i++){
            
            if(board[y][i] == 'p'){
                res++;
                break;
            }else if(board[y][i] == 'B')
                break;
        }
        for(int i=x;i >= 0;i--){
            if(board[y][i] == 'p'){
                res++;
                break;
            }else if(board[y][i] == 'B')
                break;
        }
        for(int i=y;i<8;i++){
            
            if(board[i][x] == 'p'){
                res++;
                break;
            }else if(board[i][x] == 'B')
                break;
        }
        for(int i=y;i >= 0;i--){
            if(board[i][x] == 'p'){
                res++;
                break;
            }else if(board[i][x] == 'B')
                break;
        }
        return res;
    }
}