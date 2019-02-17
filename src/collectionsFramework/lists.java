package collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class lists {
	
	public static List<String> swapElements (int firstIndex, int secondIndex, List<String> arrayList){
		String tempString = arrayList.get(firstIndex);
		arrayList.set(firstIndex, arrayList.get(secondIndex));
		arrayList.set(secondIndex, tempString);
		return arrayList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Element1");
		arrayList.add("Element2");
		arrayList.add("Element3");
		
		//Q2: Write a Java program to insert an element into the array list at the first position
		System.out.println("Q2: Write a Java program to insert an element into the array list at the first position");
		System.out.println("Array List initial value");
		for (String strVal : arrayList)
			System.out.println(strVal);
		arrayList.add(0, "New Element");
		System.out.println("Array List after adding New Element at 1st position");
		for (String strVal : arrayList)
			System.out.println(strVal);
		
		//"Q3. Write a Java program to remove the third element from the array list"
		System.out.println("\nQ3. Write a Java program to remove the third element from the array list");
		System.out.println("Array List initial value");
		for (String strVal : arrayList)
			System.out.println(strVal);
		System.out.println("Array List after removing 3rd element");
		arrayList.remove(2);
		for (String strVal : arrayList)
			System.out.println(strVal);
		
		//Q4. Write a program to copy from one list to another list
		System.out.println("\nQ4. Write a program to copy from one list to another list");
		System.out.println("1st Array List");
		for (String strVal : arrayList)
			System.out.println(strVal);
		
		System.out.println("2nd Array List after copying 1st List to 2nd");
		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.addAll(arrayList);
		for (String strVal : arrayList2)
			System.out.println(strVal);
		
		//Q5. Write a program to swap two elements in an ArrayList
		System.out.println("\nQ5. Write a program to swap two elements in an ArrayList");
		System.out.println("Array List");
		for (String strVal : arrayList)
			System.out.println(strVal);
		arrayList = swapElements(1, 2, arrayList);
		System.out.println("Array List after swapping elements");
		for (String strVal : arrayList)
			System.out.println(strVal);
		
		//Q6. Write a program to append the specified element at the end of the list.
		System.out.println("\nQ5. Write a program to swap two elements in an ArrayList");
		System.out.println("Array List");
		for (String strVal : arrayList)
			System.out.println(strVal);
		arrayList.add(arrayList.size(), "Appended Element");
		System.out.println("Array List after appending specified element at the end oflist");
		for (String strVal : arrayList)
			System.out.println(strVal);
		
	}

}
