import java.util.*;

public class GraphAdjList {
    int vertices;
    LinkedList<Integer>[] adjLists;

    GraphAdjList(int n) {
        vertices = n;
        adjLists = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    void addEdge(int i, int j) {
        adjLists[i].add(j);
    }

	void removeEdge(int i, int j) {
        Iterator<Integer> it = adjLists[i].iterator();
        while (it.hasNext()) {
            if (it.next() == j) {
                it.remove();
                return;
            }
        }
    }

	void print() {
		for(int i=0 ; i<vertices; i++)
			System.out.println(i + " : " + adjLists[i]);
	}

    public static void main(String args[]) {
        GraphAdjList g = new GraphAdjList(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 0);
		g.addEdge(2, 3);
		g.removeEdge(0,1);
		g.print();
    }
}
