import java.util.*;

public class GraphAdjMatrix {
    int vertices;
    ArrayList<Integer>[] adjLists;

    GraphAdjMatrix(int n) {
        vertices = n;
        adjLists = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new ArrayList<Integer>();
    }

    void addEdge(int i, int j) {
        adjLists[i].add(j);
    }

	void removeEdge(int i, int j) {
        Iterator<Integer> it = adjLists[i].iterator();
        while (it.hasNext()){
            if (it.next() == j){
                it.remove();
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
			for(int j=0 ; j<vertices; j++){
				if(adjLists[i].contains(j))
	            	System.out.print("\t1");
				else
					System.out.print("\t0");
	        }
			System.out.println();
		}
	}

    public static void main(String args[]) {
        GraphAdjMatrix g = new GraphAdjMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(1, 0);
		g.print();
    }
}
