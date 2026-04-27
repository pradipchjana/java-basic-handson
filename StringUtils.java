class StringUtils {
  public static void main(String[] args){
    System.out.println("do nothing");
  }

  static boolean containsChar(String str, char c) {

    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i) == c) return true;
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

  static String replaceAll(String str, char a, char b) {
    String newString = "";

    for(int i = 0; i < str.length(); i++){

      if(str.charAt(i) == a){
        newString += b;

      }else{
      newString += str.charAt(i);

      }
    }

    return newString;
  }
}