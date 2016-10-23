package com.qlbh.pojo;
// Generated 23/10/2016 4:15:08 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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

/**
 * Khachhang generated by hbm2java
 */
@Entity
@Table(name="khachhang"
    ,catalog="qlbh"
)
public class Khachhang  implements java.io.Serializable {


     private Integer id;
     private Khuvuc khuvuc;
     private Loaikhachhang loaikhachhang;
     private String ma;
     private String makh;
     private String ten;
     private String diachi;
     private String masothue;
     private String dienthoai;
     private String email;
     private String taikhoan;
     private String nganhang;
     private BigDecimal gioihanno;
     private BigDecimal nohientai;
     private String yahoo;
     private String skype;
     private String nguoilienhe;
     private Boolean activity;
     private Set<Phieuxuat> phieuxuats = new HashSet<Phieuxuat>(0);

    public Khachhang() {
    }

    public Khachhang(Khuvuc khuvuc, Loaikhachhang loaikhachhang, String ma, String makh, String ten, String diachi, String masothue, String dienthoai, String email, String taikhoan, String nganhang, BigDecimal gioihanno, BigDecimal nohientai, String yahoo, String skype, String nguoilienhe, Boolean activity, Set<Phieuxuat> phieuxuats) {
       this.khuvuc = khuvuc;
       this.loaikhachhang = loaikhachhang;
       this.ma = ma;
       this.makh = makh;
       this.ten = ten;
       this.diachi = diachi;
       this.masothue = masothue;
       this.dienthoai = dienthoai;
       this.email = email;
       this.taikhoan = taikhoan;
       this.nganhang = nganhang;
       this.gioihanno = gioihanno;
       this.nohientai = nohientai;
       this.yahoo = yahoo;
       this.skype = skype;
       this.nguoilienhe = nguoilienhe;
       this.activity = activity;
       this.phieuxuats = phieuxuats;
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
    @JoinColumn(name="khuvucid")
    public Khuvuc getKhuvuc() {
        return this.khuvuc;
    }
    
    public void setKhuvuc(Khuvuc khuvuc) {
        this.khuvuc = khuvuc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loaikhid")
    public Loaikhachhang getLoaikhachhang() {
        return this.loaikhachhang;
    }
    
    public void setLoaikhachhang(Loaikhachhang loaikhachhang) {
        this.loaikhachhang = loaikhachhang;
    }

    
    @Column(name="ma", length=20)
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    
    @Column(name="makh")
    public String getMakh() {
        return this.makh;
    }
    
    public void setMakh(String makh) {
        this.makh = makh;
    }

    
    @Column(name="ten")
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    
    @Column(name="diachi")
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
    @Column(name="masothue")
    public String getMasothue() {
        return this.masothue;
    }
    
    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    
    @Column(name="dienthoai")
    public String getDienthoai() {
        return this.dienthoai;
    }
    
    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="taikhoan")
    public String getTaikhoan() {
        return this.taikhoan;
    }
    
    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    
    @Column(name="nganhang")
    public String getNganhang() {
        return this.nganhang;
    }
    
    public void setNganhang(String nganhang) {
        this.nganhang = nganhang;
    }

    
    @Column(name="gioihanno", precision=30, scale=10)
    public BigDecimal getGioihanno() {
        return this.gioihanno;
    }
    
    public void setGioihanno(BigDecimal gioihanno) {
        this.gioihanno = gioihanno;
    }

    
    @Column(name="nohientai", precision=30, scale=10)
    public BigDecimal getNohientai() {
        return this.nohientai;
    }
    
    public void setNohientai(BigDecimal nohientai) {
        this.nohientai = nohientai;
    }

    
    @Column(name="yahoo")
    public String getYahoo() {
        return this.yahoo;
    }
    
    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    
    @Column(name="skype")
    public String getSkype() {
        return this.skype;
    }
    
    public void setSkype(String skype) {
        this.skype = skype;
    }

    
    @Column(name="nguoilienhe")
    public String getNguoilienhe() {
        return this.nguoilienhe;
    }
    
    public void setNguoilienhe(String nguoilienhe) {
        this.nguoilienhe = nguoilienhe;
    }

    
    @Column(name="activity")
    public Boolean getActivity() {
        return this.activity;
    }
    
    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="khachhang")
    public Set<Phieuxuat> getPhieuxuats() {
        return this.phieuxuats;
    }
    
    public void setPhieuxuats(Set<Phieuxuat> phieuxuats) {
        this.phieuxuats = phieuxuats;
    }




}


