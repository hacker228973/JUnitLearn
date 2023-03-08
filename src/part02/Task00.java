package part02;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import part00.practica.Task01;
import part00.practica.Task02;

/**
 * @RunWith позволяет объеденить запуск нескольких тестовых классов в один тест
 */
// список классов которые запустятся вместе
@Suite.SuiteClasses({ part00.practica.Task00.class, Task01.class , Task02.class})
@RunWith(Suite.class)
public class Task00
{

}