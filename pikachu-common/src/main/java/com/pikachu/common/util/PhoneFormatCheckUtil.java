package com.pikachu.common.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 验证手机号是否正确
 * JDK version used:      <JDK1.8>
 *
 * @author HP
 * @ClassName: PhoneFormatCheckUtils
 * @Description: TODO(What does this class do ?)
 * @date 2017年3月29日
 */
public class PhoneFormatCheckUtil {
    /**
     * 固定电话：区号+座机号码+分机号码
     */
    private static final String FIX_TEL_REG = "(?:(\\(\\+?86\\))(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)|" +
            "(?:(86-?)?(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)";

    private static final Pattern SIMPLE_PHONE_REG = Pattern.compile("^1(2|3|4|5|6|7|8|9)\\d{9}$");

    private static final int DEFAULT_PHONE_LENGTH = 11;
    /**
     * 大陆号码或香港号码均可
     */
    public static boolean isPhoneLegal(String str) throws PatternSyntaxException {
        if (SimpleStringUtils.isBlank(str)) {
            return false;
        }
        return isChinaPhoneLegal(str) || isHKPhoneLegal(str);
    }

    /**
     * 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数
     * 此方法中前三位格式有：
     * 13+任意数
     * 15+除4的任意数
     * 18+除1和4的任意数
     * 17+除9的任意数
     * 147
     */
    public static boolean isChinaPhoneLegal(String str) throws PatternSyntaxException {
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    /**
     * 香港手机号码8位数，5|6|8|9开头+7位任意数
     */
    public static boolean isHKPhoneLegal(String str) throws PatternSyntaxException {
        String regExp = "^(5|6|8|9)\\d{7}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }


    public static boolean isPhone(String phone) {
        if (SimpleStringUtils.isEmpty(phone)) {
            return false;
        }
        if (phone.length() != DEFAULT_PHONE_LENGTH) {
            return false;
        }
        Matcher m = SIMPLE_PHONE_REG.matcher(phone);
        return m.matches();
    }


    public static boolean isFixTel(String tel) {
        if (SimpleStringUtils.isEmpty(tel)) {
            return false;
        }
        Pattern p = Pattern.compile(FIX_TEL_REG);
        Matcher m = p.matcher(tel);
        return m.matches();
    }


}
