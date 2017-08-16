package com.nunof.hackerrank;

//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.security.GeneralSecurityException;
//import java.util.regex.*;
import java.util.stream.Collectors;

public class xor {

	
	public static List<List<Integer>> listPermutations(List<Integer> list) {

		if (list.size() == 0) {
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			result.add(new ArrayList<Integer>());
			return result;
		}

		List<List<Integer>> returnMe = new ArrayList<List<Integer>>();

		Integer firstElement = list.remove(0);

		List<List<Integer>> recursiveReturn = listPermutations(list);
		for (List<Integer> li : recursiveReturn) {

			for (int index = 0; index <= li.size(); index++) {
				List<Integer> temp = new ArrayList<Integer>(li);	            
				temp.add(index, firstElement);
				returnMe.add(temp);
			}

		}
		return returnMe;
	}

	public void Solution(){

		Scanner sc = new Scanner(System.in);
		try
		{

			int n = Integer.parseInt(sc.nextLine());

			// Check size constraints
			if (n<=1 || n>100){
				sc.close();
				//System.out.println("-1");
				System.out.println("n out of bounds: " + n);
				return;
			}


			String[] initialInput = sc.nextLine().split(" ");
			sc.close();
			// Check array constraints
			if(initialInput.length != n){
				//System.out.println("-1");
				System.out.println("Tamanhos diferentes.");
				return;
			}


			// Converter o array de string em lista de integers
			List<Integer> integerList = Arrays.asList(initialInput).stream().map(s -> Integer.parseInt(s.trim())).collect(Collectors.toList());		



			// Gerar as permutações
			List<List<Integer>> myLists = listPermutations(integerList);

			int menorTodos = -1;

			for (List<Integer> currentList : myLists) {
				int min = -1;
				for (int i=0; i<currentList.size(); i++){
					int currentXor = 0;

					if (currentList.get(i) < 0) { System.out.println("Menor que 0."); return; }
					if (currentList.get(i) > Math.pow((int)10, (int)9)) { System.out.println("Maior que 10^9."); return; }

					// Tratar o último caso

					if (i == currentList.size() -1) {						
						currentXor = currentList.get(i) ^  currentList.get(0); 
					}
					else {
						currentXor = currentList.get(i) ^  currentList.get(i+1);
						// Inicializar no primeiro caso
						if(i==0) { min = currentXor; }
					}

					if ( currentXor < min ){
						min = currentXor;
					}			
				}

				// Verificar se o mínimo é menor que uma das potencias.
				int i = 0;
				while(Math.pow(2, i) < min ) {
					i++;
				}

				// Se o i for 0 é porque o menor de todos é o 1. Termina.
				if(i==0) {
					menorTodos=1;
				}
				else {
					if (menorTodos == -1) {
						menorTodos = i-1;
					}
					else {
						if (i-1 < menorTodos) {
							menorTodos = i-1;
						}				
					}		
				}
			}
			
			System.out.println(menorTodos);

		}

		catch (Exception e){
			// System.out.println("-1"); 
			System.out.println("Erro -> " + e.toString());
			return; 
		}

		finally {			
			sc.close();
		}



	}
}


