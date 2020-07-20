package lesson15;

import lesson8_homework.domain.Book;
import lesson8_homework.util.UtilClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {
    public static void main(String[] args) {

        Book book = UtilClass.generateBook(1);
        Class<? extends Book> bookClass = book.getClass();
        Annotation[] classAnnotations = bookClass.getDeclaredAnnotations();
        for (Annotation classAnnotation : classAnnotations) {
            System.out.println(classAnnotation.toString());
        }
        Method[] declaredMethods = bookClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(lesson15.Annotation.class)){
                System.out.println(Modifier.toString(declaredMethod.getModifiers()) + " " + declaredMethod.getName());
            }
        }
        Field[] declaredFields = bookClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(lesson15.Annotation.class)) {
                System.out.println(Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getName());
            }

        }

    }
}
