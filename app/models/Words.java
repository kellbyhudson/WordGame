package models;

import java.util.Random;

public class Words
{
    private String imageUrl;
    private String place1;
    private String adjective1;
    private String noun1;
    private String noun2;
    private String verbPastTense1;

    public String getPlace1()
    {
        return place1;
    }

    public void setPlace1(String place1)
    {
        this.place1 = place1;
    }

    public void setRandomPlace1()
    {
        Random random = new Random();
        int number = random.nextInt(13);
        String[] places = {"Walmart", "Pizza Ranch", "Grandma's House", "A Kitchen in Hell's Kitchen",
                "The Looney Bin", "Dirty Bar Bathroom", "The Blue Lagoon", "Chachsky's", "Tilted Kilt of Conway",
                "Toad Suck Campgrounds", "Drug Dealer's laundry room", "Arizona Waterfront Property", "Persia"};
        this.place1 = places[number];
        setImageUrl(number);
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl(int imageAssignment)
    {
        String[] images = {"/assets/images/walmart.jpg", "/assets/images/pizzaranch.jpg", "/assets/images/grandmashouse.jpg", "/assets/images/hellskitchen.jpg",
                "/assets/images/looneybin.jpg", "/assets/images/barbathroom.jpg", "/assets/images/bluelagoon.jpg", "/assets/images/chachskys.jpg", "/assets/images/tiltedkilt.png",
                "/assets/images/toadsuck.jpg", "/assets/images/drugdealersroom.jpg", "/assets/images/arizonawaterfront.jpg", "/assets/images/persia.jpg"};
        this.imageUrl = images[imageAssignment];
    }

    public String getAdjective1()
    {
        return adjective1;
    }

    public void setAdjective1(String adjective1)
    {
        this.adjective1 = adjective1;
    }

    public void setRandomAdjective1()
    {
        Random random = new Random();
        int number = random.nextInt(14);
        String[] places = {"nutty", "acidic", "loose", "splendid", "amusing", "little", "healthy",
                "ludicrous", "ignorant", "ritzy", "needy", "vivacious", "clammy", "useless" };
        this.adjective1 = places[number];
    }

    public String getNoun1()
    {
        return noun1;
    }

    public void setNoun1(String noun1)
    {
        this.noun1 = noun1;
    }

    public void setRandomNoun1()
    {
        Random random = new Random();
        int number = random.nextInt(15);
        String[] places = {"glue", "money", "card", "mouth", "fire", "rabbit", "books",
                "crayon", "sticks", "ear", "quarter", "thumb", "blood", "mother", "toothbrush"};
        this.noun1 = places[number];
    }

    public String getNoun2()
    {
        return noun2;
    }

    public void setNoun2(String noun2)
    {
        this.noun2 = noun2;
    }

    public void setRandomNoun2()
    {
        Random random = new Random();
        int number = random.nextInt(15);
        String[] places = {"baseball", "bell", "laborer", "baby", "fish", "screw", "monkey", "weight", "earthquake",
                "leaf", "theory", "chickens", "riddle", "flowers", "coal"};
        this.noun2 = places[number];
    }

    public String getVerbPastTense1()
    {
        return verbPastTense1;
    }

    public void setVerbPastTense1(String verbPastTense1)
    {
        this.verbPastTense1 = verbPastTense1;
    }

    public void setRandomVerbPastTense1()
    {
        Random random = new Random();
        int number = random.nextInt(15);
        String[] places = {"removed", "solicited", "expanded", "illuminated", "detected", "urged", "marked",
                "developed", "milked", "whispered", "scowled", "forced", "drilled", "prohibited", "damaged"};
        this.verbPastTense1 = places[number];
    }

}
