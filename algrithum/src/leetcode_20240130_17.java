package src;

import java.util.*;

public class leetcode_20240130_17 {
    public List<String> letterCombinations( String digits ) {
        List<String> combinations = new ArrayList<String>();
        if ( digits.isEmpty() ) {
            return combinations;
        }
        Map<Character, String> hashmap = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );
        return combinations;
        }
    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination){

    }

    }

