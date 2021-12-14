package com.example.jeetry;

public class HobbyPhotography extends MySelf implements PhotographySkills
{

    public String MyHobbyDesc1;
    public String DeviceType;
    public String DeviceName;

    public HobbyPhotography(String myName, String myAge, String myHobby, String myHobbyDesc1, String deviceType, String deviceName) {
        super(myName, myAge, myHobby);
        MyHobbyDesc1 = myHobbyDesc1;
        DeviceType = deviceType;
        DeviceName = deviceName;
    }

    public String getMyHobbyDesc1() {
        return MyHobbyDesc1;
    }

    public void setMyHobbyDesc1(String myHobbyDesc1) {
        MyHobbyDesc1 = myHobbyDesc1;
    }

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public void PrintInfo ()
    {
        System.out.println("\nName :"+ super.MyName + "\nAge :"+ super.MyAge + "\nHobby's Name:"+ HobbyName1
                + "\nLevel of Interest: "+ PhotographySkills.LevelOfInterest1
                + "\n\n Top 5 Photography Apps I love to use: " + "\n\n1: " + App1 + "\n2: " + App2
                + "\n3: "+ App3 + "\n4: "+ App4 + "\n5: "+ App5);
    }
}
