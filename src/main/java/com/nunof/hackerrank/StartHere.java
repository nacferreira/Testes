package com.nunof.hackerrank;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.nunof.databaseaccess.MySQLAccess;


/*
 * Alterado no MASTER!!!
 */

public class StartHere {

	//	public static void main(String[] args) {
	//
	//		
	////		xor teste= new xor();
	////		
	////		teste.Solution();
	//		
	////		Day1DataTypes teste = new Day1DataTypes();
	////		
	////		teste.Solution();
	//		
	//		Tests();
	//
	//	}
	//	
	//	static int[] compara(int a, int b){
	//		
	//		if (a>b) return new int[] {1,0};
	//		if (a==b) return new int[] {0,0};		
	//		return new int[] {0,1};		
	//	}
	//	
	//	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
	//		int[] result = {0, 0};
	//		int[] temp = {0, 0};
	//		
	//		temp = compara(a0, b0);
	//		result[0] += temp[0];
	//		result[1] += temp[1];
	//		
	//		temp = compara(a1, b1);
	//		result[0] += temp[0];
	//		result[1] += temp[1];
	//		
	//		temp = compara(a2, b2);
	//		result[0] += temp[0];
	//		result[1] += temp[1];
	//
	//		return result;
	//	}
	//	
	//	private static void Tests(){
	//	
	//        Scanner in = new Scanner(System.in);
	//        int a0 = in.nextInt();
	//        int a1 = in.nextInt();
	//        int a2 = in.nextInt();
	//        int b0 = in.nextInt();
	//        int b1 = in.nextInt();
	//        int b2 = in.nextInt();
	//        int[] result = solve(a0, a1, a2, b0, b1, b2);
	//        for (int i = 0; i < result.length; i++) {
	//            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	//        }
	//        System.out.println("");
	//        
	//        in.close();
	//		
	//	}





	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        int n = in.nextInt();
	//        
	//        long diag1 = 0;
	//        long diag2 = 0;
	//        
	//        // Ler a matrix e calcular em runtime a soma das diagonais possiveis
	//        // Podemos fazer isto sem a matriz e usar uma só variável. Faço com matriz para ver como funciona.
	//        int[][] ar = new int[n][n];
	//        
	//        for(int r_i = 0; r_i < n; r_i++){
	//        	for (int c_i=0; c_i < n; c_i++){
	//        		ar[r_i][c_i] = in.nextInt();
	//        		if(r_i==c_i) diag1+= ar[r_i][c_i];  
	//        		if(c_i == n - 1- r_i) diag2+= ar[r_i][c_i];
	//        	}
	//        }
	//
	//              
	//        System.out.println(Math.abs(diag1-diag2));
	//        
	//        in.close();        
	//    }

	//    public static void main(String[] args) {
	//    	  Scanner in = new Scanner(System.in);
	//    	  
	//    	  int n = in.nextInt();
	//
	//    	  //int[] numbers = new int[n];
	//    	  int number;
	//
	//    	  int nPos = 0;
	//    	  int nNeg = 0;
	//    	  int nZero = 0;
	//    	  for (int i = 0; i < n; i++)
	//    	  {    		  
	//    		  //numbers[i] = in.nextInt();
	//    		  number = in.nextInt();
	//    		  if (number == 0) nZero++;
	//    		  else if (number > 0) nPos++;
	//    		  else nNeg++;
	//    	  }
	//    	  
	//    	  double resZero = (double)nZero/(double)n;
	//    	  double resPos = (double)nPos/(double)n;
	//    	  double resNeg = (double)nNeg/(double)n;
	//    	  
	//    	  System.out.println(resPos);
	//    	  System.out.println(resNeg);
	//    	  System.out.println(resZero);
	//
	//    	  in.close();
	//    	
	//    }


