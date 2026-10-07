# Object Oriented Programming 2026-27

Unfortunately due to some fees shenanigans, I have been left in the unfun situation of having to redo object oriented programming for the year. This is where I will have all my notes and excercises for the module.

**Things to take note of**

* OOP in semester 1 is Tuesdays 10-11 and 3-5, and Thursdays 9-10;
* There is two CA's per semester, two projects and two tests.
* [Project 1](https://github.com/silverlunasen-cmyk/OOP-I-CA1-2026-27/tree/main) is a solo project, Project 2 is a Group Project;


## Arrays Notes

* An array is a storage unit for multiple values, in a gaming sense this would be for character stats, (health, level, name, etc). 
* Arrays are of a fixed size, while ArrayLists are of any size. With ArrayLists they grow as you add something to it, or shrink as you remove it. 
* For getting things, in Arrays you would typically go `System.out.println(array[0])` for the first index of an array, while with ArrayLists are `System.out.println(arrayList.get(0));` 
* For finding the size of Arrays, you would use `Array.length()` while with ArrayLists you would use `ArrayList.size();
* Adding elements to Arrays would have you doing `Array[0] = Value`, but ArrayLists are `ArrayList.add(value);`
* [Array Exercises can be found here](https://github.com/silverlunasen-cmyk/Object-Oriented-Programming-Rerun-26-27/tree/main/src/main/java/Arrays)


## Ordering Notes
* Comparable is used to define the natural ordering of objects (Strings typically sort from A-Z, Integers and other number types would be from smallest to largest)
* Comparator is if you were to override the comparable and have it sorted in a different way, as an example, descending order;
* Comparator also allows you to have tiebreaks in place. As an example, [here](https://github.com/silverlunasen-cmyk/Object-Oriented-Programming-Rerun-26-27/blob/main/src/main/java/Ordering/Product.java) we have a product class from the ordering exercises. Using [this comparator](https://github.com/silverlunasen-cmyk/Object-Oriented-Programming-Rerun-26-27/blob/main/src/main/java/Ordering/NameAscComparator.java), we have the name as the main sort, but if it is tied then we go to price, then rating.
* Comparators are also done in seperate classes.
* [Ordering Exercises can be found here](https://github.com/silverlunasen-cmyk/Object-Oriented-Programming-Rerun-26-27/blob/main/src/main/java/Ordering/Product.java) we have a product class from the ordering exercises. Using [this comparator](https://github.com/silverlunasen-cmyk/Object-Oriented-Programming-Rerun-26-27/blob/main/src/main/java/Ordering)







## References
* [Array Notes](https://www.geeksforgeeks.org/java/array-vs-arraylist-in-java/)
* [Ordering Notes](https://www.geeksforgeeks.org/java/comparable-vs-comparator-in-java/)
