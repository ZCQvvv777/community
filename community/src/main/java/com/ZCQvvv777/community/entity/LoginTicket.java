package com.ZCQvvv777.community.entity;

import java.util.Date;

/**
 * @Description 数据访问
 * @Date 2022/8/23 21:03
 */

public class LoginTicket {

    private int id;
    private int userId;
    private String ticket;
    private Date expired;
    private int status;

    @Override
    public String toString() {
        return "LoginTicket{" +
                "id=" + id +
                ", userId=" + userId +
                ", tickets='" + ticket + '\'' +
                ", expired=" + expired +
                ", status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTickets(String ticket) {
        this.ticket = ticket;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }
}
