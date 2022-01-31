package com.greatlearning.service;
import java.util.ArrayList;

public class FindLongestPath {
		// define class Node
		static class Node {
			Node leftNode;
			Node rightNode;
			int nodeData;
			}
		
		static Node newNode (int nodeData) {
			Node temp = new Node();
			
			temp.nodeData = nodeData;
			temp.leftNode = null;
			temp.rightNode = null;	
			
			return temp;
		}
	
		
		public static ArrayList<Integer> findLongestPath(Node root){
		
		// If root is null means there is no Binary tree so
		// return an empty vector
		if(root==null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}

		// Recursive call on root.rightNode
		ArrayList<Integer> rightArray = findLongestPath(root.rightNode);

		//Recursive call on root.lefttNode
		ArrayList<Integer> leftArray = findLongestPath(root.leftNode);

		//Compare the size of the two ArrayList
		// and insert current node accordingly
		if (rightArray.size() < leftArray.size()) {
			leftArray.add(root.nodeData);
		}
		else {
			rightArray.add(root.nodeData);
		}

	// return the appropriate Arraylist
	return (leftArray.size() > rightArray.size() ? leftArray : rightArray);

	}

				//Driver code
				public static void main (String[] args) {
				
				//hardcoding the input tree	
				Node root = newNode(100);
				root.leftNode = newNode(20);
				root.rightNode = newNode(130);
				root.leftNode.leftNode = newNode(10);
				root.leftNode.rightNode = newNode(50);
				root.rightNode.leftNode = newNode(110);
				root.rightNode.rightNode = newNode(140);
				root.leftNode.leftNode.leftNode = newNode(5);
				
				//calling the function to find the longest path
				ArrayList<Integer> output = findLongestPath(root);
				int size = output.size();
				
				//print the result as output
				System.out.print(output.get(size - 1));
				for (int i = size - 2; i>=0; i--) {
					System.out.print(" -> " + output.get(i));
				}
		}
}

