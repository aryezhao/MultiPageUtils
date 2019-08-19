package com.usts.entity;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by lenovo on 2019/8/15.
 */
public class QueryVo {

    private Integer id;
    private String name;
    private String pwd;
    private String image;
    private MultipartFile file;

    //当前页码数
    private Integer page = 1;

    //数据库从那一条数据开始查
    private Integer start;

    //每页显示数据条数
    private Integer rows = 5;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", image='" + image + '\'' +
                ", file=" + file +
                ", page=" + page +
                ", start=" + start +
                ", rows=" + rows +
                '}';
    }
}
