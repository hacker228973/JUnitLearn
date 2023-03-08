package part00;

import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * 
 * Проверка корректности работы метода, используя тестовый метод.
 *
 */
public class Task01
{
    /**
     * Тестируемый метод.
     * Возвращает сумму входных параметров
     */
    public int test(int value1, int value2)
    {
        // FIXME исправь код метода таким образом, чтобы тест проходил.
        return value1 + value2 + 1;
    }

    /**
     * Тест метод
     */
    @Test
    public void testMethod()
    {
        // подготовка входных данных
        final int value1 = 2;
        final int value2 = 2;
        // ожидаемый резульатат работы метода 
        final int exepted = 4;
        
        // вызов тестируемого метода и получение фактического результата
        int result = test(value1, value2);

        // проверка утверждения (статический метод класса Assert)
        assertSame("Неверная сумма, результат должен быть равен 4", exepted, result);
    }
}