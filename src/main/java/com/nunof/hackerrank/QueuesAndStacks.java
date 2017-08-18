package com.nunof.hackerrank;

import java.util.*;

public class QueuesAndStacks {

	private Stack<Character> stackChar;	
	private Queue<Character> queueChar;

	public QueuesAndStacks() {
		stackChar = new Stack<Character>();
		queueChar = new LinkedList<>();					
	}

	void pushCharacter(char c) {
		stackChar.push(c);
	}

	void enqueueCharacter(char c){
		queueChar.add(c);
	}

	char popCharacter() {
		return stackChar.pop();
	}

	char dequeueCharacter() {
		return queueChar.remove();
	}

}
