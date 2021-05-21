package recursionAssignment;

public class Recursion{
  public static boolean array220(int[] intNums, int index){
    //declearing the variables
    int Length = intNums.length;
    if (index >= Length - 1) {
     return false;
    if (intNums[index] * 10 == intNums[index + 1]) {
     return true;
    }else {
      return array220(intNums, index + 1);
    }
  }
 // public static String stringClean(String str){

  //}
 // public static boolean strCopies(String str, String sub, int n){

 // }
}
