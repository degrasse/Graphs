import java.util.ArrayList;

public class Vertex {

	// fields
	int value;
	// all the adjacency vertex or edges
	// The purpose of using the incidence neighborhood (Edges) rather than the adjacency neighborhood (Vertices) 
	// was because path-finding and spanning tree algorithms need the edges to function
	boolean visited;
	
	ArrayList<Vertex> neighbors;
	
	// construct a vertex with a value and no neighbors yet
	public Vertex (int value){
		this.value = value;
		this.neighbors = new ArrayList<Vertex>();
		visited = false;
	}
	
	// add a neighbor only if the neighbor hasn't been added yet
	public void addNeighbor (Vertex v){
		if (!this.neighbors.contains(v)){
			neighbors.add(v);
		}
	}
	
	// find a neighbor 
	public boolean findNeighbor(Vertex v){
		return this.neighbors.contains(v);
	}
	
	// degree of vertex
	public int vertexDegree(){
		return neighbors.size();
	}
	
	// get the value of the vertex
	public int getValue(){
		return this.value;
	}
	
	// has Visited
	public boolean hasVisited(){
		return visited;
	}
	
	// get a specific neighbor with the index
	public Vertex getNeighbor(int index){
		return this.neighbors.get(index);
	}
	
	// delete a neighbor
	public Vertex deleteNeighbor(Vertex v){
		if (neighbors.remove(v)){
			return v;
		}
		else{
			return null;
		}
	}
	
	// get the list of neighbors
	public ArrayList<Vertex> getNeighbors(){
		return this.neighbors;
	}
	
	public String toString(){
		String result = "";
		result += "Vertex: " + value;
		return result;
	}
}
