package com.example.listadecompras.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PurchaseItem(
    var title: String,
    var price: String,
    var itemImageUrl: Int
) : Parcelable
