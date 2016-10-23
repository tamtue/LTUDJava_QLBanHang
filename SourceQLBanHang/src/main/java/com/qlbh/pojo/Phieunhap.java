package com.qlbh.pojo;
// Generated 23/10/2016 4:15:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Phieunhap generated by hbm2java
 */
@Entity
@Table(name="phieunhap"
    ,catalog="qlbh"
)
public class Phieunhap  implements java.io.Serializable {


     private Integer id;
     private Khohang khohang;
     private Nhacungcap nhacungcap;
     private Nhanvien nhanvien;
     private String ma;
     private String dienthoai;
     private String diachi;
     private Date ngaynhap;
     private String ghichu;
     private Double tongtien;
     private Boolean activity;
     private Set<Chitietphieunhap> chitietphieunhaps = new HashSet<Chitietphieunhap>(0);

    public Phieunhap() {
    }

    public Phieunhap(Khohang khohang, Nhacungcap nhacungcap, Nhanvien nhanvien, String ma, String dienthoai, String diachi, Date ngaynhap, String ghichu, Double tongtien, Boolean activity, Set<Chitietphieunhap> chitietphieunhaps) {
       this.khohang = khohang;
       this.nhacungcap = nhacungcap;
       this.nhanvien = nhanvien;
       this.ma = ma;
       this.dienthoai = dienthoai;
       this.diachi = diachi;
       this.ngaynhap = ngaynhap;
       this.ghichu = ghichu;
       this.tongtien = tongtien;
       this.activity = activity;
       this.chitietphieunhaps = chitietphieunhaps;
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
    @JoinColumn(name="khoid")
    public Khohang getKhohang() {
        return this.khohang;
    }
    
    public void setKhohang(Khohang khohang) {
        this.khohang = khohang;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nhaccid")
    public Nhacungcap getNhacungcap() {
        return this.nhacungcap;
    }
    
    public void setNhacungcap(Nhacungcap nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nhanviennhapid")
    public Nhanvien getNhanvien() {
        return this.nhanvien;
    }
    
    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }

    
    @Column(name="ma", length=20)
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    
    @Column(name="dienthoai")
    public String getDienthoai() {
        return this.dienthoai;
    }
    
    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    
    @Column(name="diachi", length=65535)
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ngaynhap", length=10)
    public Date getNgaynhap() {
        return this.ngaynhap;
    }
    
    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    
    @Column(name="ghichu", length=65535)
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
    @Column(name="tongtien", precision=22, scale=0)
    public Double getTongtien() {
        return this.tongtien;
    }
    
    public void setTongtien(Double tongtien) {
        this.tongtien = tongtien;
    }

    
    @Column(name="activity")
    public Boolean getActivity() {
        return this.activity;
    }
    
    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="phieunhap")
    public Set<Chitietphieunhap> getChitietphieunhaps() {
        return this.chitietphieunhaps;
    }
    
    public void setChitietphieunhaps(Set<Chitietphieunhap> chitietphieunhaps) {
        this.chitietphieunhaps = chitietphieunhaps;
    }




}


