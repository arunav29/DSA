package AdjacentSquares;

import java.util.Scanner;

public class AdjacentSquares {

    static class Edge {
        int x1, y1, x2, y2;

        Edge(int x1, int y1, int x2, int y2) {
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
        }

        boolean isSame(Edge e) {
            return (this.x1 == e.x1 && this.y1 == e.y1 && this.x2 == e.x2 && this.y2 == e.y2)
                || (this.x1 == e.x2 && this.y1 == e.y2 && this.x2 == e.x1 && this.y2 == e.y1);
        }
    }

    static Edge[][] edges;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        edges = new Edge[n][4];

        for (int i = 0; i < n; i++) {
            int[] coords = new int[8];
            for (int j = 0; j < 8; j++) {
                coords[j] = sc.nextInt();
            }

            for (int j = 0; j < 4; j++) {
                int x1 = coords[(j * 2) % 8];
                int y1 = coords[(j * 2 + 1) % 8];
                int x2 = coords[((j + 1) * 2) % 8];
                int y2 = coords[((j + 1) * 2 + 1) % 8];
                edges[i][j] = new Edge(x1, y1, x2, y2);
            }
        }

        for (int i = 0; i < n; i++) {
            int adjCount = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (hasCommonEdge(edges[i], edges[j])) {
                    adjCount++;
                }
            }

            System.out.println((i + 1) + " " + adjCount);
        }
    }

    static boolean hasCommonEdge(Edge[] a, Edge[] b) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i].isSame(b[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
