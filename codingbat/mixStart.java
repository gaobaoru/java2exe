Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

Solution:
public boolean mixStart(String str) {
  if(str.length() < 3) return false;
  String two = str.substring(1, 3);
  if(two.equals("ix")) return true;
  else return false;
}

