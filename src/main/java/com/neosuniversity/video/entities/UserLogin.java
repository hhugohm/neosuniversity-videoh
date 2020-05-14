package com.neosuniversity.video.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author hhugohm
 * 
 * USER Entity that store information by login
 *
 */
@Entity
@Table(name="USERS",schema="VIDEODB")
public class UserLogin {
	
	@Id
	@Column(name="USER_NAME",length=50,nullable=false)
	private String userName;

	@OneToOne(cascade=CascadeType.ALL ,fetch=FetchType.EAGER)
	@JoinColumn(name="USER_NAME")
	private UserInformation userInfo;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumns({
        @JoinColumn(
            name = "userName",
            referencedColumnName = "USER_NAME" ,updatable = false, insertable = false),
        @JoinColumn(
            name = "ID_AUTHORITY",
           referencedColumnName = "ID_AUTHORITY",updatable = true, insertable = true)
    })
	//@JoinColumn(name="authorityId")
	private Authority authority;
	
	@Column(name="EMAIL",length=50,nullable=true)
	private String email;
	
	@Column(name="PASSWORD",length=256,nullable=false)
	private String password;
	
	@Column(name="ENABLED",length=1,nullable=false)
	private boolean enabled;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserInformation getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInformation userInfo) {
		this.userInfo = userInfo;
	}
	

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "UserLogin [userName=" + userName + ", userInfo=" + userInfo + ", authority=" + authority + ", email="
				+ email + ", password=" + password + ", enabled=" + enabled + "]";
	}

	

	
	
	
	//cuando es ID String
	//@GeneratedValue(generator="system-uuid")
	//@GenericGenerator(name="system-uuid", strategy = "uuid")
}
