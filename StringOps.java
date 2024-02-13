import java.security.KeyException;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest (String string) {
        char[] finalarray= new char [string.length()];
        char[] vawlesarray= {'a','e','i','o','u','A','E','I','O','U'};
        for (int i = 0; i < string.length() ; i++) {
            finalarray[i] = string.charAt(i);
            for (int j = 0; j < vawlesarray.length; j++) {
                if(finalarray[i] == vawlesarray[j]){
                    finalarray[i] = ApperCase(finalarray[i]);
                    break;
                } else {
                    finalarray [i] = LowerCase(finalarray[i]);
                }
            }
            

        }
        String finalstring = "";
        for (int k = 0; k < finalarray.length; k++) {
            finalstring = finalstring + finalarray[k];
        }
        return finalstring;
    }

    public static String camelCase (String string) {
        String Firststring= "";
        int Startspace = 0 ;
        int Endspace = 0;
        while(Startspace < string.length() && string.charAt(Startspace) == ' ' ) {
            Startspace++;
        }

        for (int i = Startspace; i < string.length() ; i++) {
            Firststring += string.charAt(i);
        }
        while ( Endspace < Firststring.length() && Firststring.charAt(Firststring.length() - 1 - Endspace) == ' '){
            Endspace ++;
        }

        String Seconedstring = "";
        for (int j = 0; j < Firststring.length() - Endspace; j++) {
            Seconedstring += LowerCase(Firststring.charAt(j));
        }
        String Ansstring = " ";
        boolean spaceEncounterd = false ;
        for (int k = 0; k < Seconedstring.length(); k++) {
            char currentChar = Seconedstring.charAt(k);
            if( Seconedstring.charAt(k) == ' '){
                spaceEncounterd= true;
            } else {
                if(spaceEncounterd){
                    Ansstring += ApperCase(currentChar);
                    spaceEncounterd = false;
                } else{
                    Ansstring += currentChar;
                }
            }
        }
        return Ansstring;
        }
    

        public static int[] allIndexOf(String string, char chr) {
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == chr) {
                    count++;
                }
            }
            int[] answerArray = new int[count];
            int index = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == chr) {
                    answerArray[index++] = i;
                }
            }
            return answerArray;
        }
     

    public static char ApperCase(char ch){
        if (ch >= 'a' && ch <= 'z') {
            return (char)(ch - 32);
        } else {
            return ch;
        }
      }
      public static char LowerCase(char ch){
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32 );
        } else {
            return ch;
        }
      }
      
    }
