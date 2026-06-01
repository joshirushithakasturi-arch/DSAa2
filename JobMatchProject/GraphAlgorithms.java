// CO3 BFS and DFS implementation
import java.util.*;

public class GraphAlgorithms {

    int V;
    LinkedList<Integer>[] adj;

    GraphAlgorithms(int v) {

        V = v;

        adj = new LinkedList[v];

        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {

        boolean visited[] =
                new boolean[V];

        Queue<Integer> q =
                new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {

            s = q.poll();

            System.out.print(s + " ");

            for (int n : adj[s]) {

                if (!visited[n]) {

                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    void DFSUtil(int v,
                 boolean visited[]) {

        visited[v] = true;

        System.out.print(v + " ");

        for (int n : adj[v])

            if (!visited[n])
                DFSUtil(n, visited);
    }

    void DFS(int v) {

        boolean visited[] =
                new boolean[V];

        DFSUtil(v, visited);
    }
}