package com.lab.pig;

import java.util.stream.Stream;

public class Pigs {
    private String market_name;
    private String addr;
    private String ValidDate;
    private String last_edited_date;

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getValidDate() {
        return ValidDate;
    }

    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    public String getLast_edited_date() {
        return last_edited_date;
    }

    public void setLast_edited_date(String last_edited_date) {
        this.last_edited_date = last_edited_date;
    }

    @Override
    public String toString() {
        return "Rice{" + "market_name=" + market_name + ", addr=" + addr + ", ValidDate=" + ValidDate + ", last_edited_date=" + last_edited_date + '}';
    }

    Stream<Pigs> getMarket_name(String 豬肉) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
