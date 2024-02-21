package homework16From21022024.AnnotationTest;

import java.lang.reflect.Method;
/* Создайте класс TestAnnotation и в нем метод public String old() возвращающий любой текст.
Создайте вызывающий класс CallOld с методом call() вызывающим и печатающим результат old().
Скомпилируйте и убедитесь в отсутствии warning.
Пометьте old() аннотацией @Deprecated.
Скомпилируйте и убедитесь, что появится warning.
Пометьте вызов аннотацией @SuppressWarning чтобы не было warnin. */

public class CallOld {
    public void call() {
        TestAnnotation testAnnotation = new TestAnnotation();
        try {
            Method method = TestAnnotation.class.getMethod("old");
            method.setAccessible(true);
            String result = (String) method.invoke(testAnnotation);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        CallOld callOld = new CallOld();
        callOld.call();
    }
}
