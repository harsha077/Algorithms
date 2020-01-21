package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

enum State { unvisited, visiting, visited }

public class CreateNodeGraph<T>{
	public List<Vertex> listOfNodes;
	
	public CreateNodeGraph(){
		listOfNodes = new CopyOnWriteArrayList<Vertex>();
	}
	
	public void addNode(T label) {
		Vertex v = new Vertex(label);
		v.adjVertices = new LinkedList<Vertex>();
		v.visitStatus = State.unvisited;
		listOfNodes.add(v);
	}
	
	public void removeNode(T label) {
		Vertex v = null;
		for(Vertex item: listOfNodes) {
			if(item.label.equals(label)) {
				listOfNodes.remove(item);
				break;
			}
		}
	}
	
	
	
	public void addEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		
	}
}

class Vertex<T>{
	State visitStatus;
	LinkedList<Vertex> adjVertices;
	T label;
	
	public Vertex(T label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((adjVertices == null) ? 0 : adjVertices.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		//result = prime * result + ((visitStatus == null) ? 0 : visitStatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (adjVertices == null) {
			if (other.adjVertices != null)
				return false;
		} else if (!adjVertices.equals(other.adjVertices))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (visitStatus != other.visitStatus)
			return false;
		return true;
	}
}
/*public class CreateNodeGraph<T> {
	public Map<Vertex, ArrayList<Vertex>> map;
	
	public CreateNodeGraph() {
		map = new ConcurrentHashMap<Vertex, ArrayList<Vertex>>(); 
	}
	
	public void addVertex(T label) {
		map.putIfAbsent(new Vertex(label), new ArrayList<Vertex>());
	}
	
	public void removeVertex(T label) {
		map.values().forEach(e->e.remove(new Vertex(label)));
		map.remove(new Vertex(label));
	}
	
	//bidirectional
	public void addEdge(T label1, T label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		if(v1!=null)
		{
			map.get(v1).add(v2);
		}
		if(v2!=null)
		{
			map.get(v2).add(v1);
		}
	}
	
	public Vertex setVertexAsVisited(Vertex node) {
		for(Entry<Vertex, ArrayList<Vertex>> item: map.entrySet()) {
			if(item.getKey().equals(node)) {
				item.getKey().visited = true;
				node = item.getKey();
			}
		}
		return node;
	}
	
	public void printAllLinks(){
		for(Entry<Vertex, ArrayList<Vertex>> item: map.entrySet()) {
			Vertex v = item.getKey();
			for(Vertex adjV: item.getValue()) {
				System.out.println(v.value + "->"+ adjV.value);
			}
		}
	}
	
	//
	public Vertex createVertex(T label) {
		Vertex v = null;
		if(label!=null) v = new Vertex(label);
		return v;
	}
	
	public Vertex isVisited(Vertex v) {
		if(v!=null)	v.visited = true;
		return v;
	}
}

class Vertex<T>{
	State visitStatus = State.unvisited;
	T value;
	
	public Vertex(T value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		//result = prime * result + ((visited == null) ? 0 : visited.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (visitStatus == null) {
			if (other.visitStatus != null)
				return false;
		} else if (!visitStatus.equals(other.visitStatus))
			return false;
		return true;
	}
}*/
