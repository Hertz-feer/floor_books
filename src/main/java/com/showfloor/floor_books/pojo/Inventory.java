package com.showfloor.floor_books.pojo;


import javax.persistence.*;
import java.util.Date;
/***
 * 地板库存表
 */
@Entity
@Table(name = "inventory")
public class Inventory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;  //id
  private String brand; //品牌
  private String name;  //地板名称
  private Integer piece;  //件
  private Integer slice;  //片
  @Temporal(TemporalType.DATE)//(精确到年月日)
  private Date lastUpdate;  //时间

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPiece() {
    return piece;
  }

  public void setPiece(Integer piece) {
    this.piece = piece;
  }

  public Integer getSlice() {
    return slice;
  }

  public void setSlice(Integer slice) {
    this.slice = slice;
  }

  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
