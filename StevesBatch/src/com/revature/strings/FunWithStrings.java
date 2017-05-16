package com.revature.strings;

public class FunWithStrings {

	public static void main(String[] args) {
		//String literals stored in the string pool
		String s1 = "cats";
		String s2 = "dogs";
		String s3 = "dogs";
		String s4 = "dog";
		String s5 = new String("dogs");
		String s6 = new String("dogs");
		
		System.out.println("s1 == s2: " + (s1 == s2)); //false
		System.out.println("s2 == s3: " + (s2 == s3)); //true (Same reference in string pool)
		
		//I can use hashcode to psuedo identify position in memory
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		
		//"Location in memory" of s4
		System.out.println("Hashcode of s4: " + System.identityHashCode(s4));
		
		System.out.println("s2 == s4: " + (s2 == s4)); //false
		s4 += 's'; //New String object created
		
		//"Location in memory" of s4 after adding 's'
		System.out.println("Hashcode of s4 after adding 'c':" + System.identityHashCode(s4));
		
		System.out.println("s2 == s4: " + (s2 == s4)); //false
		
		s4 = s4.intern();
		System.out.println("s2 == s4: " + (s2 == s4)); //true
		
		System.out.println("s4 == s5: " + (s4 == s5)); //false
		System.out.println("s5 == s6: " + (s5 == s6)); //false
		System.out.println("s5.equals(s6): " + (s5.equals(s6))); //true
		System.out.println("s5.intern == s6.intern: " + (s5.intern() == s6.intern())); //true
		
		System.out.println("\n=========================================\n");
		
		String str = "String";
		StringBuilder sbui = new StringBuilder("Stringbuilder");
		StringBuffer sbuf = new StringBuffer("Stringbuffer");
		
		//Initial hashcodes
		System.out.println("str hashcode: " + System.identityHashCode(str)); 
		System.out.println("sbui hashcode: " + System.identityHashCode(sbui));
		System.out.println("sbuf hashcode: " + System.identityHashCode(sbuf));
		
		//Hashcodes after changing our strings
		str += "a";
		sbui.append("a");
		sbuf.append("a");
		System.out.println("str hashcode: " + System.identityHashCode(str));	//hashcode: different?
		System.out.println("sbui hashcode: " + System.identityHashCode(sbui));	//hashcode: same?
		System.out.println("sbuf hashcode: " + System.identityHashCode(sbuf));	//hashcode: same?
		
		System.out.println("=============================================");
		
		long cur = System.currentTimeMillis();
		int loops = 100000000;
		
		/*for(int i = 0; i < loops; i++){
			str +="a";
		}
		System.out.println(System.currentTimeMillis()-cur);
		*/

		cur = System.currentTimeMillis();
		for(int i = 0; i < loops; i++){
			sbui.append("a");
		}
		System.out.println(System.currentTimeMillis()-cur);
		
		cur = System.currentTimeMillis();
		for(int i = 0; i < loops; i++){
			sbuf.append("a");
		}
		System.out.println(System.currentTimeMillis()-cur);
		
		
		
	}
}
