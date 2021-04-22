package com.vishalgaur.shoppingapp.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.vishalgaur.shoppingapp.network.UserType
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "users")
data class UserData(
	@PrimaryKey
	var userId: String = "",
	var name: String = "",
	var mobile: String = "",
	var email: String = "",
	var password: String = "",
	var userType: String = UserType.CUSTOMER.name
) : Parcelable {
    fun toHashMap(): HashMap<String, String> {
        return hashMapOf(
			"userId" to userId,
			"name" to name,
			"email" to email,
			"mobile" to mobile,
			"password" to password,
			"userType" to userType
		)
    }
}
