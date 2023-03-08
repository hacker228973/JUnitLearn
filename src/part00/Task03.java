package part00;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 * Использование проверок результата типа boolean
 *
 */
public class Task03
{
    // метод меняет входящеее булевое значение на противоположное и возвращеет его
    public boolean switchBoolean(boolean value)
    {
        return value ? false : true;
    }

    @Test
    public void testBoolean1()
    {
        boolean value = switchBoolean(false);
        assertTrue("Не истина", value);
    }

    @Test
    public void testBoolean2()
    {
        boolean value = switchBoolean(true);
        assertFalse("Не ложь", value);
    }
}