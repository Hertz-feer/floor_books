package com.showfloor.floor_books.pojo;
/**
 * 品牌表
 */

import javax.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;     //id
  private String name;  //品牌名称

  @Override
  public String toString() {
    return "Brand{" +
            "id=" + id +
            ", name='" + name + '\'' +
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
}
