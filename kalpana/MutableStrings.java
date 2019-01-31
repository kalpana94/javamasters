package kalpana;

public class MutableStrings {

	public static void main(String[] args) {
		        // Strings are IMMUTABLE
				String str = new String("Hello");
				str.concat(" World");
				System.out.println("str is: "+str);

				// StringBuffer and StringBuilder can be only created using Object Way
				// MUTABLE Strings
				StringBuffer buffer = new StringBuffer("Hello"); 	// Thread Safe -> A bit Slow
				StringBuilder builder = new StringBuilder("Hello");	// Not Thread Safe -> A bit Fast
				buffer.append(" World");
				builder.append(" World");
				System.out.println("buffer is: "+buffer);
				System.out.println("builder is: "+builder);
	}

}
