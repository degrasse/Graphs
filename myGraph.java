
public class myGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		
		//add vertices to the graph
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		
		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		graph.addVertex(v4);
		graph.addVertex(v5);
		
		//int size = 5;
		System.out.println("There are " + graph.vertices.size() + " vertices in the graph.");
		//System.out.println("There are " + graph.edges.size() + " egdes in the graph.");

        
		// add edges
		// pair some vertices
		// but no duplicated edges
		// example: if there is 1-2, then there isn't 2-1
		graph.addEdge(v1, v2);
		graph.addEdge(v1, v3);
		graph.addEdge(v1, v4);
		graph.addEdge(v2, v4);
		graph.addEdge(v3, v5);
		graph.addEdge(v4, v5);
		
		System.out.println("There are " + graph.edges.size() + " egdes in the graph.");
		
		for (int i = 0; i < graph.edges.size(); i++){
			System.out.println(graph.edges.get(i).toString());
		}
		
		// graph contains a vertex 1
		System.out.println("The graph contains a vertex 1: " + graph.hasVertex(v1));
		
		// adding new vertex 10
		System.out.println("Adding a new Vertex...");
		Vertex v6 = new Vertex(6);
		graph.addVertex(v6);
		System.out.println("Done adding a new Vertex!");
		System.out.println("There are " + graph.vertices.size() + " vertices in the graph.");
		
		// remove vertex 
		// new vertex connects to v2, v4 and v5
		System.out.println("Adding new edges...");
		graph.addEdge(v2, v6);
		graph.addEdge(v4, v6);
		graph.addEdge(v5, v6);
		System.out.println("Done adding new edges!");
		
		System.out.println("There are " + graph.edges.size() + " egdes in the graph.");
		
		for (int i = 0; i < graph.edges.size(); i++){
			
			System.out.println(graph.edges.get(i));
		}
		
		// does the graph contain a vertex with value 8
		System.out.println("Graph has vertex 8: " + graph.hasVertex(graph.getVertex(8)));
		
		// does the graph contain a vertex with value 6
		System.out.println("Graph has vertex 6: " + graph.hasVertex(graph.getVertex(6)));
		
		// contains an edge between v1 and v2
		System.out.println("Graph has an edge between 1 and 2: " + graph.hasEdge(graph.getVertex(1), graph.getVertex(2)));
		
		// contains an edge between v1 and v5
		System.out.println("Graph has an edge between 1 and 5: " + graph.hasEdge(graph.getVertex(1), graph.getVertex(5)));

		System.out.println("Path between v1 and v6: " + graph.getDFSPath(graph.getVertex(1), graph.getVertex(6)));
	
	}

}
