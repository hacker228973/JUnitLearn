package part00;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * 
 * Использование проверок для ссылочных типов
 *
 */
public class Task04
{
    public String getText(boolean status)
    {
        return status ? null : "abc";
    }

    @Test
    public void testNull()
    {
        String s1 = getText(true);
        // проверяет равна ли ссылка null
        assertNull(s1);
    }

    @Test
    public void testNotNull()
    {
        String s1 = getText(false);
        // проверяет чтобы ссылка НЕ была рвна null
        assertNotNull(s1);
    }
}