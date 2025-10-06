package guvi_day_20;
import java.util.*;
public class Graph {
int numVertices;
LinkedList <Integer> adjList[];
public Graph(int vertices) {
numVertices=vertices;
adjList=new LinkedList[numVertices];
for(int i=0;i<numVertices;i++) {
	adjList[i]=new LinkedList<>();
}
}
public void  addVertices(int v,int a) {
	adjList[v].add(a);
	adjList[a].add(v);
}
public void bfs(int startVertices) {
	boolean[]visited = new boolean[numVertices];
	Queue<Integer>queue=new LinkedList<>();
	visited[startVertices]=true;
	queue.add(startVertices);
	while(!queue.isEmpty()) {
		int curr=queue.poll();
		System.out.print(curr+ " ");
		Iterator<Integer>i=adjList[curr].listIterator();
		while(i.hasNext()) {
			int adjVertices=i.next();
			if(!visited[adjVertices]) {
				visited[adjVertices]=true;
				queue.add(adjVertices);
				
			}
		}
	}
}
		public void dfs(int startVertices1) {
			boolean[]visited = new boolean[numVertices];
			Stack<Integer>stack=new Stack<>();
			visited[startVertices1]=true;
			stack.add(startVertices1);
			while(!stack.isEmpty()) {
				int curr=stack.pop();
				System.out.print(curr+ " ");
				Iterator<Integer>i=adjList[curr].descendingIterator();
				while(i.hasNext()) {
					int adjVertices=i.next();
					if(!visited[adjVertices]) {
						visited[adjVertices]=true;
						stack.add(adjVertices);
						
					}
				}
	}
	}
public static void main(String[]args) {
	Graph graph=new Graph(5);
	graph.addVertices(4, 1);
	graph.addVertices(4, 2);
	graph.addVertices(4, 3);
	graph.addVertices(1, 0);
	graph.addVertices(3, 0);
	graph.addVertices(2, 0);
graph.bfs(2);
System.out.println( );
graph.dfs(2);
System.out.println( );
}
}
