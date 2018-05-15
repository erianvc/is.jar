package is.jar;

public class is {
    
    public static final String VERSION = "v1.0";
    
    /*
        -------------------------------- REGEXP --------------------------------
    
        Regulars expresions of arasatasaygin (https://github.com/arasatasaygin/is.js) 
        
        Steven Levithan, Jan Goyvaerts: Regular Expressions Cookbook
    
        dateString match m/d/yy and mm/dd/yyyy, allowing any combination of one or two digits for the day and month, and two or four digits for the year
        eppPhone match extensible provisioning protocol format
        nanpPhone match north american number plan format
        time match hours, minutes, and seconds, 24-hour clock
    
        And to the following people mentioned:
        
        email regexp:   Dave Black
        Match:          a&d@somedomain.com | a*d@somedomain.com | a/d@somedomain.com
        Non-Matches:    .abc@somedomain.com | abc.@somedomain.com | a>b@somedomain.com
    
        url regexp:     Phil Cogbill
        Match:          http://3iem.net/ | http://3iem.museum:1337/ | plik.co.uk
        Non-Matches:	http://foobar | lameurl.toolongtld | (max domain length: 6)
    */
    
    private final static String affirmative = "^(?:1|t(?:rue)?|y(?:es)?|ok(?:ay)?)$";
    private final static String alphaNumeric = "^[A-Za-z0-9]+$";
    private final static String caPostalCode = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z]\\s?[0-9][A-Z][0-9]$";
    private final static String creditCard = "^(?:(4[0-9]{12}(?:[0-9]{3})?)|(5[1-5][0-9]{14})|(6(?:011|5[0-9]{2})[0-9]{12})|(3[47][0-9]{13})|(3(?:0[0-5]|[68][0-9])[0-9]{11})|((?:2131|1800|35[0-9]{3})[0-9]{11}))$";
    private final static String dateString = "^(1[0-2]|0?[1-9])([\\/-])(3[01]|[12][0-9]|0?[1-9])(?:\2)(?:[0-9]{2})?[0-9]{2}$";
    private final static String email = "^((([!#$%&'*+\\-/=?^_`{|}~\\w])|([!#$%&'*+\\-/=?^_`{|}~\\w][!#$%&'*+\\-/=?^_`{|}~\\.\\w]{0,}[!#$%&'*+\\-/=?^_`{|}~\\w]))[@]\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)$";
    private final static String eppPhone = "^\\+[0-9]{1,3}\\.[0-9]{4,14}(?:x.+)?$";
    private final static String hexadecimal = "^(?:0x)?[0-9a-fA-F]+$";
    private final static String hexColor = "^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$";
    private final static String ipv4 = "^(?:(?:\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(?:\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])$";
    private final static String ipv6 = "^((?=.*::)(?!.*::.+::)(::)?([\\dA-F]{1,4}:(:|\\b)|){5}|([\\dA-F]{1,4}:){6})((([\\dA-F]{1,4}((?!\\3)::|:\\b|$))|(?!\\2\\3)){2}|(((2[0-4]|1\\d|[1-9])?\\d|25[0-5])\\.?\b){4})$i";
    private final static String nanpPhone = "^\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$";
    private final static String socialSecurityNumber = "/^(?!000|666)[0-8][0-9]{2}-?(?!00)[0-9]{2}-?(?!0000)[0-9]{4}$";
    private final static String timeString = "^(2[0-3]|[01]?[0-9]):([0-5]?[0-9]):([0-5]?[0-9])$";
    private final static String ukPostCode = "^[A-Z]{1,2}[0-9RCHNQ][0-9A-Z]?\\s?[0-9][ABD-HJLNP-UW-Z]{2}$|^[A-Z]{2}-?[0-9]{4}$";    
    private final static String url = "^((((h)(t)|(f))(t)(p)((s)?))\\://)?(www.|[a-zA-Z0-9].)[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,6}(\\:[0-9]{1,5})*(/($|[a-zA-Z0-9\\.\\,\\;\\?\\'\\\\\\+&amp;%\\$#\\=~_\\-]+))*$";
    private final static String usZipCode = "^[0-9]{5}(?:-[0-9]{4})?$";
       
    
    //      ONE FALSE, ALL FALSE
    
    
    public static boolean affirmative(String... strs){
        for(String str: strs){
            if(!str.matches(affirmative))
                return false;
        }
        return true;
    }
    
    public static boolean alphaNumeric(String... strs){
        for(String str: strs){
            if(!str.matches(alphaNumeric))
                return false;
        }
        return true;
    }
    
    public static boolean caPostalCode(String... strs){
        for(String str: strs){
            if(!str.matches(caPostalCode))
                return false;
        }
        return true;
    }
    
    public static boolean creditCard(String... strs){
        for(String str: strs){
            if(!str.matches(creditCard))
                return false;
        }
        return true;
    }
    
    public static boolean dateString(String... strs){
        for(String str: strs){
            if(!str.matches(dateString))
                return false;
        }
        return true;
    }
    
    public static boolean email(String... strs){
        for(String str: strs){
            if(!str.matches(email))
                return false;
        }
        return true;
    }
    
    public static boolean eppPhone(String... strs){
        for(String str: strs){
            if(!str.matches(eppPhone))
                return false;
        }
        return true;
    }
    
    public static boolean hexadecimal(String... strs){
        for(String str: strs){
            if(!str.matches(hexadecimal))
                return false;
        }
        return true;
    }
    
    public static boolean hexColor(String... strs){
        for(String str: strs){
            if(!str.matches(hexColor))
                return false;
        }
        return true;
    }
    
    public static boolean ip(String... strs){
        return (ipv4(strs) && ipv6(strs));
    }
    
    public static boolean ipv4(String... strs){
        for(String str: strs){
            if(!str.matches(ipv4))
                return false;
        }
        return true;
    }
    
    public static boolean ipv6(String... strs){
        for(String str: strs){
            if(!str.matches(ipv6))
                return false;
        }
        return true;
    }
    
    public static boolean nanpPhone(String... strs){
        for(String str: strs){
            if(!str.matches(nanpPhone))
                return false;
        }
        return true;
    }
    
    public static boolean socialSecurityNumber(String... strs){
        for(String str: strs){
            if(!str.matches(socialSecurityNumber))
                return false;
        }
        return true;
    }
    
    public static boolean timeString(String... strs){
        for(String str: strs){
            if(!str.matches(timeString))
                return false;
        }
        return true;
    }
    
    public static boolean ukPostCode(String... strs){
        for(String str: strs){
            if(!str.matches(ukPostCode))
                return false;
        }
        return true;
    }
    
    public static boolean url(String... strs){
        for(String str: strs){
            if(!str.matches(url))
                return false;
        }
        return true;
    }
    
    public static boolean usZipCode(String... strs){
        for(String str: strs){
            if(!str.matches(usZipCode))
                return false;
        }
        return true;
    }
    
}