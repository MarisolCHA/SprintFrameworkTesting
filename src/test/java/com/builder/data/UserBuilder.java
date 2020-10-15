package com.builder.data;


import com.model.User;

public class UserBuilder {
    private User user;

    public UserBuilder(){
        // user = User.builder().build();
    }
    public static UserBuilder aUser(){
        return new UserBuilder();
    }

    public UserBuilder but(){
        return withDefualtInfo();
    }
    // si se tiene loobox
    public UserBuilder withDefualtInfo(){
//        this.user= User.builder().firstName("Pepito")
//                                 .lastName("Perez")
//                                 .email("perez@fdf.com")
//                .gender(Gender.male)
//                .country("Colombia")
//                .birthDay("10")
//                .birthMonth("February")
//                .birthYear("1989")
//                .phone(RandomNumberGenerator.get())
//                .password("A_x?a1989")
//                .passwordConfirmation("A_x?a1989").build();
        return this;
    }

    public User build(){
        return this.user;
    }

    public UserBuilder withoutEmail(){
        return this;
    }
}

