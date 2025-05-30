
//dfs 
import java.util.*;
class solution {
    public static void dfss(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);

        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfss(it, vis, adj, ls);
            }
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size(); // total number of vertices
        boolean vis[] = new boolean[v];
        ArrayList<Integer> ls = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfss(i, vis, adj, ls);
            }
        }
        return ls;
    }



    public static void main(String[] args) {
        int V = 5; // Number of vertices (0 to 4)

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(3).add(4);
        adj.get(4).add(3);

        // Create Solution object and perform DFS
        solution sol = new solution();
        ArrayList<Integer> dfsResult = sol.dfs(adj);

        // Print the DFS traversal
        System.out.println("DFS Traversal: " + dfsResult);
    }
}

