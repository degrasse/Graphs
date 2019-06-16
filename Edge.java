
public class Edge {

	// fields
	Vertex v1;
	Vertex v2; // two vertex
	
	// constructor
	// you can construct an edge with two adjacent vertices
	
	public Edge(Vertex v1, Vertex v2){
		this.v1 = v1;
		this.v2 = v2;
		

		v1.addNeighbor(v2);
		//v2.addNeighbor(v1);
	}
	
	// get the neighbor of current along this Edge
	// if you are at v1, the neighbor is v2
	// if you are at v2, the neighbor is v1
	
	public Vertex getNeighbor(Vertex current){
		if (!current.equals(v1) || !current.equals(v2)){
			return null;
		}
		else if (current.equals(v1)){
			return v2;
		}
		else{
			return v1;
		}
	}
	
	// get the first vertex of the edge
	public Vertex getFirst(){
		return this.v1;
	}
	
	// get the second vertex of the edge
	public Vertex getSecond(){
		return this.v2;
	}
	
	public String toString(){
		String result ="";
		result += "The egde is between: " + getFirst().toString() + " and " + getSecond().toString();
		return result;
	}
	
}
