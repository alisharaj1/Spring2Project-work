
package com.capgemini.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
@Entity
@Table(name="airport")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Airport {
@NotEmpty(message="Airport Code Is Mandatory")
@Id
@Pattern(regexp = "^[\\p{L} .'-]+$", message = "code should not contain special characters.")
@Column(name="airport_code",unique=true)
private String airportCode;
@Column(name="airport_name")
private String airportName;
@Column(name="airport_location")
private String airportLocation;
public String getAirportCode() {
return airportCode;
}
public void setAirportCode(String airportCode) {
this.airportCode = airportCode;
}
public String getAirportName() {
return airportName;
}
public void setAirportName(String airportName) {
this.airportName = airportName;
}
public String getAirportLocation() {
return airportLocation;
}
public void setAirportLocation(String airportLocation) {
this.airportLocation = airportLocation;
}
public Airport(String airportCode, String airportName, String airportLocation) {
super();
this.airportCode = airportCode;
this.airportName = airportName;
this.airportLocation = airportLocation;
}
public Airport() {
super();
}
@Override
public String toString() {
return "Airport [airportCode=" + airportCode + ", airportName=" + airportName + ", airportLocation="
+ airportLocation + "]";
}


}
