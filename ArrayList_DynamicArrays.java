package oopconcepts;

import java.util.ArrayList;



public class ArrayList_DynamicArrays {

    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("John");
        list1.add("Lily");
        System.out.println(list1);
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("add");
        list2.add("all");
        System.out.println(list2);
        
        list1.addAll(1, list2);
        System.out.println(list1);
        
        ArrayList<String> list3 = (ArrayList<String>)list2.clone();
        System.out.println(list3);
        System.out.println();
        
        list3.forEach((s) -> System.out.println(s));
        
        for (String s : list3) {
            System.out.println(s);
        }
        
        System.out.println(list3.get(0));
        
        
    }
}

/**
 * java.util.ArrayList

	The ArrayList class uses dynamic arrays that are resizable, unlike traditional fixed arrays. 
	However, each element must still be of the same type. 
	Elements can be added or removed at any time, making the ArrayList more flexible.

				ArrayList<DataType> arrayListInstance = new ArrayList<DataType>();

								ArrayList<String> list1 = new ArrayList<>();
								ArrayList<String> list2 = new ArrayList<>();
				.add()
			        				list1.add("John");
			        				list1.add("Lily");
								
			        				list2.add("hi");
			        				list2.add("all");
				.addAll(index, collection);
								list1.addAll(1, list2);

				.clear();
								list1.clear();
				.clone(); 
				.clone means copy a list			
								ArrayList<String> list3 = (ArrayList<String>)list2.clone();
				.contains(obj);
								boolean trueOrFalse = list3.contains("add");
				.forEach(Consumer<E> action);
								list3.forEach((s) -> System.out.println(s));  // lemda expression
								list3.forEach(System.out::println);           // method reference

				.get(index) 
								System.out.println(list3.get(0));             // returns element
				.indexOf(element)               
				 return index of first occurence of element if exits, -1 otherwise. 
								ArrayList<Integer> list = new ArrayList<>();  // Don't work with primitive data like int ut must e used with Wrapper class like Integer.
								int index = list.indexOf(2);
				.isEmpty();

				.iterator();
								Iterator<String> iterator = list3.iterator();

    								// Use the iterator to traverse the list
    								while (iterator.hasNext()) {
        								System.out.println(iterator.next());
    								}

				.listiterator();
				.listiterator(int index);
								ListIterator<String> iterator = list3.listiterator();
								ListIterator<String> iterator = list3.listiterator(2);
				.remove(element);
				.removeAll(List);
								list1.removeAll(list2);
								list1.removeAll(list1);

				.removeIf(Predicate<T> filter);
								nums.removeIf(n -> (n % 2 == 0));

				.removeRange(start, end);
								list.removeRange(0, 3);
				.replaceAll(UnaryOperator<E> operator)

								list1.replaceAll(String::toLowerCase);
				.retainAll(list2); 		
				 common

				.set(index, newElement);
								list1.set(1, "okay");
				.size();

				Arrays.sort(array, comparator);
								Arrays.sort(list1);
								System.out.println("Sorted Array: " + Arrays.toString(list1));
								Arrays.sort(list1, Comparator.comparing(String::length));

    				Spliterator<String> spliterator = arrayList.spliterator();

							        Spliterator<String> spliterator = list2.spliterator();
								spliterator.forEachRemaining(System.out::println);      // splieded

							        Spliterator<String> spliterator = list1.spliterator();
    								Spliterator<String> secondHalf = spliterator.trySplit();

	
							    	System.out.println("First Half:");
							   	spliterator.forEachRemaining(System.out::println);

								System.out.println("Second Half:");
								secondHalf.forEachRemaining(System.out::println);

				.subList(start, end)
								List<String> subList = exampleList.subList(1, 4);
				.toArray()
								String[] fruitsArray = fruitsList.toArray(new String[0]);
        							System.out.println("Fruits Array: " + Arrays.toString(fruitsArray));

								Object[] colorsArray = colorsList.toArray();
       								System.out.println("Colors Array: " + Arrays.toString(colorsArray));

				.trimToSize();




        							int[] a = {1, 3, 5};
       								ArrayList<Integer> list1 = new ArrayList<>();
				Primitive int array to List:
        							Arrays.stream(a).forEach(list1::add);

        							list1.forEach(e->System.out.println(e + " "));
        			List to primitive in array:
       								 a = list1.stream().mapToInt(i->i).toArray();

       								 System.out.println(Arrays.toString(a));







https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
 */
