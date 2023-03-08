package part00;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * 
 * Использование проверок для ссылочных типов
 *
 */
@SuppressWarnings("unused")
public class Task05
{
    public String getAbc()
    {
        return "abc";
    }

    public String getNewAbc()
    {
        return new String(getAbc());
    }

    @Test
    public void testSameLiteralString()
    {
        String s1 = getAbc();
        String s2 = getAbc();
        // проверяет чтобы ссылки были равны
        assertSame("Ссылки не равны", s1, s2);
    }

    @Test
    public void testSameNewString()
    {
        String s1 = getNewAbc();
        String s2 = getNewAbc();
        // проверяет чтобы ссылки были НЕ равны
        assertSame("Ссылки не равны ", s1, s2);
        // assertEquals(s1, s2);
    }
}