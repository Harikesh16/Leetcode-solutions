// https://leetcode.com/problems/kth-ancestor-of-a-tree-node

class TreeAncestor {
    int[][] dp;
   // int[] depth;
    int log;

    public TreeAncestor(int n, int[] parent) {
        log = 0;
        while((1<<(log))<=n){
            log++;
        }
      //  parent[0] =0;
        dp = new int[n][log];
       // depth = new int[n];
        for(int v =0; v<n; v++){
            dp[v][0] = parent[v];
        }
        for(int j =1; j<log; j++){
           for(int v =0; v<n; v++){
               if(dp[v][j-1]==-1){
                   dp[v][j] =-1;
               }
               else
                    dp[v][j] = dp[dp[v][j-1]][j-1];
           }
        } 
        
        
    }
    
    public int getKthAncestor(int node, int k) {
        for(int j = 0; j<log; j++){
            if((k&(1<<j))!=0){
                node = dp[node][j];
            }
            if(node==-1){
                break;
            }
        }
        return node;
        
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */