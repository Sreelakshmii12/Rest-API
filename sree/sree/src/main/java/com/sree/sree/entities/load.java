package com.sree.sree.entities;

public class load {
private String loadingpoint;
private String unloadingpoint;
private String producttype;
private String trucktype;
private long noOftrucks;
private long weight;
private String comment;
private String date;
private long shipperid;
private long loadid;
public load(String loadingpoint, String unloadingpoint, String producttype, String trucktype, long noOftrucks,
		long weight, String comment, String date, long shipperid, long loadid) {
	super();
	this.loadingpoint = loadingpoint;
	this.unloadingpoint = unloadingpoint;
	this.producttype = producttype;
	this.trucktype = trucktype;
	this.noOftrucks = noOftrucks;
	this.weight = weight;
	this.comment = comment;
	this.date = date;
	this.shipperid = shipperid;
	this.loadid = loadid;
}
public load() {
	super();
	// TODO Auto-generated constructor stub
}
public String getLoadingpoint() {
	return loadingpoint;
}
public void setLoadingpoint(String loadingpoint) {
	this.loadingpoint = loadingpoint;
}
public String getUnloadingpoint() {
	return unloadingpoint;
}
public void setUnloadingpoint(String unloadingpoint) {
	this.unloadingpoint = unloadingpoint;
}
public String getProducttype() {
	return producttype;
}
public void setProducttype(String producttype) {
	this.producttype = producttype;
}
public String getTrucktype() {
	return trucktype;
}
public void setTrucktype(String trucktype) {
	this.trucktype = trucktype;
}
public long getNoOftrucks() {
	return noOftrucks;
}
public void setNoOftrucks(long noOftrucks) {
	this.noOftrucks = noOftrucks;
}
public long getWeight() {
	return weight;
}
public void setWeight(long weight) {
	this.weight = weight;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public long getShipperid() {
	return shipperid;
}
public void setShipperid(long shipperid) {
	this.shipperid = shipperid;
}
public long getLoadid() {
	return loadid;
}
public void setLoadid(long loadid) {
	this.loadid = loadid;
}
@Override
public String toString() {
	return "load [loadingpoint=" + loadingpoint + ", unloadingpoint=" + unloadingpoint + ", producttype=" + producttype
			+ ", trucktype=" + trucktype + ", noOftrucks=" + noOftrucks + ", weight=" + weight + ", comment=" + comment
			+ ", date=" + date + ", shipperid=" + shipperid + ", loadid=" + loadid + ", getLoadingpoint()="
			+ getLoadingpoint() + ", getUnloadingpoint()=" + getUnloadingpoint() + ", getProducttype()="
			+ getProducttype() + ", getTrucktype()=" + getTrucktype() + ", getNoOftrucks()=" + getNoOftrucks()
			+ ", getWeight()=" + getWeight() + ", getComment()=" + getComment() + ", getDate()=" + getDate()
			+ ", getShipperid()=" + getShipperid() + ", getLoadid()=" + getLoadid() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}}
