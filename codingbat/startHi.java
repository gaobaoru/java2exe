Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

Solution:
public boolean startHi(String str) {
  if(str.length() < 2) return false;
  String frontTwo = str.substring(0, 2);
  if(frontTwo.equals("hi")) return true;
  else return false;
}

