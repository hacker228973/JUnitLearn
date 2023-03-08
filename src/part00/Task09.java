package part00;

// статический импорт
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * Игнорирование тестового метода
 *
 */
public class Task09
{
    @SuppressWarnings("null")
    @Test
    public void testErrorMethod()
    {
        String s = null;
        assertEquals("abc", s.trim());
    }
    
    @Ignore ("Причина игнорирования")
    @Test
    public void testIgnoredMethod()
    {
        fail("Игнорируемый");
    }
    
    @Test
    public void testFailMethod()
    {
        fail("Упавший");
    }
    
    @Test
    public void testPassedMethod()
    {
        // не упавший 
    }
}