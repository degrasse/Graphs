import java.util.ArrayList;

public class Graph {

	// for each Vertex
	// there is a list of edges
	
	// Definition of Graph is G = (V, E)
	// so we need to keep track of a list of Vertex and a list of Edges
	
	// for each Vertex
	// there is a list of edges
	ArrayList<Vertex> vertices;
	ArrayList<Edge> edges;
	
	public Graph(){
		this.vertices = new ArrayList<Vertex>();
		this.edges = new ArrayList<Edge>();
	}
	
	// add vertex into the graph
	
	public void addVertex(Vertex v1){
		// if v1 already exists in the graph
		// don't add
		
		// else, add to the graph
		
		if (vertices.contains(v1)){
			System.out.println("Can't add since v1 already exists.");
		}
		else{
			vertices.add(v1);
			
		}
	}
	
	public boolean hasVertex(Vertex v1){
		return vertices.contains(v1);
	}
	
	// get Vertex by specific value
	public Vertex getVertex(int value){
		for (Vertex v : vertices){
			if (v.value == value){
				return v;
			}
		}
		return null;
	}
	
	// add edge into the graph
	
	public void addEdge(Vertex v1, Vertex v2){
		// if v1 is the same as v2 -> Self loop
		// don't add
		if (v1.equals(v2)){
			System.out.println("Current graph doesn't allow self loop.");
			return;
		}
		Edge edge = new Edge(v1, v2);
		if (edges.contains(edge)){
			System.out.println("There is already an edge exists.");
		}
		else{
			edges.add(edge);
			
			
		}
		// if graph already has the edge
		// don't add
		
	}
	
	// does the graph has a certain edge
	
	public boolean hasEdge(Vertex v1 ,Vertex v2){
		// if the graph doesn't contain v1 or v2,
		// return false
		if (v1== null || v2 == null){
			return false;
		}
		
		return v1.findNeighbor(v2);
		
		// else
		// return true
		
	}

	public ArrayList<Edge> getEdge(){
		return this.edges;
	}
	
	// remove an edge from the graph
	public Edge removeEdge(Vertex v1, Vertex v2){
		
		if (v1== null || v2 == null){
			return null;
		}
		
		else{
			for (int i = 0; i < edges.size(); i++){
				if (edges.get(i).getFirst().getNeighbor(i).equals(v2)){
					
					return edges.remove(i);
				}
			}
			return null;
		}
	}
	
	// dfs
	
	public boolean hasPath(Vertex v1, Vertex v2){
		return getDFSPath( v1, v2 ) != null;
	}
	
	public ArrayList<Vertex> getDFSPath(Vertex v1, Vertex v2){
		
		
		// reset all the visited vertex to unvisited
		
		for (Vertex v: vertices){
			v.visited = false;
		}
		
		// create a path
		
		ArrayList<Vertex> path = new ArrayList<Vertex>();
		
		getDFSPath(v1, v2, path);
		if (path.isEmpty()){
			return null;
		}
		else{
			return path;
		}
	}
	
	
	public ArrayList<Vertex> getDFSPath(Vertex v1, Vertex v2, ArrayList<Vertex> path ){
	
		path.add(v1);
		v1.visited = true;
		
		if (v1.equals(v2)){
			return path;
		}
		
		ArrayList<Vertex> neighbors = v1.getNeighbors();
		for (Vertex v : neighbors){
				if (!v.visited){
					getDFSPath(v, v2, path);
				}
				if (path.get(path.size() - 1).equals(v2)) {
                 return path;
             }
		}
		path.remove(v1);
		return path;
	}
}
