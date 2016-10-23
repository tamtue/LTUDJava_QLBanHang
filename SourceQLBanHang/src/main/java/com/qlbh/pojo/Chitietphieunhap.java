package com.qlbh.pojo;
// Generated 23/10/2016 4:15:08 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Chitietphieunhap generated by hbm2java
 */
@Entity
@Table(name="chitietphieunhap"
    ,catalog="qlbh"
)
public class Chitietphieunhap  implements java.io.Serializable {


     private Integer id;
     private Hanghoa hanghoa;
     private Phieunhap phieunhap;
     private Integer soluong;
     private Double dongia;
     private Double thanhtien;
     private String ghichu;
     private Boolean activity;
     private String ma;

    public Chitietphieunhap() {
    }

    public Chitietphieunhap(Hanghoa hanghoa, Phieunhap phieunhap, Integer soluong, Double dongia, Double thanhtien, String ghichu, Boolean activity, String ma) {
       this.hanghoa = hanghoa;
       this.phieunhap = phieunhap;
       this.soluong = soluong;
       this.dongia = dongia;
       this.thanhtien = thanhtien;
       this.ghichu = ghichu;
       this.activity = activity;
       this.ma = ma;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="hanghoaid")
    public Hanghoa getHanghoa() {
        return this.hanghoa;
    }
    
    public void setHanghoa(Hanghoa hanghoa) {
        this.hanghoa = hanghoa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="phieunhapid")
    public Phieunhap getPhieunhap() {
        return this.phieunhap;
    }
    
    public void setPhieunhap(Phieunhap phieunhap) {
        this.phieunhap = phieunhap;
    }

    
    @Column(name="soluong")
    public Integer getSoluong() {
        return this.soluong;
    }
    
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    
    @Column(name="dongia", precision=22, scale=0)
    public Double getDongia() {
        return this.dongia;
    }
    
    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

    
    @Column(name="thanhtien", precision=22, scale=0)
    public Double getThanhtien() {
        return this.thanhtien;
    }
    
    public void setThanhtien(Double thanhtien) {
        this.thanhtien = thanhtien;
    }

    
    @Column(name="ghichu")
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
    @Column(name="activity")
    public Boolean getActivity() {
        return this.activity;
    }
    
    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    
    @Column(name="ma", length=20)
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }




}


