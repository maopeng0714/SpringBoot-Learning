package com.didispace;

import lombok.Data;
import org.springframework.ldap.odm.annotations.*;

import javax.naming.Name;

@Entry(base = "ou=people,dc=didispace,dc=com", objectClasses = "inetOrgPerson")
@Data
public class Person {

    @Id
    private Name id;
    public Name getId() {
		return id;
	}
	public void setId(Name id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getSuerName() {
		return suerName;
	}
	public void setSuerName(String suerName) {
		this.suerName = suerName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@DnAttribute(value = "uid", index = 3)
    private String uid;
    @Attribute(name = "cn")
    private String commonName;
    @Attribute(name = "sn")
    private String suerName;
    private String userPassword;

}
