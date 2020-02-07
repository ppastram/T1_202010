/* 
 *Tomado del código de Robert Sedgewick en su libro "Algorithms, Fourth Edition" 
 */

package model.data_structures;

import java.util.Iterator;

public class List <T> implements IList <T>
{
	private Node<T> list;
	private int listSize;
	
	public List ()
	{	
		list = null;
	}
	
	public List (T item)
	{
		list = new Node<T> (item) ; 
		listSize = 1;
	}
	
	
	public void addFirst (T item)
	{
		Node <T> newHead = new Node<> (item); 
		newHead.setNextNode(list);
		list = newHead;
		listSize++;
	}
	
	
	public void append(T item) 
	{
		Node <T> newNode = new Node<> (item); 
		
		if(list == null) 
		{
			list = newNode; 
		}
		else 
		{
			Node <T> actual = list; 
			while(actual.getNext() != null) 
			{
				actual = actual.getNext();
			} 
			actual.setNextNode(newNode);
		} 
		listSize++;
	}
	

	public void removeFirst() 
	{
		list = list.getNext();
	}

	public void remove(int pos) 
	{
		if(listSize >= 2)
		{
			Node <T> anterior = list; 
			Node <T> actual = list; 
			
			for (int i = 0; i < pos; i++)
			{
				anterior = actual;
				actual = actual.getNext();
			} 
			
			anterior.setNextNode( actual.getNext() );
			actual = null;
			
			listSize--;
		}
		
	}

	public T get(String id) 
	{
		Node <T> actual = list; 
		
		int ip = Integer.parseInt(id);

		for (int i = 0; i < ip; i++)
		{
			actual = actual.getNext();
		} 
		
		return (T) actual;
	}

	public int getSize() 
	{
		return listSize;
	}

	public boolean isEmpty() 
	{
		if (listSize == 0)
			return true;
		
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
