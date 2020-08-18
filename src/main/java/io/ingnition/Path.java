package io.ingnition;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.Validate;

public class Path {
	private List<Edge> edges;
	private Integer distance;
	
	
	public Path(List<Edge> edges, Integer distance) {
		this.edges = edges;
		this.distance = distance;
	}
	
	
	public void calculateDistance() {
		this.distance = this.edges
				.stream()
				.map(x -> x.getWeight())
				.reduce(0, (a, b) -> a + b);
	}
	
	/**
	 * Delete oldEdge from Path and insert newEdge1 and newEdge2
	 * Pre-Conditions: 
	 * 1 oldEdge.node1 = newEdge1.node1,
	 * 2 oldEdge.node2 = newEdge2.node2,
	 * 3 newEdge1.node2 = newEdge2.node1
	 * @param oldEdge
	 * @param newNode1
	 * @param newNode2
	 */
	public void modifyPath(Edge oldEdge, Edge newEdge1, Edge newEdge2) {
		Validate.isTrue(
				oldEdge.getNode1().equals(newEdge1.getNode1()) &&
				oldEdge.getNode2().equals(newEdge2.getNode2()) &&
				newEdge1.getNode2().equals(newEdge2.getNode1()) 
				);
		
		
		int i = this.edges.indexOf(oldEdge);
		this.edges.add(i, newEdge1);
		this.edges.add(i+1, newEdge2);
		this.edges.remove(oldEdge);
		
		//Recalculate distance of path
		this.calculateDistance();
		
		
	}
	
	
}
