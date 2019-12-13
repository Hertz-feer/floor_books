package com.showfloor.floor_books.pojo;
/**
 * 附件表
 */

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "accessories")
public class Accessories {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;  //id
  private String name;  //附件名称
  private String brand;  //供应商
  private Date createTime;  //创建时间
  private Double purchasePrice;  //进价
  private Double price;  //售价

  @Override
  public String toString() {
    return "Accessories{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", brand='" + brand + '\'' +
            ", createTime=" + createTime +
            ", purchasePrice=" + purchasePrice +
            ", price=" + price +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTIme(Date createTime) {
    this.createTime = createTime;
  }

  public Double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
