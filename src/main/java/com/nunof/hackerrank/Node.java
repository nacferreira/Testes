package com.nunof.hackerrank;

class SimpleNode {
	int data;
	
	SimpleNode next;	
	
	SimpleNode(int d) {
		data = d;
		next = null;
	}
}


// Node com left e right
class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}