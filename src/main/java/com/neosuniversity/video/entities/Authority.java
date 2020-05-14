package com.neosuniversity.video.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTHORITIES",schema="VIDEODB")
public class Authority {
	
	
	@EmbeddedId
	private AuthorityId authorityId;

	public AuthorityId getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(AuthorityId authorityId) {
		this.authorityId = authorityId;
	}

	@Override
	public String toString() {
		return "Authority [authorityId=" + authorityId + "]";
	}
	
	
	
	
	
	
	
	/*
	@Id
	@Column(name="USER_NAME",length=50,nullable=false,unique=true)
	private String userName;
	
	
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
		return "Authority [userName=" + userName + ", authority=" + authority + "]";
	}
	
	
	*/

}
