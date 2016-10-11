Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"

Solution:
public String front22(String str) {
  int take_num = 2;
  if(take_num > str.length()){
    take_num = str.length();
  }
  String front = str.substring(0, take_num);
  return front + str + front;
}

