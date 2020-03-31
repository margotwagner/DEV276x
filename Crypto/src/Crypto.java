public class Crypto {
    public static void main(String[] args) {
        //String str = normalizeText("This is some \"really\" great. (Text)!?");
        //System.out.println(str);
        //String str = caesarify("ILIKEZOOS", 1);
        //String str = groupify("HITHERE", 2);
        String str = encryptString("This is some \"really\" great. (Text)!?", 2, 3);
        System.out.println(str);
    }
    public static String normalizeText(String originalStr) {
        /*
        Method that removes all whitespaces and punctuation and converts all letters to uppercase
        input   originalStr:    string to transform
        return  newStr:         transformed string
         */
        String newStr = originalStr.replaceAll("[\\s+\\.$|,|;|'\"|(|)|!|?]","").toUpperCase();
        return newStr;
    }

    public static String caesarify(String strToEncrypt, int key)   {
        /*
        Method that applies a Caesar Cipher encryption which shifts each individual character forward in the alphabet by
        a certain number or "key".

        input   strToEncrypt:    unencrypted original string
                key:             shift in alphabet to apply
        return  shiftedStr:      encrypted string
         */
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlpha = shiftAlphabet(key);
        String shiftedStr = "";
        for (int i=0; i < strToEncrypt.length(); i++) {
            shiftedStr = shiftedStr + shiftedAlpha.charAt(alphabet.indexOf(strToEncrypt.charAt(i)));
        }

        return shiftedStr;



    }

    public static String shiftAlphabet(int shift) {
        /*
        Method that returns the alphabet shifted by the input amount.

        input   shift:    amount alphabet is shifted (int)

        return  result:   shifted alphabet (string)
         */

        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String groupify(String strToGroup, int groupSize)  {
        /*
        Method that applies a Caesar Cipher encryption which shifts each individual character forward in the alphabet by
        a certain number or "key".

        input   strToGroup:     string to break into groups (string)
                charPerGroup:   number of letters per group (int)
        return  shiftedStr:     string broken into groups (string)
         */

        while (!(strToGroup.length() % groupSize == 0))  {
            strToGroup = strToGroup + "x";
        }

        String groupedStr = "";
        for (int i=0; i < strToGroup.length(); i += groupSize) {
            groupedStr = groupedStr + strToGroup.substring(i, i + groupSize) + " ";
        }

        return groupedStr.trim();
    }

    public static String encryptString(String original, int shift, int groupSize)   {
        /*
        Method that applies a Caesar Cipher encryption on a string and returns a cyphertext equivalent

        input   original:       string to be encrypted (string)
                shift:          alphabetical shift in string (int)
                groupSize:      number of letters per group (int)
        return  result:         encrypted cyphertext equivalent (string)
         */

        String str = normalizeText(original);
        str = caesarify(str, shift);
        str = groupify(str, groupSize);

        return str;
    }
}
