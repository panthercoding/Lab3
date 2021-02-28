/*
a utility class with a usable static method 

call the method using Util.strcspn(provide inputs here)

DONT WORRY ABOUT IMPLEMENTATION -> just use the method (abstraction for now)
*/

public class Util{

  public static int strcspn(String str1, String str2){

    int i = 0;
    int consonants = 0;
    String temp;
    boolean vowelSeen = false;

    while ((i<str1.length()) & (!vowelSeen)){

      for (int j=0; j < str2.length(); j++){
        temp = str1.substring(i,i+1);
        if (temp.indexOf(str2.charAt(j))!=-1){
          vowelSeen = true;
        }
      }
      if (!vowelSeen){
        consonants++;
      }
      i++;
    }
    return(consonants);
  }
}

