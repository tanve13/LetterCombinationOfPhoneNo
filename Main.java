import java.util.*;
class Solution{
    public List<String> letterCombinations(String digits){
    if(digits == null || digits.length() == 0) return new ArrayList<>();
    String numberToLetters[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

      List<String> result = new ArrayList<>();
      result.add("");
      for(char digit : digits.toCharArray()){
        String letters = numberToLetters[digit -'0'];
             List<String> temp = new ArrayList<>();

           for (String prefix : result) {
                for (char letter : letters.toCharArray()) {
                    temp.add(prefix + letter);
                }
            }
            result = temp;
      }
      return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.letterCombinations("23"));
        System.out.println(sol.letterCombinations(""));
        System.out.println(sol.letterCombinations("2"));
    }
}