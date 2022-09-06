package com.project.ud.dto;

import java.io.Serializable;
import java.util.Objects;

public class AddresingVlsmDTO implements Serializable{
     private String subnet;
     private Integer host;
     private String  address;
     private String mask;
     private String firstHost;
     private String lastHost;
     private String broadCast;

    public AddresingVlsmDTO() {
    }

    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public Integer getHost() {
        return host;
    }

    public void setHost(Integer host) {
        this.host = host;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getFirstHost() {
        return firstHost;
    }

    public void setFirstHost(String firstHost) {
        this.firstHost = firstHost;
    }

    public String getLastHost() {
        return lastHost;
    }

    public void setLastHost(String lastHost) {
        this.lastHost = lastHost;
    }

    public String getBroadCast() {
        return broadCast;
    }

    public void setBroadCast(String broadCast) {
        this.broadCast = broadCast;
    }

    @Override
    public String toString() {
        return "AddresingStaticDTO{" +
                "subnet='" + subnet + '\'' +
                ", host=" + host +
                ", address='" + address + '\'' +
                ", mask='" + mask + '\'' +
                ", firstHost='" + firstHost + '\'' +
                ", lastHost='" + lastHost + '\'' +
                ", broadCast='" + broadCast + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddresingVlsmDTO that = (AddresingVlsmDTO) o;
        return Objects.equals(subnet, that.subnet) && Objects.equals(host, that.host) && Objects.equals(address, that.address) && Objects.equals(mask, that.mask) && Objects.equals(firstHost, that.firstHost) && Objects.equals(lastHost, that.lastHost) && Objects.equals(broadCast, that.broadCast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnet, host, address, mask, firstHost, lastHost, broadCast);
    }
}
