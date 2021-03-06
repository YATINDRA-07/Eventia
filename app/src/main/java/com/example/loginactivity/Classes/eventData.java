package com.example.loginactivity.Classes;

public class EventData {
    private String evId;
    private String hostName;
    private String groupName;
    private String eventName;
    private String description;
    private String dateOfEvent;
    private String startTime;
    private double duration;
    private String address;
    private String category;
    private int noOfMembers;
    private String imageUrl;

    public EventData(){}

    public EventData(String evId, String hostName, String groupName, String eventName, String description, String dateOfEvent, String startTime, double duration, String address, String category) {
        this.evId = evId;
        this.hostName = hostName;
        this.groupName = groupName;
        this.eventName = eventName;
        this.description = description;
        this.dateOfEvent = dateOfEvent;
        this.startTime = startTime;
        this.duration = duration;
        this.address = address;
        this.category = category;
        this.noOfMembers = 0;
    }

    public String getEvId() {
        return evId;
    }

    public void setEvId(String evId) {
        this.evId = evId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public String getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
