package com.payu.baas.coreUI.nonUI.model.model

import com.google.gson.annotations.SerializedName

class CreditorDetails {
    @SerializedName("accountNumber")
    var accountNumber: String? = null
    @SerializedName("ifsc")
    var ifsc: String? = null
    @SerializedName("name")
    var name: String? = null
}