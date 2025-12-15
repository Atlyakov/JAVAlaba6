import java.lang.annotation.*;

/**
 * Аннотация @Invoke указывает, что метод должен быть вызван автоматически обработчиком.
 * <para>
 * Характеристики:
 * - Применяется только к методам ({@link ElementType#METHOD}).
 * - Доступна во время исполнения программы ({@link RetentionPolicy#RUNTIME}).
 * - Не имеет свойств.
 * </para>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Invoke {
}
