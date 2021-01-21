public class StringManipulator {

    public String trimAndConcat(String str1, String str2) {
        return str1.trim() + " " + str2.trim();
    }

    public Integer getIndexOrNull (String str1, char char1) {
        if(str1.indexOf(char1) != -1) {
            return str1.indexOf(char1);
        } else {
            return null;
        }
    //     return str1.indexOf(char1);
    }

    public Integer getIndexOrNull (String str1, String subStr1) {
        if(str1.indexOf(subStr1) != -1) {
            return str1.indexOf(subStr1);
        } else {
            return null;
        }
    }

    public String concatSubstring(String str1, int start, int end, String str2) {
        return str1.substring(start, end).concat(str2);
    }




}