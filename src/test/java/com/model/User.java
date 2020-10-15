package com.model;

import com.enums.Gender;
import com.utility.reporting.RandomNumberGenerator;

public class User {

    private String firstName = "pepito";
    private String lastName = "Perez";
    private String email = "perez@fdf.com";
    private Gender gender = Gender.male;
    private String country = "Colombia";
    private String birthDay = "10";
    private String birthMonth = "February";
    private String birthYear = "1989";
    private String phone = RandomNumberGenerator.get();
    private String password = "A_x?a1989";
    private String passwordConfirmation = "A_x?a1989";
    private String profile = "";

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public Gender getGender(){
        return gender;
    }
    public String getCountry(){
        return country;
    }
    public String getBirthDay(){
        return birthDay;
    }
    public String getBirthMonth(){
        return birthMonth;
    }
    public String getBirthYear(){
        return birthYear;
    }
    public String getPhone(){
        return phone;
    }

    public String getPassword(){
        return password;
    }

    public String getPasswordConfirmation(){
        return passwordConfirmation;
    }

    public String getProfile(){
        return profile;
    }

}
