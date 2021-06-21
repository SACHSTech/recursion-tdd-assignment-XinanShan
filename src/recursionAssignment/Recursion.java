package recursionAssignment;

/**
* write these recursion methods in TDD Red-Green-Refactor process
* pick a problem from each of the problem set
* write the tests before coding and make sure the test includes all the conditions
* one test at a time
* @author: A. Shan
*/
public class Recursion{
  /**
  * Given an array of ints and a index
  * return true if the there's a value that is followed by another value that equals the first value times 10
  * a recursive call is pass index plus 1 to move down the array
  * The initial call will pass in index as 0
  * @author: A. Shan
  */
  public static boolean array220(int[] intNums, int index){
    //declearing the variables
    int Length = intNums.length;
    // check if the index is greater than the length of the array
    if (index >= Length - 1) {
      // base case
     return false;
    }
    // check if the current index position in the array has a value followed in the array by that value times 10
    if (intNums[index] * 10 == intNums[index + 1]) {
     return true;
     // if not, check for the next one and repeat the whole thing
    }else {
      // recursion case
      return array220(intNums, index + 1);
    }
  }
  /**
  * Given a string, return recursively a "cleaned" string
  * where adjacent chars that are the same have been reduced to a single char
  * Example: yyzzza yields yza
  * @author: A. Shan
  */
  public static String stringClean(String str){
    if ( str.length() <= 1){
      // base case 
      return str;
    }
    if ( str.charAt(0) == str.charAt(1)){
      // recursion case
      return stringClean(str.substring(1));
    } else{
      // recursion case
      return str.charAt(0) + stringClean(str.substring(1));
    } 
  }
  /**
  * Given a string and a non-empty substring sub
  * compute recursively if at least n copies of sub appear in the string somewhere, 
  * possibly with overlapping.
  * N will be non-negative.
  * @author: A. Shan
  */
  public static boolean strCopies(String str, String sub, int n){
    if (n <= 0){
      // base case 
      return true; 
    }
    if (str.length() < sub.length()){
      // another base case if there's no substring sub
      return false;
    }
    // check if there's sub within the str
    if (str.substring(0, sub.length()).equals(sub)){
      // recursion case
      return strCopies(str.substring(1), sub, n-1);
    }else{
      // recursion case if sub isn't found
      return strCopies(str.substring(1), sub, n);
  }
 }
}
