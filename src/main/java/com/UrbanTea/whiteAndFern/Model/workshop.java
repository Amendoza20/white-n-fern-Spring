package com.UrbanTea.whiteAndFern.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class workshop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Date date;
    private Time time;
    private String info;
    private int numOfSeats;

    public workshop(long id, String title, Date date, Time time, String info, int numOfSeats) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
        this.info = info;
        this.numOfSeats = numOfSeats;
    }

    public workshop(String title, Date date, Time time, String info, int numOfSeats) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.info = info;
        this.numOfSeats = numOfSeats;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
