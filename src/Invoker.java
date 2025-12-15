import java.lang.reflect.Method;

/**
 * Класс Invoker отвечает за поиск и вызов методов, помеченных аннотацией @Invoke.
 * Использует Reflection API для анализа классов и вызова методов.
 */
public class Invoker {

    /**
     * Автоматически находит и вызывает все методы объекта, помеченные аннотацией @Invoke.
     *
     * @param obj Объект, методы которого нужно проанализировать и вызвать.
     * @throws Exception Если возникает ошибка при вызове метода через Reflection.
     */
    public void invokeMethods(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                System.out.printf("Найдена аннотированная методом @Invoke: %s%n", method.getName());
                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }
}
