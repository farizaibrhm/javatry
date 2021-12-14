package com.example.jeetry;

public class HobbyListeningMusic extends MySelf implements IndieJams
{
    public String MyHobbyDesc2;
    public String MusicAppUsed;

    public HobbyListeningMusic(String myName, String myAge, String myHobby, String myHobbyDesc2, String musicAppUsed) {
        super(myName, myAge, myHobby);
        MyHobbyDesc2 = myHobbyDesc2;
        MusicAppUsed = musicAppUsed;
    }

    public String getMyHobbyDesc2() {
        return MyHobbyDesc2;
    }

    public void setMyHobbyDesc2(String myHobbyDesc2) {
        MyHobbyDesc2 = myHobbyDesc2;
    }

    public String getMusicAppUsed() {
        return MusicAppUsed;
    }

    public void setMusicAppUsed(String musicAppUsed) {
        MusicAppUsed = musicAppUsed;
    }

    public void PrintInfo ()
    {
        System.out.println("\nName :"+ super.MyName + "\nAge :"+ super.MyAge + "\nHobby's Name: "+ HobbyName2
                + "\nLevel of Interest: "+ LevelOfInterest2
                + "\n\n Top 5 Fav Indie Songs: " + "\n\n1: " + Song1 + "\n2: " + Song2
                + "\n3: "+ Song3 + "\n4: "+ Song4 + "\n5: "+ Song5 + "\n\n Top 5 Fav Indie Singers: " + "\n\n1: " + Singer1
                + "\n2: " + Singer2 + "\n3: "+ Singer3 + "\n4: "+ Singer4 + "\n5: "+ Singer5 );
    }


}
