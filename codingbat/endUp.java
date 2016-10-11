Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"

Solution:
public String endUp(String str) {
  if(str.length() <= 3) return str.toUpperCase();
  int cut_num = str.length() - 3;
  String front = str.substring(0, cut_num);
  String back = str.substring(cut_num);
  return front + back.toUpperCase();
}

