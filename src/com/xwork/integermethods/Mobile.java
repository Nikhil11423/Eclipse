package com.xwork.integermethods;

public class Mobile {
		
		public static void main(String[] args){
			int model=2015;
			
			//Integer bitCount methods
			int mod=Integer.bitCount(model);
			System.out.println("BitCount is="+mod);
			
			//Integer compare methods
			Integer model1=2020;
			byte mod1=(byte) Integer.compare(model,model1);
			System.out.println("Comapre value is="+mod1);
			
			//Integer byteValue methods
			Integer i=126;
			byte mod2=i.byteValue();
			System.out.println("Bytevalue is="+mod2);
			
			//Integer compareTo methods
			Integer x=20;
			Integer y=10;
			int mod3=x.compareTo(y);
			System.out.println("CompareTo value is="+mod3);
			
			//Integer decode methods
			String str="555";
			int mod4=Integer.decode(str);
			System.out.println("Decode value is="+mod4);
			
			//Integer doubleValue methods
			Double dobj=23.45;
			double d=dobj.doubleValue();
			System.out.println("Double value of the object is ="+d);
			
			//Integer Equals methods
			Integer obj=73;
			Integer obj1=37;
			boolean dp=obj.equals(obj1);
			System.out.println("Equlas value is ="+dp);
			
			//Integer  floatValue Methods
			float mod5=obj.floatValue();
			System.out.println("float value of the object is ="+mod5);
			
			//Integer  getInteger Methods
			String str1="sun.arch.data.model";
			Integer mod6=Integer.getInteger(str1);
			System.out.println("Getinteger value of the object is ="+mod6);
			
			//Integer highestOneBit Methods
			Integer num=25;
			Integer mod7=Integer.highestOneBit(num);
			System.out.println("HighestOnebit value of the object is ="+mod7);
			
			//Integer lowesttOneBit Methods
			Integer num1=25;
			Integer mod8=Integer.lowestOneBit(num1);
			System.out.println("lowestOnebit value of the object is ="+mod8);
			
			//Integer intValue Methods
			Integer num2=40;
			Integer mod9=num2.intValue();
			System.out.println("intValue value of the object is ="+mod9);
			
			//Integer longValue Methods
			Integer num3=2345;
			long mod10=num3.longValue();
			System.out.println("longValue value of the object is ="+mod10);
			
		
			//Integer divideUnsigned Methods
			int mod11=Integer.divideUnsigned(35,5);
			System.out.println("divideUnsigned value is="+mod11);

				
			
		}
		
	}

	
	
	

