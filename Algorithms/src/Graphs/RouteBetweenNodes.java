package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//enum State { Unvisited, Visiting, Visited }

public class RouteBetweenNodes {

	public static void main(String... args) {
		CreateNodeGraph<String> graph = new CreateNodeGraph<String>();
		
		graph.addNode("a");
		graph.removeNode("a");
		//System.out.println(findRoute(v1,v2,graph));
	}
	
	
	
	
	//No vertex, Just a regular Hashmap with 
	/*public static boolean findRoute(String source, String destination,CreateGraph<String> graph) {
		boolean found = false;
		Queue<String> queue = new LinkedList<String>();
		
		queue.add(source);
		
		while(!queue.isEmpty()) {
			String currentNode = queue.poll();
			ArrayList<String> listOfConnections = graph.map.get(currentNode);
		
			for(String str:listOfConnections) {
				if(str == destination) {
					found  = true;
					return found;
				}
				queue.add(str);
			}
		}
		return found;
	}*/
	
	//Hashmap with vertex class(not working)
	/*public static boolean findRoute(Vertex start, Vertex destination, CreateNodeGraph<String> graph) {
		boolean found = false;
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
		
		start.visitStatus = State.visiting;
		queue.add(start);
		Vertex v;
		 while(queue!=null) {
			 v = queue.poll();
			
			 for(Vertex adjV: v.adjVertices) {
				 if(adjV.visitStatus == State.unvisited)
				 {
				 	if(adjV==destination) {
						 found=true;
						 break;
					 }else {
						 adjV.visitStatus = State.visiting;
						 queue.add(adjV);
					 }
				 }
				 v.visitStatus = State.visited;
			 }
		 }
		return found;
	}*/
	
	/*public static void findRouteAndPrintIt(String source, String destination,CreateGraph<String> graph) {
		
	}*/
}
