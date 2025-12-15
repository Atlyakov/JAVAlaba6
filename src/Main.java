import java.util.Scanner;

/**
 * Главный класс приложения.
 * Содержит метод main для демонстрации работы всех классов и методов.
 */
public class Main {

    /**
     * Основной метод программы.
     * Демонстрирует:
     * - Работу аннотации @Invoke и обработчика Invoker.
     * - Вызов метода без аннотации @Invoke.
     * - Дружественный интерфейс с пользователем.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Демонстрация работы проекта ===\n");

        // 1. Демонстрация аннотации @Invoke и обработчика
        System.out.println("1. Вызов методов с аннотацией @Invoke:");
        SampleClass sample = new SampleClass();
        Invoker invoker = new Invoker();

        try {
            invoker.invokeMethods(sample);
        } catch (Exception e) {
            System.err.println("Ошибка при вызове методов: " + e.getMessage());
        }

        System.out.println(); // Отступ между разделами

        // 2. Вызов метода БЕЗ аннотации @Invoke
        System.out.println("2. Вызов метода без аннотации @Invoke:");
        try {
            sample.simpleMethod(); // Явный вызов метода simpleMethod()
        } catch (Exception e) {
            System.err.println("Ошибка при вызове simpleMethod: " + e.getMessage());
        }

        System.out.println("\n=== Работа программы завершена ===");
        scanner.close();
    }
}
