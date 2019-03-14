package com.huayu.springmvc.bean;

import java.util.List;

/**
 * @author: Nie
 * @date: 2018/12/12 17:56
 * @description:
 */
public class Classes {
    private Integer cid;
    private String cname;
    private List<Classes> list;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Classes> getList() {
        return list;
    }

    public void setList(List<Classes> list) {
        this.list = list;
    }
}
