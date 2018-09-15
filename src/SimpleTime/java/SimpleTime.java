/*
Created by Alexander Swanson on 9/14/18.
Copyright (c) 2018, Alexander Joseph Swanson Villares
alexjosephswanson@gmail.com
*/

package SimpleTime.java;

import sun.security.util.Length;

/**
 * A simple class to record a specific instance of time.
 */
public class SimpleTime {

    /* Class Attributes */
    /**
     *
     */
    private int hour;

    /**
     *
     */
    private int minute;

    /**
     *
     */
    private Period time_period;

    /**
     *
     */
    public enum Period {
        AM,
        PM
    }


    /* Enums */
    /**
     *
     */
    public SimpleTime() {

        //
        hour = 8;
        minute = 0;
        time_period = Period.AM;

    }


    /* Constructors */
    /**
     *
     * @param hour
     * @param minute
     * @param time_period
     */
    public SimpleTime(int hour, int minute, Period time_period) {

        //
        this.hour = hour;
        this.minute = minute;
        this.time_period = time_period;

    }


    /* Methods */
    @Override
    public String toString() {

        return String.valueOf(hour) + ":" + String.valueOf(minute) + " " + time_period.toString();

    }


    /* Getters */
    public int get_hour() {

        return hour;

    }

    public int get_minute() {

        return minute;

    }

    public Period get_time_period() {

        return time_period;

    }


    /* Setters */
    public void set_hour(int hour) {

        this.hour = hour;

    }

    public void set_minute(int minute) {

        this.minute = minute;

    }

    public void set_time_period(Period time_period) {

        this.time_period = time_period;

    }
}
