Your assignment -- write the linearSearch() and binarySearch() methods. These are multi-purpose search
methods that work on any array of objects that implement the Comparable<T> interface. Here is a copy of the interface: 

public interface Comparable<T> {
    int compareTo(T other);    
} 

Behavior of compareTo(): Returns --
 
POSITIVE     If this is greater than other.
0            If this is equal to other.
NEGATIVE     If this is less than other.
 
It is not important what number compareTo() returns, just its sign.
 
In this project, String and Fraction both implement Comparable. For example,
 
Fraction a = new Fraction(1, 2);
Fraction b = new Fraction(3, 4);
 
a.compareTo(b) -> NEGATIVE
b.compareTo(a) -> POSITIVE
 
Because a is less than b.

Strings implement compareTo() using alphabetical order. For example: 
"aardvark".compareTo("badger") -> NEGATIVE
"badger".compareTo("aardvark") -> POSITIVE

Do not worry about uppercase/lowercase for this problem. All strings are lowercase.

