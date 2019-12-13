package com.showfloor.floor_books.pojo;
/**
 * 地板规格表
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;   //id
  private String name;  //地板名称
  private String brand;  //品牌
  private Double side;  //长
  private Double wide;  //宽
  private String specifications;  //规格
  private Double purchasePrice;  //进价
  private Double price;  //售价
  @Temporal(TemporalType.DATE)//(精确到年月日)
  private Date createTime;  //创建时间
  private Integer numberOfPieces;  //片数

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", brand='" + brand + '\'' +
            ", side=" + side +
            ", wide=" + wide +
            ", specifications='" + specifications + '\'' +
            ", purchasePrice=" + purchasePrice +
            ", price=" + price +
            ", createTime=" + createTime +
            ", numberOfPieces=" + numberOfPieces +
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

  public Double getSide() {
    return side;
  }

  public void setSide(Double side) {
    this.side = side;
  }

  public Double getWide() {
    return wide;
  }

  public void setWide(Double wide) {
    this.wide = wide;
  }

  public String getSpecifications() {
    return specifications;
  }

  public void setSpecifications(String specifications) {
    this.specifications = specifications;
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

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Integer getNumberOfPieces() {
    return numberOfPieces;
  }

  public void setNumberOfPieces(Integer numberOfPieces) {
    this.numberOfPieces = numberOfPieces;
  }
}