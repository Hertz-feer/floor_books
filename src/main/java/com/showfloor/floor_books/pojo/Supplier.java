package com.showfloor.floor_books.pojo;
/**
 * 客户表
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="supplier")
public class Supplier {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;  //id
  private String name;  //客户名称
  private String address;  //地址
  private Date createTime;  //创建时间
  private String phoneNumber;  //电话1
  private String phoneNumber2;  //电话2

  @Override
  public String toString() {
    return "Supplier{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", createTime=" + createTime +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", phoneNumber2='" + phoneNumber2 + '\'' +
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber2() {
    return phoneNumber2;
  }

  public void setPhoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
  }
}
