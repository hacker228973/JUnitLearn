package part00.practica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Практика. Метода getHalf, должен возвращать первую половину строки. Если
 * число символов в строке не четное, в первую половину должен входить
 * центральный символ. Если строка пустая или null метод должен вернуть пустую
 * строку.
 */
public class Task01
{
    // FIXME Исправь метод getHalf чтобы он работал согласно требованиям к
    // задаче и тестам
    public String getHalf(String value)
    {
        int mid = value.length() / 2;
        return value.substring(mid);
    }

    @Test
    public void testA()
    {
        String input = "A";
        String result = getHalf(input);
        assertEquals("Неверный результат", "A", result);
    }

    @Test
    public void testAA()
    {
        String input = "AA";
        String result = getHalf(input);
        assertEquals("Неверный результат", "A", result);
    }

    @Test
    public void testAbcd()
    {
        String input = "ABCD";
        String result = getHalf(input);
        assertEquals("Неверный результат", "AB", result);
    }

    @Test
    public void testAbcde()
    {
        String input = "ABCDE";
        String result = getHalf(input);
        assertEquals("Неверный результат", "ABC", result);
    }

    @Test
    public void testEmpty()
    {
        String input = "";
        String result = getHalf(input);
        assertTrue("Не пустая строка", result.isEmpty());
    }

    @Test
    public void testNull()
    {
        String input = null;
        String result = getHalf(input);
        assertTrue("Не пустая строка", result.isEmpty());
    }
}