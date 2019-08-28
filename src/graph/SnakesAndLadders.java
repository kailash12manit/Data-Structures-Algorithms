package graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class SnakesAndLadders {
    public static int n = 100;
    static List<List<Integer>> graph;
    static int[] depth;
    static boolean[] visited;
    public static void BFS(int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        depth[vertex] = 0;
        while (queue.size() > 0) {
            vertex = queue.poll();
            for (int i : graph.get(vertex)) {
                if (depth[i] == -1) {
                    queue.add(i);
                    depth[i] = depth[vertex] + (visited[vertex] ? 0 : 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
                for (int j = i + 1; j <= i + 6 && j < n; j++) {
                    graph.get(i).add(j);
                }
            }
            depth = new int[n];
            Arrays.fill(depth, -1);
            visited = new boolean[n];

            int l = in.nextInt();
            for (int i = 0; i < l; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                graph.get(x).clear();
                graph.get(x).add(y);
                visited[x] = true;
            }
            int s = in.nextInt();
            for (int i = 0; i < s; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                graph.get(x).clear();
                graph.get(x).add(y);
                visited[x] = true;
            }
            BFS(0);
            System.out.println(depth[n - 1]);
        }
    }
}