package com.post.bean;

import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.util.Map;

import com.post.formbean.Profile;
import com.sun.org.apache.commons.beanutils.BeanUtils;

public class ProfileTo {
	
	
private String secretqid;
    
    private String photo;
    
    private String id;
    private String password;
    private String newpassword;
    private String firstname;
    private String lastname;
    private String logintype;
    private String fax;
    private String email;
    
    private String home;
    private String office;
    private String contact;
    
    
    private int status;
    private String date;
    private int roleid;
    private int flogin;
    private String timezone;
    
    private String pin;
    private String phone;
    private String city;
    private String hno;
    private String street;
    private String state;
    private String country;
    
    private String opin;
    private String ophone;
    private String ocity;
    private String ohno;
    private String ostreet;
    private String ostate;
    private String ocountry;
    
    private String cpin;
    private String cphone;
    private String ccity;
    private String chno;
    private String cstreet;
    private String cstate;
    private String ccountry;
    
    private String bdate;
    private Date birthDate1;
    private String locale;
    private String secretqans;
    private String ownsecretq;
    private String passwordmoddate;
    private String profilemoddate;
    
    private String officePhoneType;
    private String homePhoneType;
    private String personalPhoneType;
    
    
    public ProfileTo(){
    	
    	
    	
    	
    }
    
    
   public ProfileTo(Profile p){
	   

	   try{
			Map  map= BeanUtils.describe(p);
			BeanUtils.populate(this, map);
		}
		catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
   }
    
    
    
    
	public String getSecretqid() {
		return secretqid;
	}
	public void setSecretqid(String secretqid) {
		this.secretqid = secretqid;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLogintype() {
		return logintype;
	}
	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getFlogin() {
		return flogin;
	}
	public void setFlogin(int flogin) {
		this.flogin = flogin;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getOpin() {
		return opin;
	}
	public void setOpin(String opin) {
		this.opin = opin;
	}
	public String getOphone() {
		return ophone;
	}
	public void setOphone(String ophone) {
		this.ophone = ophone;
	}
	public String getOcity() {
		return ocity;
	}
	public void setOcity(String ocity) {
		this.ocity = ocity;
	}
	public String getOhno() {
		return ohno;
	}
	public void setOhno(String ohno) {
		this.ohno = ohno;
	}
	public String getOstreet() {
		return ostreet;
	}
	public void setOstreet(String ostreet) {
		this.ostreet = ostreet;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	public String getOcountry() {
		return ocountry;
	}
	public void setOcountry(String ocountry) {
		this.ocountry = ocountry;
	}
	public String getCpin() {
		return cpin;
	}
	public void setCpin(String cpin) {
		this.cpin = cpin;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getChno() {
		return chno;
	}
	public void setChno(String chno) {
		this.chno = chno;
	}
	public String getCstreet() {
		return cstreet;
	}
	public void setCstreet(String cstreet) {
		this.cstreet = cstreet;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	public String getCcountry() {
		return ccountry;
	}
	public void setCcountry(String ccountry) {
		this.ccountry = ccountry;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public Date getBirthDate1() {
		return birthDate1;
	}
	public void setBirthDate1(Date birthDate1) {
		this.birthDate1 = birthDate1;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getSecretqans() {
		return secretqans;
	}
	public void setSecretqans(String secretqans) {
		this.secretqans = secretqans;
	}
	public String getOwnsecretq() {
		return ownsecretq;
	}
	public void setOwnsecretq(String ownsecretq) {
		this.ownsecretq = ownsecretq;
	}
	public String getPasswordmoddate() {
		return passwordmoddate;
	}
	public void setPasswordmoddate(String passwordmoddate) {
		this.passwordmoddate = passwordmoddate;
	}
	public String getProfilemoddate() {
		return profilemoddate;
	}
	public void setProfilemoddate(String profilemoddate) {
		this.profilemoddate = profilemoddate;
	}
	public String getOfficePhoneType() {
		return officePhoneType;
	}
	public void setOfficePhoneType(String officePhoneType) {
		this.officePhoneType = officePhoneType;
	}
	public String getHomePhoneType() {
		return homePhoneType;
	}
	public void setHomePhoneType(String homePhoneType) {
		this.homePhoneType = homePhoneType;
	}
	public String getPersonalPhoneType() {
		return personalPhoneType;
	}
	public void setPersonalPhoneType(String personalPhoneType) {
		this.personalPhoneType = personalPhoneType;
	}

}
