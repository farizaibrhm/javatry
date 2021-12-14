package com.example.jeetry;

public class MySelf implements IndieJams,PhotographySkills
{
    public String MyName;
    public String MyAge;
    public String MyHobby;

    public MySelf(String myName, String myAge, String myHobby) {
        MyName = myName;
        MyAge = myAge;
        MyHobby = myHobby;
    }

    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    public String getMyAge() {
        return MyAge;
    }

    public void setMyAge(String myAge) {
        MyAge = myAge;
    }

    public String getMyHobby() {
        return MyHobby;
    }

    public void setMyHobby(String myHobby) {
        MyHobby = myHobby;
    }

}
