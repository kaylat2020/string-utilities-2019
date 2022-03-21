import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Integrity of StringUtilities
 * @author tuckerka20
 * @version 9/20/18
 */
public class StringUtilitiesTest 
{
    private StringUtilities var1;
    private StringUtilities var2;
    private StringUtilities var3;
    private StringUtilities var4;
    private StringUtilities var5;
    private StringUtilities var6;
    private StringUtilities var7;
    
    /**
     * Creates variables for tests beforehand.
     */
    @Before
    public void setUp()
    {
        var1 = new StringUtilities();
        var2 = new StringUtilities( "Sup, my dudes!" );
        var3 = new StringUtilities( "SUP, MY DUDES!" );
        var4 = new StringUtilities( "$UP, MY DUD3$!" );
        var5 = new StringUtilities( "-670.79" );
        var6 = new StringUtilities( "-30.0.001" );
        var7 = new StringUtilities( "" );
    }
    
    /**
     * Clears up RAM after each test.
     */
    @After
    public void cleanUp()
    {
        var1 = null;
        var2 = null;
        var3 = null;
        var4 = null;
        var5 = null;
        var6 = null;
        var7 = null;
    }
    
    /**
     * comment
     */
    @Test
    public void testSetString()
    {
        var1.setString( "cow" );
        assertEquals( "cow" , var1.toString() );
    }
    
    /**
     * comment 
     */
    @Test
    public void testSetStringNull()
    {
        assertNull( var1.toString() );
    }
    
    /**
     * comment
     */
    @Test
    public void testReverseSimpleInput()
    {
        StringUtilities util = new StringUtilities("meow");
        assertEquals( "woem", util.reverse() );
    }
    
    /**
     * comment
     */
    @Test
    public void testReverseSingle()
    {
        StringUtilities var8 = new StringUtilities( "a" );
        assertEquals( "a" , var8.reverse() );
        assertEquals( "a" , var8.reverse( 0, 1 ) );
        
    }
    
    /**
     * comment
     */
    @Test
    public void testReverseDouble()
    {
        StringUtilities var8 = new StringUtilities( "aa" );
        assertEquals( "aa" , var8.reverse() );
    }
    
    /**
     * comment
     */
    @Test
    public void testReversePalindrome()
    {
        StringUtilities util = new StringUtilities("racecar");
        assertEquals( "racecar", util.reverse() );
    }
    
    /**
     * comment
     */
    @Test
    public void testReverseEmptyString()
    {
        StringUtilities var8 = new StringUtilities( " " );
        assertEquals( "" , var7.reverse() );
        assertEquals( " " , var8.reverse() );
        assertEquals( "" , var7.reverse( 0 , 0 ) );
        assertEquals( " " , var8.reverse( 0 , 1 ) );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class )
    public void testReverseOnNull()
    {
        assertNull( var1.toString() );
        var1.reverse();
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class )
    public void testReverse2OnNull()
    {
        assertNull( var1.toString() );
        var1.reverse( 2 , 4 );
    }
    
    /**
     * comment
     */  
    @Test ( expected = IllegalArgumentException.class )
    public void testReverse2ArgumentBad()
    {
        assertNull( var1.toString() );
        var3.reverse( -1 , 18 );
    }
    
    /**
     * comment
     */
    @Test ( expected = IllegalArgumentException.class )
    public void testReverse2ArgumentBad2()
    {
        assertNull( var1.toString() );
        var3.reverse( 30 , 0 );
    }
    
    /**
     * comment
     */
    @Test ( expected = IllegalArgumentException.class )
    public void testReverse2ArgumentBad3()
    {
        assertNull( var1.toString() );
        var3.reverse( 0 , 30 );
    }
    
    /**
     * comment
     */
    @Test
    public void testReverse2()
    {
        assertEquals( "PUS" , var3.reverse( 0 , 3) );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class )
    public void isAllUpperOnNull()
    {
        assertNull( var1.toString() );
        var1.isAllUpper();
    }
    
    /**
     * comment
     */
    @Test
    public void isAllUpper()
    {
        assertTrue( var4.isAllUpper() );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class)
    public void testisAllLowerOnNull()
    {
        assertNull( var1.toString() );
        var1.isAllLower();
    }
    
    /**
     * comment
     */
    @Test
    public void testisAllLowerOnFalse()
    {
        assertFalse( var2.isAllLower() );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class)
    public void testContainsNumsOnNull()
    {
        assertNull( var1.toString() );
        var1.containsNumbers();
    }
    
    /**
     * comment
     */
    @Test
    public void testContainsNumsOnTrue()
    {
        assertTrue( var4.containsNumbers() );
    }
    
    /**
     * comment
     */
    @Test
    public void testContainsNumsOnFalse()
    {
        assertFalse( var2.containsNumbers() );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class )
    public void testIsNumberOnNull()
    {
        assertNull( var1.toString() );
        var1.isNumber();
    }
    
    /**
     * comment
     */
    @Test
    public void testIsNumberOnTrue()
    {
        assertTrue( var5.isNumber() );
    }
    
    /**
     * comment
     */
    @Test
    public void testIsNumberOnFalse()
    {
        assertFalse( var6.isNumber() );
    }
    
    /**
     * comment
     */
    @Test
    public void testIsNumberOnFalse2()
    {
        assertFalse( var4.isNumber() );
    }
    
    /**
     * comment
     */
    @Test
    public void testIsNumberOnFalse3()
    {
        StringUtilities var8 = new StringUtilities( "-80-" );
        assertFalse( var8.isNumber() );
    }
    
    /**
     * comment
     */
    @Test
    public void testIsNumberOnFalse4()
    {
        assertFalse( var2.isNumber() );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class )
    public void testConDupsOnNull()
    {
        assertNull( var1.toString() );
        var1.numConsecutiveDuplicates();
    }
    
    /**
     * comment
     */
    @Test
    public void testConDups()
    {
        StringUtilities var8 = new StringUtilities( "Moo" );
        assertEquals( 1 , var8.numConsecutiveDuplicates() );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class )
    public void testNumMatchesOnNull1()
    {
        assertNull( var1.toString() );
        var1.numMatches( 'R' );
    }
    
    /**
     * comment
     */
    @Test ( expected = NullPointerException.class )
    public void testNumMatchesOnNull2()
    {
        assertNull( var1.toString() );
        var1.numMatches( "HELP" );
    }
    
    /**
     * comment
     */
    @Test
    public void testNumMatches1()
    {
        assertEquals( 2 , var3.numMatches( 'U' ) );
    }
    
    /**
     * comment
     */
    @Test
    public void testNumMatches2()
    {
        assertEquals( 2 , var3.numMatches( "U" ) );
    }
    
    /**
     * comment
     */
    @Test
    public void testNumMatches2Bad()
    {
        assertEquals( 0 , var7.numMatches( var2.toString() ) );
    }
    
    /**
     * comment
     */
    @Test
    public void testNumMatches2Large()
    {
        StringUtilities var8 = new StringUtilities( "the cat in the hat" );
        assertEquals( 2 , var8.numMatches( "the" ) );
    }
    
    /**
     * comment
     */
    @Test
    public void testAsArray()
    {
        StringUtilities var8 = new StringUtilities
        ( var3.toString().substring( 0 , 3 ) );
        assertArrayEquals( new char[] { 'S' , 'U' , 'P' }, var8.asArray() );
    }
}
