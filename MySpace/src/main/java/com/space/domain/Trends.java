package com.space.domain;


public class Trends {

  private Integer id;

  private Integer uid;

  private String time;

  @Override
  public String toString() {
    return "Trends{" +
            "id=" + id +
            ", uid=" + uid +
            ", time='" + time + '\'' +
            ", content='" + content + '\'' +
            ", likes=" + likes +
            '}';
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  private String content;
  private Integer likes;




  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Integer getLikes() {
    return likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

}
