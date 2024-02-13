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
        while(string.charAt(Startspace) == ' ' ) {
            Startspace++;}
        for (int i = Startspace; i < string.length() - Startspace - 1; i++) {
            Firststring += string.charAt(i);
        }
        String Seconedstring = "";
        while (Firststring.charAt(Firststring.length() -Endspace) == ' '){
            Endspace ++;
        }
        for (int j = 0; j < Firststring.length() - Endspace - 1; j++) {
            Seconedstring += LowerCase(Firststring.charAt(j));
        }
        String Ansstring = " ";
        int k = 0;
        while (k < Seconedstring.length()) {
            if( Seconedstring.charAt(k) == ' '){
                if( Seconedstring.charAt(k +1 ) == ' '){
                 k++;
                } else{
                    Ansstring += ApperCase(Seconedstring.charAt( k + 1));
                    k += 2;
                }
            } 
            else{
                Ansstring += Seconedstring.charAt(k);
                k ++;
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
