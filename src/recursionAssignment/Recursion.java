package recursionAssignment;

public class Recursion{
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
 // public static boolean strCopies(String str, String sub, int n){

 // }
}
