/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps22788_buixuanviet_assigntment;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Employee implements Serializable{

  public String ma;
  public String name;
  public double tuoi;
  public String email;
  public double luong;

    public Employee(String ma, String name, double tuoi, String email, double luong) {
        this.ma = ma;
        this.name = name;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public Employee() {
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public double getTuoi() {
        return tuoi;
    }

    public String getEmail() {
        return email;
    }

    public double getLuong() {
        return luong;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(double tuoi) {
        this.tuoi = tuoi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
  

public static void main(String[] args) {
        // TODO code application logic here
    }
    
}