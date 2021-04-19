package week1.day2;

public class PrintFirstDuplicate {

	public static void main(String[] args) {
String name = "testleaf";
boolean flag = false;
char[] charArray = name.toCharArray();
for (int i = 0; i < charArray.length; i++) {
for (int j = i+1; j < charArray.length; j++) {
	if (charArray[i]==charArray[j]) {
		System.out.println(charArray[i]);
		flag = true;
		break;
	}
	
}if (flag) 
	break;

}if (!flag) {
	System.out.println("No duplicate present");
}

	}

}
