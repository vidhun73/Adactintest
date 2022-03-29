package models;

public class Buffer {
public static void main(String[] args) {
	StringBuffer ab = new StringBuffer("Bosco");
	System.out.println(ab.append("vig"));
	
	StringBuffer ab1= new StringBuffer("Bosco");
	System.out.println(ab1.reverse());

   StringBuffer ab2= new StringBuffer("bosoc");
     System.out.println(ab2.replace(0,2,"vig"));
   
   StringBuffer ab3= new StringBuffer("james");
   System.out.println(ab3.length());
   
   StringBuffer ab4= new StringBuffer("vfffffffcgccccfffffxfdddghhfsdss");
   System.out.println(ab4.capacity());

StringBuffer ab5= new StringBuffer("vidhun");
System.out.println(ab5.delete(1, 4));
}
}
