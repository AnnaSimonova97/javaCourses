package Lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterEx {
    public static void main(String[] args) {
        String s = "MADAM";
        char[] chars = s.toCharArray();
        List<Character> characterList = new ArrayList<>();
        boolean isPalindrome = true;
        for (char c : chars)
            characterList.add(c);
        ListIterator<Character> iter = characterList.listIterator();
        ListIterator<Character> reversIter = characterList.listIterator(characterList.size());

        while (iter.hasNext() && reversIter.hasPrevious()) {
            if (!iter.next().equals(reversIter.previous())) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("Это - полиндром");
        else System.out.println("Это не полиндром");
    }
}
