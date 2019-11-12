package com.company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

    @Test
    public void recognizeNull() {
        assertEquals(false, MainTest.isPalindrome(null));
    }

    @Test
    public void recognizeEmptyString() {
        assertEquals(true, MainTest.isPalindrome(""));
    }

    @Test
    public void recognizeOneCharacterPalindrome() {
        assertEquals(true, MainTest.isPalindrome("a"));
    }

    @Test
    public void recognizeTwoCharacterPalindrome() {
        assertEquals(true, MainTest.isPalindrome("aa"));
    }

    @Test
    public void recognizeTwoCharacterNonPalindrome() {
        assertEquals(false, MainTest.isPalindrome("az"));
    }

    @Test
    public void recognizePalindrome() {
        assertEquals(true, MainTest.isPalindrome("racecar"));
    }

    @Test
    public void shouldRecognizeNonPalindrome() {
        assertEquals(false, MainTest.isPalindrome("programming"));
    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        } else if (word.length() < 2) {
            return true;
        } else {
            if (!word.endsWith(word.substring(0, 1))) {
                return false;
            }
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }
}