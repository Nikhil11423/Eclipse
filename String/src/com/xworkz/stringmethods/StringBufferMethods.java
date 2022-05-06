package com.xworkz.stringmethods;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("YARAPPAND YENAITI");
		sb.append("BELAGAVI NAMDAITI");
		System.out.println("append is =" + sb);
		System.out.println("*******************************************");

		StringBuffer sb1 = new StringBuffer("Welcome");
		sb1.insert(1, "Belagavi");
		System.out.println("insert is=" + sb1);
		System.out.println("*******************************************");

		StringBuffer sb2 = new StringBuffer("Belagavi");
		sb2.replace(1, 3, "King");
		System.out.println("Repalce the string=" + sb2);
		System.out.println("*******************************************");

		StringBuffer sb3 = new StringBuffer("Super");
		sb3.delete(1, 4);
		System.out.println("String Buffer is=" + sb3);
		System.out.println("*******************************************");

		StringBuffer sb4 = new StringBuffer("Core Java");
		sb4.reverse();
		System.out.println("Reverse of=" + sb4);
		System.out.println("*******************************************");

		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity());
		sb5.append("Hello");
		System.out.println(sb5.capacity());
		sb5.append("java is my favourite language");
		System.out.println(sb5.capacity());
		System.out.println("*******************************************");

		StringBuffer sb6 = new StringBuffer("HelloBelagavi");
		sb6.appendCodePoint(65);
		System.out.println("After appending CodePoint is = " + sb6);
		System.out.println("*******************************************");

		StringBuffer sb7 = new StringBuffer();
		sb7.append("Hello");
		System.out.println(sb7.capacity());
		sb7.append("java is my favourite language");
		System.out.println(sb7.capacity());
		sb7.ensureCapacity(10);
		System.out.println(sb7.capacity());
		sb7.ensureCapacity(50);
		System.out.println(sb7.capacity());
		System.out.println("*******************************************");

		StringBuffer sb8 = new StringBuffer("class");
		sb8.insert(3, "abstract");
		System.out.println(sb8);
		System.out.println("*******************************************");

		sb8.append(9f);
		System.out.println("append float is=" + sb8);
		System.out.println("*******************************************");

		StringBuffer str = new StringBuffer();
		str.append("CoreJavaprogarms");
		int unicode = str.codePointAt(10);
		System.out.println("Unicode of Character" + "at Position 10 " + unicode);
		System.out.println("*******************************************");

		StringBuffer str1 = new StringBuffer("exceptionalev ent");
		int unicode1 = str1.codePointBefore(14);
		System.out.println("Unicode of Character=" + unicode);
		System.out.println("*******************************************");

		int codepoints = str1.codePointCount(4, 10);
		System.out.println("code point is=" + codepoints);
		System.out.println("*******************************************");

		int index = str1.indexOf("nal");
		System.out.println("index of nal=" + index);
		System.out.println("*******************************************");

		int index1 = str1.lastIndexOf("able", 7);
		System.out.println("index of last is=" + index1);
		System.out.println("*******************************************");

		int index2 = str1.charAt(4);
		System.out.println("char of the string=" + index2);
		System.out.println("*******************************************");

		StringBuffer sbf = new StringBuffer("variables in java");
		System.out.println("String=" + sbf.toString());
		sbf.setCharAt(10, '0');
		System.out.println("After setCharAt() String = " + str.toString());
		System.out.println("*******************************************");

		System.out.println("String length = " + sbf.length() + " and contains = " + sbf);
		sbf.setLength(10);
		System.out.println("After setLength() String = " + sbf.toString());
		System.out.println("*******************************************");

		System.out.println("String contains = " + sbf);
		System.out.println("SubSequence = " + sbf.substring(5));
		System.out.println("*******************************************");

		StringBuffer del = sbf.delete(2, 5);
		System.out.println("delete the string=" + del);
		System.out.println("*******************************************");

		StringBuffer dele = sbf.deleteCharAt(3);
		System.out.println("delete the string=" + dele);

	}

}
