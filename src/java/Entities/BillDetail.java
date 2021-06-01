/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Der Mods
 */
public class BillDetail {
    private int idBill;
    private Date ngayMua;
    private String tenSP;
    private int soLuong;
    private int tongTien;
    private boolean trangThai;

    public BillDetail() {
    }

    public BillDetail(int idBill, Date ngayMua, String tenSP, int soLuong, int tongTien, boolean trangThai) {
        this.idBill = idBill;
        this.ngayMua = ngayMua;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "BillDetail{" + "idBill=" + idBill + ", ngayMua=" + ngayMua + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", tongTien=" + tongTien + ", trangThai=" + trangThai + '}';
    }
    
    
}
