/**
 * Класс SampleClass содержит несколько методов для демонстрации работы аннотации @Invoke.
 */
public class SampleClass {

    /**
     * Простой метод, не помеченный аннотацией @Invoke.
     * Выводит приветственное сообщение.
     */
    public void simpleMethod() {
        System.out.println("Выполнен простой метод.");
    }

    /**
     * Метод, помеченный аннотацией @Invoke.
     * Будет автоматически вызван обработчиком через Reflection API.
     */
    @Invoke
    public void invokedMethod() {
        System.out.println("Выполнен метод, помеченный @Invoke.");
    }

    /**
     * Ещё один метод без аннотации.
     * Демонстрирует, что обрабатываются только методы с @Invoke.
     */
    public void anotherMethod() {
        System.out.println("Выполнен другой метод.");
    }
}
