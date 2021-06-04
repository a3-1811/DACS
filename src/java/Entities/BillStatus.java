/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author Der Mods
 */
public class BillStatus {
    private int id;
    private Date ngauMua;
    private String tenKH;
    private int tongTien;
    private boolean trangThai;
    private String sdt;

    public BillStatus() {
    }

    public BillStatus(int id, Date ngauMua, String tenKH, int tongTien, boolean trangThai, String sdt) {
        this.id = id;
        this.ngauMua = ngauMua;
        this.tenKH = tenKH;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgauMua() {
        return ngauMua;
    }

    public void setNgauMua(Date ngauMua) {
        this.ngauMua = ngauMua;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "BillStatus{" + "id=" + id + ", ngauMua=" + ngauMua + ", tenKH=" + tenKH + ", tongTien=" + tongTien + ", trangThai=" + trangThai + ", sdt=" + sdt + '}';
    }

    
}
