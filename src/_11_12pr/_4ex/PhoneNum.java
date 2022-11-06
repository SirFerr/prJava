package _11_12pr._4ex;

public class PhoneNum {
    String phoneNumNew;

    String converts(String phoneNum){
        phoneNumNew="+";
        char[] chars= new char[phoneNum.length()];
        int countryNumLength,o=0;
        phoneNum.getChars(0,phoneNum.length(),chars,0);
        if(phoneNum.contains("+")){
            o=1;
        }
        countryNumLength=phoneNum.length()-o-10;
        for(int i=o;i<countryNumLength+o;i++){
            phoneNumNew+=chars[i];
        }
        for(int i=countryNumLength+o;i<countryNumLength+3+o;i++){
            phoneNumNew+=chars[i];
        }
        phoneNumNew+="-";
        for(int i=countryNumLength+3+o;i<countryNumLength+6+o;i++){
            phoneNumNew+=chars[i];
        }
        phoneNumNew+="-";
        for(int i=countryNumLength+6+o;i<countryNumLength+10+o;i++){
            phoneNumNew+=chars[i];
        }
        return phoneNumNew;
    };
}
