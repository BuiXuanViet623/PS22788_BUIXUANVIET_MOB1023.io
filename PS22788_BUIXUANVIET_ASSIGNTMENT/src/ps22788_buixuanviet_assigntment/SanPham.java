/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps22788_buixuanviet_assigntment;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SanPham {

    String ma;
    String ten;
    double gia;

    public SanPham() {
    }

    public SanPham(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Vui lòng nhập mã sản phẩm: ");
        ma = sc.nextLine();
        System.out.print("Vui lòng nhập tên sản phẩm: ");
        ten = sc.nextLine();
        System.out.print("Vui lòng nhập giá sản phẩm: ");
        gia = sc.nextDouble();
        sc.nextLine();
        
    }
    public void output(){
        System.out.print("Mã Sản Phẩm: "+ma);
        System.out.print("Tên Sản Phẩm: " +ten);
        System.out.println("Giá Sản Phẩm: "+gia);
    }

}
