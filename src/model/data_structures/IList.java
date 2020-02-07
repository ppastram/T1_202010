/* 
 *Tomado del código de Robert Sedgewick en su libro "Algorithms, Fourth Edition" 
 */

package model.data_structures;

public interface IList <E> extends Iterable <E>
{
	
	//public IList();
	//public IList (T item);
	
	public void addFirst(E item);
	public void append(E item); 
	
	public void removeFirst();
	public void remove (int pos);
	
	public E get (String pos); 
	public int getSize();	
	public boolean isEmpty();

}
