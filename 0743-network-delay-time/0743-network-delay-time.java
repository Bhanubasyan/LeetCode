
import java.util.*; // 1

class Solution { // 2

    public int networkDelayTime(int[][] times, int n, int k) { // 3

        List<List<int[]>> graph = new ArrayList<>(); // 4

        for (int i = 0; i <= n; i++) { // 5
            graph.add(new ArrayList<>()); // 6
        }

        for (int[] edge : times) { // 7
            graph.get(edge[0]).add(
                new int[]{edge[1], edge[2]}
            ); // 8
        }

        int[] dist = new int[n + 1]; // 9
        Arrays.fill(dist, Integer.MAX_VALUE); // 10
        dist[k] = 0; // 11

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        ); // 12

        pq.offer(new int[]{k, 0}); // 13

        while (!pq.isEmpty()) { // 14

            int[] current = pq.poll(); // 15

            int node = current[0]; // 16
            int time = current[1]; // 17

            if (time > dist[node]) continue; // 18

            for (int[] neighbor : graph.get(node)) { // 19

                int nextNode = neighbor[0]; // 20
                int weight = neighbor[1]; // 21

                if (time + weight < dist[nextNode]) { // 22

                    dist[nextNode] = time + weight; // 23

                    pq.offer(
                        new int[]{nextNode, dist[nextNode]}
                    ); // 24
                }
            }
        }

        int answer = 0; // 25

        for (int i = 1; i <= n; i++) { // 26

            if (dist[i] == Integer.MAX_VALUE) { // 27
                return -1;
            }

            answer = Math.max(answer, dist[i]); // 28
        }

        return answer; // 29
    }
}
