package com.qlbh.pojo;
// Generated 26/10/2016 3:07:02 PM by Hibernate Tools 4.3.1


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
 * Chuyenkho generated by hbm2java
 */
@Entity
@Table(name="chuyenkho"
    ,catalog="qlbh"
)
public class Chuyenkho  implements java.io.Serializable {


     private Integer id;
     private Khohang khohangByKhochuyenid;
     private Khohang khohangByKhonhanid;
     private Nhanvien nhanvienByNguoichuyenid;
     private Nhanvien nhanvienByNguoinhanid;
     private String ghichu;
     private String ma;
     private String phieuchuyentay;
     private Date ngay;
     private Boolean activity;
     private Set<Chitietchuyenkho> chitietchuyenkhos = new HashSet<Chitietchuyenkho>(0);

    public Chuyenkho() {
    }

    public Chuyenkho(Khohang khohangByKhochuyenid, Khohang khohangByKhonhanid, Nhanvien nhanvienByNguoichuyenid, Nhanvien nhanvienByNguoinhanid, String ghichu, String ma, String phieuchuyentay, Date ngay, Boolean activity, Set<Chitietchuyenkho> chitietchuyenkhos) {
       this.khohangByKhochuyenid = khohangByKhochuyenid;
       this.khohangByKhonhanid = khohangByKhonhanid;
       this.nhanvienByNguoichuyenid = nhanvienByNguoichuyenid;
       this.nhanvienByNguoinhanid = nhanvienByNguoinhanid;
       this.ghichu = ghichu;
       this.ma = ma;
       this.phieuchuyentay = phieuchuyentay;
       this.ngay = ngay;
       this.activity = activity;
       this.chitietchuyenkhos = chitietchuyenkhos;
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
    @JoinColumn(name="khochuyenid")
    public Khohang getKhohangByKhochuyenid() {
        return this.khohangByKhochuyenid;
    }
    
    public void setKhohangByKhochuyenid(Khohang khohangByKhochuyenid) {
        this.khohangByKhochuyenid = khohangByKhochuyenid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="khonhanid")
    public Khohang getKhohangByKhonhanid() {
        return this.khohangByKhonhanid;
    }
    
    public void setKhohangByKhonhanid(Khohang khohangByKhonhanid) {
        this.khohangByKhonhanid = khohangByKhonhanid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nguoichuyenid")
    public Nhanvien getNhanvienByNguoichuyenid() {
        return this.nhanvienByNguoichuyenid;
    }
    
    public void setNhanvienByNguoichuyenid(Nhanvien nhanvienByNguoichuyenid) {
        this.nhanvienByNguoichuyenid = nhanvienByNguoichuyenid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nguoinhanid")
    public Nhanvien getNhanvienByNguoinhanid() {
        return this.nhanvienByNguoinhanid;
    }
    
    public void setNhanvienByNguoinhanid(Nhanvien nhanvienByNguoinhanid) {
        this.nhanvienByNguoinhanid = nhanvienByNguoinhanid;
    }

    
    @Column(name="ghichu", length=65535)
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
    @Column(name="ma")
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    
    @Column(name="phieuchuyentay")
    public String getPhieuchuyentay() {
        return this.phieuchuyentay;
    }
    
    public void setPhieuchuyentay(String phieuchuyentay) {
        this.phieuchuyentay = phieuchuyentay;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ngay", length=10)
    public Date getNgay() {
        return this.ngay;
    }
    
    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    
    @Column(name="activity")
    public Boolean getActivity() {
        return this.activity;
    }
    
    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="chuyenkho")
    public Set<Chitietchuyenkho> getChitietchuyenkhos() {
        return this.chitietchuyenkhos;
    }
    
    public void setChitietchuyenkhos(Set<Chitietchuyenkho> chitietchuyenkhos) {
        this.chitietchuyenkhos = chitietchuyenkhos;
    }




}


