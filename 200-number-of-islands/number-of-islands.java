class Solution {
    public int numIslands(char[][] grid) {

     int n=grid.length;
     int m=grid[0].length;

     Queue<int[]> q=new LinkedList<>();
     int count=0;
     int[][] dir ={{0,1},{1,0},{0,-1},{-1,0}};
     boolean visited[][] = new boolean[n][m];

     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='1' && visited[i][j]!=true){
                count++;
                int[] index = {i,j};
                q.add(index);
                visited[i][j]=true;
            }

            while(!q.isEmpty()){
               int[] k = q.poll();

               for(int d=0;d<4;d++){
               int rt=k[0]+dir[d][0];
               int ct =k[1]+dir[d][1];

               if(rt>=0 && ct>=0 &&  rt<n && ct<m && grid[rt][ct]=='1' && visited[rt][ct]!=true){
                int[] ind={rt,ct};
                q.add(ind);
                visited[rt][ct] = true;   
               }
               }  
            
        }
        
     }
    }
    return count;
}
}