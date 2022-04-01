package com.irfan.recycleviewsample.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (
    val username: String? = null,
    val phoneNumber: Int? = null
): Parcelable