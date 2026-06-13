class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < isConnected.length; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (i != j && isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[isConnected.length];

        int ans = 0 ; 

        for (int i = 0; i < visited.length; i++) {

            if (visited[i] == false) {
                ans++; 
                dfs(i , adj , visited); 
            }
        }
        return ans ; 
    }

    public void dfs(int node ,ArrayList<ArrayList<Integer>> adj ,   boolean[] visited){

        visited[node] = true ; 

        for(int edge : adj.get(node)){

            if(visited[edge] == false){
                dfs(edge , adj , visited); 
            }
        }
    }
}