package com.travel.model;

import java.util.List;

public class AdventurePackage extends TouristPackage {
    public AdventurePackage(String id, String name, String destination, String description, double baseCost, int duration, String type) {
        super(id, name, destination, description, baseCost, duration, type);
    }

    @Override
    public double calculateTotalCost() {
        double total = getBaseCost();
        
        // Add hotel cost
        switch (getHotelClass()) {
            case "4-star": total += 100 * getDuration(); break;
            case "5-star": total += 200 * getDuration(); break;
            default: total += 50 * getDuration(); // 3-star
        }
        
        // Add transport cost
        switch (getTransport()) {
            case "train": total += 50 * getDuration(); break;
            case "flight": total += 200 * getDuration(); break;
            default: total += 30 * getDuration(); // bus
        }
        
        // Add meal plan cost
        switch (getMealPlan()) {
            case "half-board": total += 50 * getDuration(); break;
            case "full-board": total += 80 * getDuration(); break;
            default: total += 20 * getDuration(); // breakfast
        }
        
        // Add room type cost
        switch (getRoomType()) {
            case "deluxe": total += 70 * getDuration(); break;
            case "suite": total += 150 * getDuration(); break;
        }
        
        // Add activities cost
        total += getActivities().size() * 30;
        
        // Add add-ons cost
        for (String addOn : getAddOns()) {
            switch (addOn) {
                case "airport-transfer": total += 50; break;
                case "travel-insurance": total += 30; break;
                case "guided-tour": total += 100; break;
            }
        }
        
        return total;
    }
}