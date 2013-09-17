public class Stringz {
	
	public static void main(String[] args) {
		String str = new String("A string");
		String s = "A string";

	// 	if (str.equals(s)) {
	// 		System.out.println("A");
	// 	}else {
	// 		System.out.println("B");
	// 	}
	

	// for (int i=0; i< str.length(); i++) {
	// 	System.out.println(str.charAt(i));
	// }

		// for (int i = 0 ; i< str.length() - 1; i++) {
		// System.out.println(str.substring(i, i + 2));
		// }

		// if (contains("baseball", "ball")) {
		// 	System.out.println("Yes");
		// } else{
		// 	System.out.println("No");
		// } 
		// 
		
		// count("people", "e");

		// isAbecedarian("abdest");
		// System.out.println(isAbecedarian("abdl"));
		// System.out.println(isDupledrome("aabdl"));
		System.out.println(isCaptainCrunch("spencer"));
	}

	public static boolean isAbecedarian(String s) {
		for (int i = 0; i< s.length()-1; i++) {
			if (s.charAt(i) >= s.charAt(i+1)) {
				return false;
			}
	
		}

		return true;
	}

	public static boolean isDupledrome(String s) {
		
		for (int i= 0; i< s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				return true;
			}
		}

		return false;
	}

	public static String isCaptainCrunch(String s) {
			
			for (int i=0; i < s.length(); i++) {

				
				s.charAt(i) += 13;
				 
			}

			return s;
	}
	


	// public static int count(String s, String t) {
	// 	int sum = 0;
	// 	for (int i = 0; i< s.length()-t.length()+1; i++) {
	// 		if(s.substring(i, i+t.length()).equals(t)) {
	// 			sum += 1;
	// 		}
	// 	}

	// 	System.out.println(sum);
	// 	return sum;
		
	// }

	// // public static boolean hasAnA(String s) {
	// // 	for (int i = 0; i< s.length(); i++) {
	// // 		if (s.substring(i, i+1)) {
	// // 			charAt(i) == 'A';
	// // 		}

	// 		return true;
	// 	}
	// }

	// public static boolean isPaledrome(String s) {
	// 	for (int i = 0, int j = s.length(); ; ) {
			
	// 	}
	// }



	// public static boolean contains(String s, String t) {
	// 	for (int i = 0; i< s.;length()-t.length()+1; i++) {
	// 		if (s.substring(i, i+t.length()).equals(t)) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }
}