package io.ingnition;

import java.util.LinkedList;

public class Path {
	private LinkedList<Edge> edges;
	private Integer distance;


	public Path(LinkedList<Edge> edges) {
		this.edges = edges;
	}


	public void calculateDistance() {
		this.distance = this.edges
				.stream()
				.map(x -> x.getWeight())
				.reduce(0, (a, b) -> a + b);
	}
	
	/**
	 * Delete oldEdge from Path and insert newEdge1 and newEdge2
	 * @param oldEdge
	 * @param newNode1
	 * @param newNode2
	 */
	public void modifyPath(Edge oldEdge, Edge newEdge1, Edge newEdge2) {
		//Example, we have an edge A,C
		//we want to create a node B between A,C
		//then we create two edges A,B and B,C
		//we delete edge A,C and insert in the same index
		//the two new edges A,B and B,C
		
		int i = this.edges.indexOf(oldEdge);
		this.edges.add(i, newEdge1);
		this.edges.add(i+1, newEdge2);
		this.edges.remove(oldEdge);
		
		//Recalculate distance of path
		this.calculateDistance();		

	}

	public LinkedList getPath() {
		return this.edges;
	}
	
	
	public Integer getDistance() {
		return this.distance;
	}
	
	
	public void printPath() {
		this.edges.forEach(System.out::println);
		System.out.println("Total: " + this.distance);  
	}
}
