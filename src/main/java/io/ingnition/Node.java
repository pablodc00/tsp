package io.ingnition;

import java.util.List;

public class Node {
	private String nodeName;
	private List<Path> paths;

	public Node(String nodeName, List<Path> paths) {
		this.nodeName = nodeName;
		this.paths = paths;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public List<Path> getPaths() {
		return paths;
	}

	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}
	
}
