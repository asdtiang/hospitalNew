package com.sjzsqjy.www.auth

class HosUser {

	transient springSecurityService

	String username
	String password
	String email
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<HosRole> getAuthorities() {
		HosUserHosRole.findAllByHosUser(this).collect { it.hosRole } as Set
	}
}
