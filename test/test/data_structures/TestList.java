package test.data_structures;


import model.data_structures.List;
import model.data_structures.Node;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestList <T> {

	private List list;
	
	@Before
	public void setUp1() 
	{
		list = new List("elemento 1");
	}

	public void setUp2() 
	{
		//list.addFirst(""+0);
		
		for(int i = 1; i < 37; i++)
		{
			list.append(""+i);
		}
	}

	@Test
	public void testList () 
	{
		setUp1();
		
		assertNotEquals(0, list.getSize() ); 
		
		list = null;
	}

	@Test
	public void testAddFirst() 
	{
		list.addFirst("primer elemento");
		
		assertNotEquals(0, list.getSize() ); 
		
		list = null;

	}
	
	@Test
	public void testAppend() 
	{
		setUp1();
		
		list.append("elemento 2");
		
		assertEquals(2, list.getSize() ); 
		
		list = null;


	}
	
	@Test
	public void testRemove() 
	{
		setUp2();
		
		list.remove(10);
		
		assertEquals(36, list.getSize() ); 
		
		list = null;


	}
	
	@Test
	public void testRemoveFirst() 
	{
		setUp2();
		
		assertEquals("1", list.get(0) ); 
		
		list = null;

	}
	
	@Test
	public void testGet() 
	{
		setUp2();
		
		assertEquals( 7, (T) list.get(6) );
		
		list = null;

	}
	
	@Test
	public void testGetSize() 
	{
		setUp2();
		
		assertEquals(37, list.getSize() ); 
		
		list = null;


	}
	
	@Test
	public void testIsEmpty() 
	{
		assertEquals(false, list.isEmpty() );
		
		setUp2();

		assertFalse( list.isEmpty() );
		
		list = null;

		
	}
	

}
