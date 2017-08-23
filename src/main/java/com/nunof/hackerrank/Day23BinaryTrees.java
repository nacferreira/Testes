package com.nunof.hackerrank;

import java.io.*;
import java.util.*;


public class Day23BinaryTrees {

	
	// Level-Order Traversal (BFS)
	static void levelOrder(Node root){

		if (root!=null) {

			Queue<Node> fila = new LinkedList<>();

			fila.add(root);

			while(fila.size() > 0) {

				Node no = fila.remove();

				System.out.print(no.data + " ");

				if(no.left != null) {
					fila.add(no.left);
				}
				if(no.right != null){
					fila.add(no.right);
				}
			}
		}

	}



	public static Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		else{
			Node cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		sc.close();
		levelOrder(root);
	}	
}
