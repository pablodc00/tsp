package io.ingnition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//create edges
		Edge edgeAB = new Edge("A", "B", 20);
		Edge edgeBC = new Edge("B", "C", 30);
		Edge edgeCD = new Edge("C", "D", 12);
		Edge edgeAD = new Edge("A", "D", 35);
		Edge edgeBD = new Edge("B", "D", 34);
		Edge edgeAC = new Edge("A", "C", 42);


		Edge edgeBA = new Edge("A", "B", 20);
		Edge edgeCA = new Edge("A", "C", 42);
		Edge edgeDA = new Edge("A", "D", 35);

		
		//Create list of paths for node A for testing purposes but
		//we need to create list of paths for all nodes
		//This process can be automated, but here I'm doing it manually
		//in order to show it as an example
		
		List<Path> paths = new ArrayList<>();
		
		LinkedList<Edge> paths1 = new LinkedList<>();
		paths1.add(edgeAB);
		paths1.add(edgeBC);
		paths1.add(edgeCD);
		paths1.add(edgeDA);
		Path path1 = new Path(paths1);
		path1.calculateDistance();
		paths.add(path1);
		
		
		LinkedList<Edge> paths2 = new LinkedList<>();
		paths2.add(edgeAB);
		paths2.add(edgeBD);
		paths2.add(edgeCD);
		paths2.add(edgeCA);
		Path path2 = new Path(paths2);
		path2.calculateDistance();
		paths.add(path2);
		

		LinkedList<Edge> paths3 = new LinkedList<>();
		paths3.add(edgeAC);
		paths3.add(edgeBC);
		paths3.add(edgeBD);
		paths3.add(edgeDA);
		Path path3 = new Path(paths3);
		path3.calculateDistance();
		paths.add(path3);
		

		LinkedList<Edge> paths4 = new LinkedList<>();
		paths4.add(edgeAC);
		paths4.add(edgeCD);
		paths4.add(edgeBD);
		paths4.add(edgeBA);
		Path path4 = new Path(paths4);
		path4.calculateDistance();
		paths.add(path4);

		Node nodeA = new Node("A", paths);
		
		//shortest possible route that visits each Node and returns to the origin Node
		Path minPath = nodeA.getPaths()
			.stream()
			.min(Comparator.comparing(Path::getDistance))
			.get();
		
		minPath.printPath();
		
		
		//TODO 
		//Add node to graph
		//need to call Path.modifyPath(Edge oldEdge, Edge newEdge1, Edge newEdge2)
	}

}
