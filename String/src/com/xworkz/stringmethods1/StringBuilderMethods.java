package com.xworkz.stringmethods1;

public class StringBuilderMethods {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		builder.append("java");
		System.out.println("String is=" + builder);
		System.out.println("*******************************************");
		
		StringBuilder builder1 = new StringBuilder();
		builder1.append("java");
		int unicode = builder1.codePointAt(1);
		System.out.println("Unicode of charpointat is " + unicode);
		System.out.println("*******************************************");
		
		StringBuilder builder2 = new StringBuilder("xworkz");
		builder2.append("odc");
		System.out.println("String is=" + builder2);
		System.out.println("*******************************************");
		
		StringBuilder builder3 = new StringBuilder(10);
		char ch = builder2.charAt(1);
		System.out.println("StringBuilder object is= " + builder2);
		System.out.println("char at position is= " + ch);
		System.out.println("*******************************************");
		
		StringBuilder sbf = new StringBuilder("Kabbadi is my life");
		int unicodes = sbf.codePointBefore(2);
		System.out.println("Unicode of character at position =" + unicodes);
		System.out.println("*******************************************");
		
		StringBuilder str = new StringBuilder();
		str.capacity();
		System.out.println("String2 capacity= " + str.capacity());
		System.out.println("*******************************************");
		
		str.ensureCapacity(4);
		System.out.println("String3 ensurecapacity=" + str.capacity());
		System.out.println("*******************************************");
		
		int index = builder2.indexOf("or");
		System.out.println("indexof is = " + index);
		System.out.println("*******************************************");
		
		int index1 = builder2.lastIndexOf("rk", 7);
		System.out.println("index of last is=" + index1);
		System.out.println("*******************************************");
		
		int length = builder2.length();
		System.out.println("length of string is=" + length);
		System.out.println("*******************************************");
		
		StringBuilder bu = builder2.replace(1, 7, "w o z ");
		System.out.println("After Replace() String = " + bu.toString());
		System.out.println("*******************************************");
		
		StringBuilder str1 = new StringBuilder("singleinheritance");
		StringBuilder reverseStr = str1.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());
		System.out.println("*******************************************");
		
		StringBuilder str2 = new StringBuilder("RcB");
		str2.setCharAt(2, 'C');
		System.out.println("After setCharAt() String = " + str2.toString());
		System.out.println("*******************************************");
		
		StringBuilder str3 = new StringBuilder("MultipleInheritance");
		System.out.println("String contains = " + str3);
		System.out.println("SubSequence = " + str3.substring(5));
		System.out.println("*******************************************");
		
		StringBuilder sop = new StringBuilder("multilevel");
		System.out.println("String contains = " + sop.toString());
		System.out.println("*******************************************");
		
		StringBuilder del = str3.delete(2, 5);
		System.out.println("After removal String =" + del);
		System.out.println("*******************************************");
		
		StringBuilder sop1 = new StringBuilder("multilevel");
		sop1.setLength(10);
		System.out.println("After setLength String = " + sop1.toString());
		System.out.println("*******************************************");
		
		char[] array = new char[7];
		str3.getChars(0, 7, array, 0);
		System.out.print("Char array contains : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