	//	public static void main(String[] args) {
	//		Scanner in = new Scanner(System.in);
	//
	//		int n = in.nextInt();
	//
	//
	//		for (int i = 0; i<n; i++) {
	//			int toPrintSpaces = n - 1 - i;
	//			for (int j = 0 ; j<n; j++) {
	//				if (toPrintSpaces > 0) {
	//					System.out.print(" ");
	//					toPrintSpaces--;
	//				}
	//				else System.out.print("#"); 
	//			}
	//			System.out.println("");
	//		}
	//		
	//		in.close();
	//
	//	}


	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        int[] arr = new int[5];
	//        for(int arr_i=0; arr_i < 5; arr_i++){
	//            arr[arr_i] = in.nextInt();
	//        }
	//        
	//        in.close();
	//        
	//        double minSum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
	//        double maxSum = 0;
	//        
	//        int jump = 0;
	//        for (int i = 0; i<5; i++) {
	//        	double currentSum = 0;
	//    		
	//        	for (int j= 0; j<5; j++) {
	//        		if (j != jump){
	//        			currentSum += arr[j];
	//        		}
	//        	}
	//        	jump++;
	//        	
	//        	if (currentSum > maxSum) maxSum = currentSum;
	//        	if (currentSum < minSum) minSum = currentSum;
	//        	
	//        }
	//        
	//        System.out.print((long)minSum + " " + (long)maxSum);
	//    }


	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        int[] arr = new int[5];
	//        for(int arr_i=0; arr_i < 5; arr_i++){
	//            arr[arr_i] = in.nextInt();
	//        }
	//        
	//        in.close();
	//        
	//        int max = arr[0];
	//        int min = arr[0];
	//        long sum = 0;
	//        
	//        for (int i = 0; i<5; i++) {
	//        	if (arr[i] > max) max = arr[i];
	//        	if (arr[i] < min) min = arr[i];
	//        	sum += arr[i];
	//        }
	//        
	//        System.out.print((sum-max) + " " + (sum-min));
	//    }


	//    static int birthdayCakeCandles(int n, int[] arr) {
	//        // Complete this function
	//    	int max = arr[0];
	//    	
	//    	for (int i = 0; i<n; i++) {
	//    		if (arr[i] > max) max = arr[i];
	//    	}
	//    	
	//    	int total = 0;
	//    	for (int i = 0; i<n; i++) {
	//    		if (arr[i] == max) total++;
	//    	}
	//    	return total;
	//
	//    }
	//
	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        int n = in.nextInt();
	//        int[] ar = new int[n];
	//        for(int ar_i = 0; ar_i < n; ar_i++){
	//            ar[ar_i] = in.nextInt();
	//        }
	//        int result = birthdayCakeCandles(n, ar);
	//        System.out.println(result);
	//    }

	//    static int[] solve(int[] grades){
	//        // Complete this function
	//    	
	//    	int[] result = new int[grades.length];
	//    	
	//    	for(int i=0;i<grades.length; i++){
	//    		if(grades[i] < 38){
	//    			result[i] = grades[i];
	//    		}
	//    		else {
	//    			// Vamos arredondar?
	//    			double nextDif = (((grades[i]/5) + 1 ) * 5) - grades[i];
	//    			if(nextDif < 3) {
	//    				// let's! :)
	//    				result[i] = (((grades[i]/5) + 1 ) * 5);    				
	//    			}
	//    			else {
	//    				// nop... :(
	//    				result[i] = grades[i];
	//    			}
	//    		}
	//    			
	//    	}    	
	//    	
	//    	return result;
	//    	
	//    }
	//
	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        int n = in.nextInt();
	//        int[] grades = new int[n];
	//        for(int grades_i=0; grades_i < n; grades_i++){
	//            grades[grades_i] = in.nextInt();
	//        }
	//        int[] result = solve(grades);
	//        for (int i = 0; i < result.length; i++) {
	//            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	//        }
	//        System.out.println("");
	//        in.close();
	//        
	//        
	//
	//    }


	//	// Este partiu-me todo... https://www.hackerrank.com/challenges/sherlock-and-the-beast
	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        
	//        int n = in.nextInt();
	//        
	//        int[] source = new int[n];
	//        
	//        for(int i=0; i < n; i++){
	//        	source[i] = in.nextInt();
	//        }
	//        
	//        int y = 0;
	//        for(int i=0; i < n; i++){
	//            y = source[i];
	//            
	//            int z = y;
	//            while(z%3!=0) {
	//            	z-=5;
	//            }
	//            if(z<0){
	//            	System.out.print("-1"); 
	//            }
	//            else {
	//            	for (int x = 0; x<z; x++) {
	//            		System.out.print("5");
	//            	}
	//            	for (int x = 0; x<y-z; x++) {
	//            		System.out.print("3");
	//            	}            	
	//            }
	//            System.out.println();
	//            
	//        }
	//        
	//        in.close();
	//    }




