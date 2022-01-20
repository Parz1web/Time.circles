package com.sek;

public class Time {
    private int second, minute, hour;

    public Time(int second, int minute, int hour){

        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public Time(){
        setSecond(0);
        setMinute(0);
        setHour(0);
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setSecond(int second) {
        if(checkSecNMin(second)) {
            this.second = second;
        }
    }

    public void setMinute(int minute) {
        if(checkSecNMin(minute)) {
            this.minute = minute;
        }
    }

    public void setHour(int hour) {
        if(checkHour(hour)){
            this.hour = hour;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "second=" + second +
                ", minute=" + minute +
                ", hour=" + hour +
                '}';
    }

    public void setTime(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    private boolean checkSecNMin(int time){
        if(time<60 && time >= 0){
            return true;
        }
        else{

            System.out.println("Время не подходит по условию");
            return false;
        }
    }
    private boolean checkHour(int time){
        if(time<24 && time>=0){
            return true;
        }
        else{
            System.out.println("Время не подходит по условию");
            return false;
        }
    }
}
