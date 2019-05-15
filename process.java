/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Comparator;

/**
 *
 * @author Own
 */
public class process {
    private String id;
    private int at;
    private int bt;
    private int priorty;
    
    public process(String id, int at, int bt, int priorty) {
        this.id = id;
        this.at = at;
        this.bt = bt;
        this.priorty = priorty;
    }

    public int getBt() {
        return bt;
    }

    public void setBt(int bt) {
        this.bt = bt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }
    public static Comparator<process> atno = (process s1, process s2) -> {
        int at1 = s1.getAt();
        int at2 = s2.getAt();
        return at1 - at2;
    };

    public int getPriorty() {
        return priorty;
    }

    public void setPriorty(int priorty) {
        this.priorty = priorty;
    }
    
    
}