	//https://www.hackerrank.com/challenges/2s-complement
	//    public static void main(String[] args) {
	//    	
	//    	long startTime = System.nanoTime();
	//    	
	////    	Scanner in = new Scanner(System.in);    	
	////    	int n = in.nextInt();
	////    	
	////    	int[][] arr = new int[n][2];
	////    	
	////    	for (int i=0; i<n; i++) {
	////    		arr[i][0]=in.nextInt();
	////    		arr[i][1]=in.nextInt();
	////    	}
	////    	in.close();
	//    	
	//    	Complement2 comp = new Complement2();
	//    	int n = 100; // comp.n;
	//    	int[][] arr = comp.input;    	
	//    	int[] result = comp.result;
	//    	
	//    	
	//
	//    	
	//      	
	//    	
	//    	// Vamos percorrer todos os elementos do array e varrer as combinações
	//    	for(int i = 0; i<n; i++) {
	//    		int nUns = 0;
	//    		for (int j = arr[i][0]; j<=arr[i][1]; j++) {
	//    			BitSet bs = BitSet.valueOf(new long[]{j});
	//    			
	//    	    	nUns += bs.cardinality();
	//    	    	
	//    	    	
	//    			// String binString = Integer.toBinaryString(j);
	//    			
	//    			
	//    	
	//    			
	//    			// Segunda mais rápida
	//    			//nUns += binString.chars().filter(num -> num == '1').count();    					
	//    			
	//    			// Mais lento
	//    			//nUns += binString.length() - binString.replace("1",  "").length();
	//    			
	//    			// Mais rápido! 
	////    			for(int k=0; k<binString.length(); k++) {
	////    				if(binString.charAt(k)=='1') nUns++;    				
	////    			}
	//    			
	//    	    	
	//    		}
	//    		//System.out.println(nUns);
	//    		System.out.print(i + (nUns - result[i] != 0 ? " Erro" : " Ok") + "\n" );
	//    		
	//    	}
	//    	long endTime = System.nanoTime();
	//		System.out.println("Took "+(endTime - startTime) + " ns");
	//    }


	//    public static void main(String[] args) {
	//        Scanner scan = new Scanner(System.in);
	//        double mealCost = scan.nextDouble(); // original meal price
	//        int tipPercent = scan.nextInt(); // tip percentage
	//        int taxPercent = scan.nextInt(); // tax percentage
	//        scan.close();
	//      
	//        // Write your calculation code here.
	//        double tipValue = mealCost * tipPercent/100;
	//        double taxValue = mealCost * taxPercent/100;
	//      
	//        // cast the result of the rounding operation to an int and save it as totalCost 
	//        int totalCost = (int) Math.round(mealCost + tipValue + taxValue);
	//        		
	//        // Print your result
	//        System.out.println("The total meal cost is " + totalCost + " dollars.");
	//    }


	/*
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
	 */
	//	public static void main(String[] args) {
	//		Scanner scan = new Scanner(System.in);
	//		int n = scan.nextInt(); 
	//		scan.close();
	//		String ans="";
	//
	//		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	//		if(n%2==1){
	//			ans = "Weird";
	//		}
	//		else{
	//			// Complete the code 
	//			if (n>=6 && n<= 20) ans = "Weird";
	//			else ans = "Not Weird";
	//		}
	//		System.out.println(ans);
	//	}



	// https://www.hackerrank.com/challenges/game-of-stones-1
	//    public static void main(String[] args) {
	//		Scanner scan = new Scanner(System.in);
	//		int n = scan.nextInt(); 
	//		
	//		int[] stonesArr = new int[n];
	//				
	//		for (int i=0;i<n;i++)
	//			stonesArr[i] = scan.nextInt();
	//		
	//		scan.close();
	//		
	//		for (int i=0;i<n;i++)
	//			System.out.println((stonesArr[i]%7 > 1 ? "First":"Second"));	
	//    	
	//    }


