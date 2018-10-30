class Main {
  public static void main(String[] args) {
    StringBuilder s01 = new StringBuilder("Alpha");
    System.out.println("The initial string [" + s01 + "]");
    s01.append("BETA");
    System.out.println("The appended string [" + s01 + "]");
    s01.insert(2,"_X_");
    System.out.println("The inserted string [" + s01 + "]");
    System.out.println("The capacity is [" + s01.capacity() + "]");
    System.out.println("The charAt location 5 is [" + s01.charAt(5) + "]");
    s01.delete(4,6);
    System.out.println("The result of delete 4,6 is [" + s01 + "]");
    System.out.println("The indexOf aB is " + s01.indexOf("aB"));
    System.out.println("The length is " + s01.length());
    s01.replace(5,8,"A LARGER STRING");
    System.out.println("replace result [" + s01 + "]");
    s01.reverse();
    System.out.println("reverse result [" + s01 + "]");
    s01.setCharAt(7,'*');
    System.out.println("setCharAt 7 result [" + s01 + "]");
    System.out.println("subSequence 9,13 result [" + s01.subSequence(9,13) + "]");
  }
}