package com.kunlun.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class OrderLog implements Serializable {

    private static final long serialVersionUID = 4740022534119620980L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单号
     */
    @JSONField(name = "order_no")
    private String orderNo;

    /**
     * 动作
     */
    private String action;

    /**
     * ip地址
     */
    @JSONField(name = "ip_address")
    private String ipAddress;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 订单id
     */
    @JSONField(name = "order_id")
    private Long orderId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderLog{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", action='" + action + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", createDate=" + createDate +
                ", orderId=" + orderId +
                '}';
    }
}
