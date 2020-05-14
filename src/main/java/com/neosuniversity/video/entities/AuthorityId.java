package com.neosuniversity.video.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AuthorityId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="ID_AUTHORITY")
	private String authority;


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getAuthority() {
		return authority;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	@Override
	public String toString() {
		return "AuthorityId [userName=" + userName + ", authority=" + authority + "]";
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthorityId)) return false;
        AuthorityId that = (AuthorityId) o;
        return Objects.equals(getUserName(), that.getUserName()) &&
                Objects.equals(getAuthority(), that.getAuthority());
    }
	
	@Override
    public int hashCode() {
        return Objects.hash(getUserName(), getAuthority());
    }

}
