package BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateIfOneCharacterSequenceEndsWithAnother {
public static void main(String[] args) {
	 BiPredicate<CharSequence, CharSequence> endsWith = (seq1, seq2) -> seq1.toString().endsWith(seq2.toString());
     System.out.println(endsWith.test("hello", "lo"));    // true
     System.out.println(endsWith.test("world", "ld"));    // true
     System.out.println(endsWith.test("java", "python")); // false
}
}
