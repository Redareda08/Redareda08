package esiea.tools.validator;

public class PasswordValidator {

    public boolean validatePassword(String s)
    {
        String strRegEx = "^(?=.*[0-9]).{6,20}$";
        if(s.matches(strRegEx)) return true;
        else return false;

    }
}
