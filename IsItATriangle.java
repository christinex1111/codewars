class IsItATriangle {
  public static boolean isTriangle(int a, int b, int c){
    if (a + b > c && a + c > b && c + b > a) {
      return true;
    }
    return false;
  }
}