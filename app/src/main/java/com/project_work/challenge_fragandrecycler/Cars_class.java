package com.project_work.challenge_fragandrecycler;

public class Cars_class {
    String car_name;
    String car_owner;
    String owner_number;
    String logo;

    public Cars_class(String car_name, String car_owner, String owner_number, String logo) {
        this.car_name = car_name;
        this.car_owner = car_owner;
        this.owner_number = owner_number;
        this.logo = logo;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_owner() {
        return car_owner;
    }

    public void setCar_owner(String car_owner) {
        this.car_owner = car_owner;
    }

    public String getOwner_number() {
        return owner_number;
    }

    public void setOwner_number(String owner_number) {
        this.owner_number = owner_number;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
