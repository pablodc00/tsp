package io.ingnition;

import java.util.List;

public class Node {
	String nodeName;
	List<Path> paths;
	
	
	public Node(String nodeName, List<Path> paths) {
		this.nodeName = nodeName;
		this.paths = paths;
	}


}
