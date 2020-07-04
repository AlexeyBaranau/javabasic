package lesson10_homewrok;


public class StringDemo {
    public static void main(String[] args)  {
       String textForHomework = "\tThe Java language is closely999 related to the C ++ language, which in turn (delete text) is open" +
               "heir to C.\n" + "\tMany features (delete text) languages. I mean my syntax, and many 8 of its object-oriented" +
               "properties were (delete text) ported from C ++.\n" + "\tAs a matter 777 of fact, a number of defining 222characteristics (delete text) of the Java language has been " +
               "transferred - or developed in response to arising needs are from his predecessors. ";
        /*1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.*/
        System.out.println("\t\t\t*******************Task1*******************");
        System.out.println(StringUtil.firstLetterToUppperCase(textForHomework));
        System.out.println();

        /*2. Подсчитать количество содержащихся в данном тексте знаков препинания*/
        System.out.println("\t\t\t*******************Task2*******************");
        StringUtil.numberOfPunctuationMarks(textForHomework);
        System.out.println();

        /*3.  Определить сумму всех целых чисел, встречающихся в заданном тексте*/
        System.out.println("\t\t\t*******************Task3*******************");
        StringUtil.sumOfNumbersInText(textForHomework);
        System.out.println();

        /*4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять.*/
        System.out.println("\t\t\t*******************Task4*******************");
        StringUtil.letterToCharachterReplacement(textForHomework);
        System.out.println();

        /*5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся
        между скобками ‘(’ и ‘)’ */
        System.out.println("\t\t\t*******************Task5*******************");
        StringUtil.removeText(textForHomework);
        System.out.println();

        /*6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем. */
        System.out.println("\t\t\t*******************Task6*******************");
        StringUtil.repetitionOfEachWord(textForHomework);
        System.out.println();

        /*7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста*/
        System.out.println("\t\t\t*******************Task7*******************");
        StringUtil.countOfVowelsAndNotVowels(textForHomework);

        /*8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины*/


    }
}