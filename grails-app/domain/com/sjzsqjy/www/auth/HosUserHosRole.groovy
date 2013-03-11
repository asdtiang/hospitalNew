package com.sjzsqjy.www.auth

import org.apache.commons.lang.builder.HashCodeBuilder

class HosUserHosRole implements Serializable {

	HosUser hosUser
	HosRole hosRole

	boolean equals(other) {
		if (!(other instanceof HosUserHosRole)) {
			return false
		}

		other.hosUser?.id == hosUser?.id &&
			other.hosRole?.id == hosRole?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (hosUser) builder.append(hosUser.id)
		if (hosRole) builder.append(hosRole.id)
		builder.toHashCode()
	}

	static HosUserHosRole get(long hosUserId, long hosRoleId) {
		find 'from HosUserHosRole where hosUser.id=:hosUserId and hosRole.id=:hosRoleId',
			[hosUserId: hosUserId, hosRoleId: hosRoleId]
	}

	static HosUserHosRole create(HosUser hosUser, HosRole hosRole, boolean flush = false) {
		new HosUserHosRole(hosUser: hosUser, hosRole: hosRole).save(flush: flush, insert: true)
	}

	static boolean remove(HosUser hosUser, HosRole hosRole, boolean flush = false) {
		HosUserHosRole instance = HosUserHosRole.findByHosUserAndHosRole(hosUser, hosRole)
		if (!instance) {
			return false
		}

		instance.delete(flush: flush)
		true
	}

	static void removeAll(HosUser hosUser) {
		executeUpdate 'DELETE FROM HosUserHosRole WHERE hosUser=:hosUser', [hosUser: hosUser]
	}

	static void removeAll(HosRole hosRole) {
		executeUpdate 'DELETE FROM HosUserHosRole WHERE hosRole=:hosRole', [hosRole: hosRole]
	}

	static mapping = {
		id composite: ['hosRole', 'hosUser']
		version false
	}
}
