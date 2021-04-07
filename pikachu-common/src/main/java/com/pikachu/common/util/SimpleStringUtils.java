package com.pikachu.common.util;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class SimpleStringUtils {
    public static final String EMPTY = "";

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !SimpleStringUtils.isEmpty(str);
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
        return !SimpleStringUtils.isBlank(str);
    }

    public static String clean(String str) {
        return str == null ? EMPTY : str.trim();
    }

}
