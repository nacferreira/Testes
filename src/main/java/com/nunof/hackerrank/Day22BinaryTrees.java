package com.nunof.hackerrank;

import java.util.*;

import com.nunof.databaseaccess.MySQLAccess;

import java.io.*;



class Day22BinaryTrees {

	public static int getHeight(Node root){
		int heightLeft = 1;
		int heightRight = 1;
		
		if(root!=null) {
			// Descer à esquerda
			heightLeft += getHeight(root.left);
			
			// Descer à direita
			heightRight += getHeight(root.right);			
		}
		else {
			return -1;
		}		
			
		return (heightLeft > heightRight? heightLeft:heightRight);		
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
		
		
//		int n=5;
//		while (n-->0){
//			System.out.println(n);
//		}
//		System.out.println("-----");
//		n=5;
//		while (--n>0){
//			System.out.println(n);
//		}
//		System.out.println("-----");
//		n=5;
//		while (n>0){
//			n--;
//			System.out.println(n);
//		}
		
	
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		int height=getHeight(root);
		System.out.println(height);
		
	}	
}
