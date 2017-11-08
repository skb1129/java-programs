import java.util.*;

class Graph {
	int vertices;
	ArrayList<Integer>[] edges;
	ArrayList<Integer>[] weights;

    Graph(int n) {
        vertices = n;
        edges = new ArrayList[vertices];
		weights = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++){
			weights[i] = new ArrayList<Integer>();
			edges[i] = new ArrayList<Integer>();
		}
    }

    void addEdge(int i, int j, int w) {
		edges[i].add(j);
		weights[i].add(w);
    }

	void removeEdge(int i, int j) {
		Iterator<Integer> it = edges[i].iterator();
		Iterator<Integer> wt = weights[i].iterator();
        while (it.hasNext()){
			wt.next();
            if (it.next() == j){
				it.remove();
				wt.remove();
                return;
            }
        }
    }

	void print() {
		for(int i=0 ; i<vertices; i++)
			System.out.print("\t" + i);
		System.out.println();
		for(int i=0 ; i<vertices; i++){
			System.out.print(i);
			Iterator<Integer> wt = weights[i].iterator();
			for(int j=0 ; j<vertices; j++){
				if(edges[i].contains(j))
	            	System.out.print("\t" + wt.next());
				else
					System.out.print("\t0");
	        }
			System.out.println();
		}
	}

	int shortestPath(int src, int dest, int dist) {
		Iterator<Integer> it = edges[src].iterator();
		Iterator<Integer> wt = weights[src].iterator();
		if(src == dest){
			return 0;
		}
		int weight=0;
        while (it.hasNext()){
			int ndist = shortestPath(it.next(), dest, dist);
			if(dist > ndist){
				weight = wt.next();
				dist = ndist;
			}
			else{
				wt.next();
			}
		}
		dist += weight;
		return dist;
	}
}
public class GraphW {
	public static void main(String[] args) {
		Graph g = new Graph(6);
		g.addEdge(0, 1, 4);
		g.addEdge(0, 2, 5);
		g.addEdge(1, 3, 10);
		g.addEdge(3, 5, 8);
		g.addEdge(2, 4, 3);
		g.addEdge(4, 5, 9);
		g.addEdge(2, 3, 3);
		g.print();
		System.out.println(g.shortestPath(0, 3, 10000));
	}
}