	// https://www.hackerrank.com/challenges/tower-breakers-1
	//    public static void main(String[] args) {
	//		Scanner scan = new Scanner(System.in);
	//		
	//		int t = scan.nextInt();
	//		
	//		int[] n = new int[t];
	//		int[] m = new int[t];
	//		
	//		for (int i=0; i<t; i++){		
	//			n[i] = scan.nextInt();
	//			m[i] = scan.nextInt();
	//		}			
	//		
	//		scan.close();
	//		
	//		for (int i=0;i<t;i++)
	//			System.out.println((m[i] == 1 || n[i] % 2 == 0 ? 2 : 1));	
	//    	
	//    }




	// MUITO BOM! Comparação e ordenação de strings com lambda!!
	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//                
	//        // your code goes here
	//        
	//        List<String> numbers = new ArrayList<>();
	//        int n = in.nextInt();
	//        for (int j = 0; j < n; j++) {
	//            numbers.add(in.next());
	//        }
	//        in.close();
	//
	//        numbers
	//                .stream()
	//                .parallel()
	//                .sorted((s1, s2) -> {
	//                    if (s1.length() != s2.length()) {
	//                        return s1.length() - s2.length();
	//                    } else {
	//                        for (int i = 0; i < s1.length(); i++) {
	//                            if (s1.charAt(i) != s2.charAt(i)) {
	//                                return s1.charAt(i) - s2.charAt(i);
	//                            }
	//                        }
	//                    }
	//                    return 0;
	//                })
	//                .forEachOrdered(System.out::println);        	
	//        
	//        
	//        
	//        
	//        
	//    }

	//	public static void main(String[] args) {
	//
	//		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	//		Scanner in = new Scanner(System.in);
	//		int t = in.nextInt();
	//		
	//		String stringArray[] = new String[t];
	//
	//		for (int i=0; i<t; i++){
	//			stringArray[i] = in.next();
	//		}
	//		in.close();
	//		
	//		for (int i=0; i<t; i++){
	//			String evenChars;
	//			String oddChars;
	//			evenChars = "";
	//			oddChars = "";
	//			
	//			for (int j=0; j<stringArray[i].length(); j++) {
	//
	//				if (j%2 == 0) {
	//					evenChars = evenChars.concat(""+stringArray[i].charAt(j));
	//				}
	//				else {
	//					oddChars = oddChars.concat(""+stringArray[i].charAt(j));
	//				}
	//			}
	//						
	//			System.out.println(evenChars + " " + oddChars);
	//		}
	//	}



	//    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        int n = in.nextInt();
	//        int[] arr = new int[n];
	//        for(int i=0; i < n; i++){
	//            arr[i] = in.nextInt();
	//        }
	//        in.close();
	//        
	//        for(int i=n-1; i >= 0; i--){
	//        	System.out.print(arr[i] + " ");
	//        }
	//    }


	//	// Create a Map of String Keys to String Values, implemented by the HashMap class
	//	Map<String,String> myMap = new HashMap<String,String>(); 
	//	    
	//	// Adds ("Hi","Bye") mapping to myMap
	//	myMap.put("Hi", "Bye");	
	//
	//	// Print the Value mapped to from "Hi"
	//	System.out.println(myMap.get("Hi")); 
	//
	//	// Replaces "Bye" mapping from "Hi" with "Bye!" 
	//	myMap.put("Hi", "Bye!"); 
	//
	//	// Print the Value mapped to from "Hi"
	//	System.out.println(myMap.get("Hi")); 
	//
	//	

	//    public static void main(String []argh){
	//        Scanner in = new Scanner(System.in);
	//        int n = in.nextInt();
	//        
	//        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
	//        
	//        for(int i = 0; i < n; i++){
	//            String name = in.next();
	//            int phone = in.nextInt();
	//            // Write code here
	//            phoneBook.put(name, phone);            
	//        }
	//        while(in.hasNext()){
	//            String s = in.next();
	//            // Write code here
	//            if(phoneBook.containsKey(s)){
	//            	System.out.println(s + "=" + phoneBook.get(s));
	//            }
	//            else {
	//            	System.out.println("Not found");
	//            }
	//        }
	//        in.close();
	//    }


	static int factorial(int n) {

		if (n<0) throw new IllegalArgumentException("Factorial parameter should be positive.");

		if(n<=1) {
			return 1;
		}
		else {
			return n*factorial (n-1);
		}
	}

