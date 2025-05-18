package com.travel.model;

import java.util.ArrayList;
import java.util.List;

public abstract class TouristPackage {
    private String id;
    private String name;
    private String destination;
    private String description;
    private double baseCost;
    private int duration;
    private String type;
    private List<String> activities;
    private String hotelClass;
    private String transport;
    private String mealPlan;
    private String roomType;
    private List<String> addOns;
    private String imageUrl1;
    private String imageUrl2;
    private String imageUrl3;
    private String imageUrl4;

    public TouristPackage(String id, String name, String destination, String description, double baseCost, int duration, String type) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.description = description;
        this.baseCost = baseCost;
        this.duration = duration;
        this.type = type;
        this.activities = new ArrayList<>();
        this.hotelClass = "3-star";
        this.transport = "bus";
        this.mealPlan = "breakfast";
        this.roomType = "standard";
        this.addOns = new ArrayList<>();
        this.imageUrl1 = "images/default-package1.jpg";
        this.imageUrl2 = "images/default-package2.jpg";
        this.imageUrl3 = "images/default-package3.jpg";
        this.imageUrl4 = "images/default-package4.jpg";
    }

    public abstract double calculateTotalCost();

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getBaseCost() { return baseCost; }
    public void setBaseCost(double baseCost) { this.baseCost = baseCost; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public List<String> getActivities() { return activities; }
    public void setActivities(List<String> activities) { this.activities = activities; }
    public String getHotelClass() { return hotelClass; }
    public void setHotelClass(String hotelClass) { this.hotelClass = hotelClass; }
    public String getTransport() { return transport; }
    public void setTransport(String transport) { this.transport = transport; }
    public String getMealPlan() { return mealPlan; }
    public void setMealPlan(String mealPlan) { this.mealPlan = mealPlan; }
    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }
    public List<String> getAddOns() { return addOns; }
    public void setAddOns(List<String> addOns) { this.addOns = addOns; }
    public String getImageUrl1() { return imageUrl1; }
    public void setImageUrl1(String imageUrl1) { this.imageUrl1 = imageUrl1; }
    public String getImageUrl2() { return imageUrl2; }
    public void setImageUrl2(String imageUrl2) { this.imageUrl2 = imageUrl2; }
    public String getImageUrl3() { return imageUrl3; }
    public void setImageUrl3(String imageUrl3) { this.imageUrl3 = imageUrl3; }
    public String getImageUrl4() { return imageUrl4; }
    public void setImageUrl4(String imageUrl4) { this.imageUrl4 = imageUrl4; }
}