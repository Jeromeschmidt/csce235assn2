package unl.cse.sets; //DO NOT CHANGE THE PACKAGE

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import unl.cse.utils.Pair;

public class SetUtils {

	/**
	 * Returns all the elements in the set <code>a</code> without any of the
	 * elements in <code>b</code>.
	 * 
	 * This is an example of a generic set usage; this method has been done for
	 * you
	 * 
	 * @param a
	 *            The first set
	 * @param b
	 *            The second set
	 * @return The set minus of a - b
	 */
	public static <T> Set<T> setMinus(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>();

		result.addAll(a);
		for (T element : b) {
			result.remove(element);
		}
		return result;
	}

	/**
	 * This method returns a new set which is the union of the two given sets.
	 * 
	 * @param a
	 * @param b
	 * @return The union of <code>a</code> and <code>b</code>
	 */
	public static <T> Set<T> union(Set<T> a, Set<T> b) 
	{
		Set<T> result = new HashSet<T>();

		result.addAll(a);
		for (T element : b) 
		{
			for(T element1 : a)
			{
				if(element == element1)
				{
					//do nothing
				}
				else
				{
					result.add(element);
				}
			}
		}
		return result;
	}

	/**
	 * This method returns a new set which is the intersection of the two given
	 * sets.
	 * 
	 * @param a
	 * @param b
	 * @return The intersection of <code>a</code> and <code>b</code>
	 */
	public static <T> Set<T> intersection(Set<T> a, Set<T> b) 
	{
		Set<T> result = new HashSet<T>();
		
		for (T element : a) 
		{
			for (T element1 : b) 
			{
				if(element == element1)
				{
					result.add(element);
				}
			}
		}
		return result;
	}

	/**
	 * This method computers the power set of the given set <code>a</code>,
	 * returning a set of sets of elements.
	 * 
	 * @param a
	 * @return The power set of <code>a</code>
	 */
	public static <T> Set<Set<T>> getPowerSet(Set<T> a) 
	{
	    Set<Set<T>> result = new HashSet<Set<T>>();
	    if (a.isEmpty()) {
	        result.add(new HashSet<T>());
	        return result;
	    }
	    List<T> list = new ArrayList<T>(a);
	    T head = list.get(0);
	    Set<T> rest = new HashSet<T>(list.subList(1, list.size())); 
	    for (Set<T> set : getPowerSet(rest)) {
	        Set<T> newSet = new HashSet<T>();
	        newSet.add(head);
	        newSet.addAll(set);
	        result.add(newSet);
	        result.add(set);
	    }       
	    return result;
	}

	/**TODO
	 * Returns a set containing all subsets of the given set <code>a</code> that
	 * have cardinality <code>size</code>.
	 * 
	 * @param a
	 * @param size
	 * @return
	 */
	public static <T> Set<Set<T>> getSetsOfCardinality(Set<T> a, int size) 
	{
	    Set<Set<T>> result = new HashSet<Set<T>>();
	    int index = 0;
	    int start = index;
	    int end = start + size;
	    
	    for(start = index; start < end; start++)
	    {
	    	
	    }
	    
	    index++;
	    
	    return result;
	}

	/**
	 * Returns the symmetric difference of the two given sets, defined as all
	 * elements in one set but not the other.
	 * 
	 * @param a
	 * @param b
	 * @return The symmetric difference of the two given sets.
	 */
	public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) 
	{
		Set<T> result = new HashSet<T>();
	    
	    
		for (T element : a) 
		{
			for (T element1 : b) 
			{
				if(element == element1)
				{
					//result.remove(element);
					//result.remove(element1);
				}
				else
				{
					result.add(element);
				}
			}
		}
		for (T element : b) 
		{
			for (T element1 : a) 
			{
				if(element == element1)
				{
					//result.remove(element);
				}
				else
				{
					result.add(element);
				}
			}
		}
		
		return result;
	}

	/**TODO
	 * This method returns a new set representing the Cartesian product of the
	 * two given sets.
	 * 
	 * @param a
	 * @param b
	 * @return The Cartesian product of the two given sets.
	 */
	public static <S, T> Set<Pair<S, T>> cartesianProduct(Set<S> a, Set<T> b) 
	{
	    Set result = new HashSet<Set<T>>();
	    
	    for (S element : a)
	    {
	        for (T element1 : b)
	        {
	            result.add();
	        }
	    }
		return result;
	}

}