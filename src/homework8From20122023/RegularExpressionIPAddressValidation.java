package homework8From20122023;

//Дополнительное задание: RegEx. IP адрес. 4 группы цифр (от 1 до 3 цифр в каждой) разделены точками. Группа содержит
//число в диапазоне от 1 до 255  Пример: 127.0.0.1 255.255.255.253 100.99.44.2

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionIPAddressValidation {
    private static final String IP_ADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final Pattern patternIPAdress = Pattern.compile(IP_ADDRESS_PATTERN);

    public static boolean validateIPAddress(String ipAddress) {
        Matcher matcherIPAdress = patternIPAdress.matcher(ipAddress);
        return matcherIPAdress.matches();
    }
    public static void main(String[] args) {
        String[] ipAddresses = {"127.0.0.1", "255.255.255.253", "100.99.44.2", "256.0.0.1", "abc.def.ghi.jkl"};

        for (String ipAddress : ipAddresses) {
            boolean isValidAddress = validateIPAddress(ipAddress);
            System.out.println(ipAddress + " is valid? " + isValidAddress);
        }
    }
}
