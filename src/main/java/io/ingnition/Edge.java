package io.ingnition;

public class Edge {
	private String node1;
	private String node2;
	private Integer weight;
	
	public Edge(String node1, String node2, Integer weigh) {
		this.node1 = node1;
		this.node2 = node2;
		this.weight = weigh;
	}

	public String getNode1() {
		return node1;
	}

	public void setNode1(String node1) {
		this.node1 = node1;
	}

	public String getNode2() {
		return node2;
	}

	public void setNode2(String node2) {
		this.node2 = node2;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(this.node1).append(",").append(this.node2).append("]:").append(this.weight);		

		return sb.toString();
	}
}
