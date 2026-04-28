class StringUtils {
  public static void main(String[] args){
    System.out.println("do nothing");
  }

  static boolean containsChar(String str, char target) {

    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i) == target) return true;
    }

    return false;
  }

  static String reverse(String str) {
    String reverse = "";

    for(int i = str.length() - 1; i >= 0; i--){
      reverse += str.charAt(i);
    }

    return reverse;
  }

  static String replaceAll(String str, char replace, char replacer) {
    String newString = "";

    for(int i = 0; i < str.length(); i++){

      if(str.charAt(i) == replace){
        newString += replacer;

      }else{
      newString += str.charAt(i);

      }
    }

    return newString;
  }
}