	public static void main1(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = factorial(n);
		in.close();
		System.out.println(result);
	}

	public static void main2(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		String bin = Integer.toBinaryString(n);

		int maxConsec = 0;
		int maxConsecTemp = 0;
		for (int i=0;i <bin.length(); i++) {
			if(bin.charAt(i)=='1') {
				maxConsecTemp++;
				if (maxConsecTemp > maxConsec ) {
					maxConsec = maxConsecTemp;
				}
			}
			else {
				if (maxConsecTemp > maxConsec ) {
					maxConsec = maxConsecTemp;
				}
				maxConsecTemp = 0;
			}
		}

		System.out.println(bin + "--> " + maxConsec);
	}


	// Expected result = 19
	private static int[][] initArray(){
		int [][] array = new int [][]{
			{1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0},
			{1, 1, 1, 0, 0, 0},
			{0, 0, 2, 4, 4, 0},
			{0, 0, 0, 2, 0, 0},
			{0, 0, 1, 2, 4, 0}
		};
		return array;
	}

	// Expected result = -6
	private static int[][] initArray1(){
		int [][] array = new int [][]{
			{-1, -1,  0, -9, -2, -2},
			{-2, -1, -6, -8, -2, -5},
			{-1, -1, -1, -2, -3, -4},
			{-1, -9, -2, -4, -4, -5},
			{-7, -3, -3, -2, -9, -9},
			{-1, -3, -1, -2, -4, -5}
		};
		return array;
	}

	public static void main3(String[] args) {
		/*
    	Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();        
		 */
		int arr[][] = initArray1();


		int maxSum = Integer.MIN_VALUE;

		// Para um array de 6x6 e com uma sub-matriz de 3x3 só preciso de ir ao 4...
		for (int i = 0; i<4; i++) {

			for (int j= 0;j<4; j++){
				int currentSum = 0;

				// Percorrer os sub arrays
				for (int i1 = i; i1<i+3; i1++) {
					for (int j1 = j; j1<j+3; j1++ ){
						if (i1 == i+1)  { // linha do meio só soma o do meio
							if (j1 == j+1) currentSum += arr[i1][j1]; 
						}
						else { // extremos, soma tudo
							currentSum += arr[i1][j1];
						}        					
					}
				}

				// Ver se este é o maior sub-aray

				if (currentSum > maxSum) maxSum = currentSum;

			}
		}

		System.out.println(maxSum);

	}


	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}

	public static void main5(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new MyBook(title, author, price);
		book.display();
	}


	public static void main6(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}

	public static void main7(String[] args) throws Exception {
	
		MySQLAccess dao = new MySQLAccess();
		dao.readDataBase();
	}
	
	
	// Listas
	public static  SimpleNode insert(SimpleNode head,int data) {
		//Complete this method
		
		SimpleNode n = new SimpleNode(data);
		SimpleNode start = head; 
		
		// Avançar até ao fim da lista
		if(head!=null) {
			while(head.next!=null) head=head.next;
			head.next = n;
		}
		else {
			start = n;
		}		
		
		return start;		
	}

	static void display(SimpleNode head) {
		SimpleNode start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
	
	
	public static void main15(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    SimpleNode head = null;
	    int N = sc.nextInt();

	    while(N-- > 0) {
	        int ele = sc.nextInt();
	        head = insert(head,ele);
	    }
	    display(head);
	    sc.close();
	}
	
	// Excepções
    public static void mainExceptions(String[] args) {
        // creates a Solution object whose 'list' instance variable points to null:
    	Exceptions sNullList = new Exceptions();
        // attempt to access an element of the null list, throws Exception
        sNullList.exceptionDemo(1, "x");
        
        // creates a Solution object whose 'list' instance variable points to a list containing 1 element ("x"):
        Exceptions sNotNullList = new Exceptions("x");
        // attempt to access an invalid index of 'intArray' instance variable, throws Exception
        sNotNullList.exceptionDemo(100, "x");
    }

    // Dia 16
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        in.close();
//        
//        try {
//        	System.out.println(Integer.parseInt(S));
//        }
//        catch(Exception e){
//        	System.out.println("Bad String");
//        }
//        
//        
//    }
    
    // Dia 18
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
        
    }

}
