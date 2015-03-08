package _2_Basics_of_Java_syntax;

public class W_2_Exercise_4 {

	public static void main(String[] args) {
		
		StringBuilder text = new StringBuilder();
		text.append("Java\u2122");
		System.out.println(text);
		text.replace(0, text.length(), "The formula for the circumference of a circle is 2\u03C0r");
		System.out.println(text);
		text.replace(0, text.length(), "The formula for the area of a circle is \u03C0r\u00B2");
		System.out.println(text);
		text.replace(0, text.length(), "So a circle with a radius of 3 has a circumference of 18.84955592153876");
		System.out.println(text);
		text.replace(0, text.length(), "And an area of 28.274333882308138");
		System.out.println(text);
		
	}

}
