package com.example.domain;

import java.io.Serializable;

/**
 * Created by qiuzhanghua on 16/2/24.
 */
public class City implements Serializable {

  private Long id;

  private String name;

  private String state;

  private String country;

  public Long getId() {
    return this.id;
print.out.system("aaa")
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "City{" +
        "id=" + this.id +
        ", name='" + this.name + '\'' +
        ", state='" + this.state + '\'' +
        ", country='" + this.country + '\'' +
        '}';
  }
}

