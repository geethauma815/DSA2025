class Solution {
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
        int v = adj.size();
        boolean vis[] = new boolean[v];
        ArrayList<Integer> ls = new ArrayList<>();
        dfss(0, vis, adj, ls);
        return ls;
    }
}
