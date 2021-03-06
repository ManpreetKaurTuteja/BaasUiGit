package com.payu.baas.coreUI.nonUI.model.responseModels

import com.google.gson.annotations.SerializedName
import com.payu.baas.coreUI.nonUI.model.model.NotificationDetails

class NotificationResponse : ApiResponse() {

    @SerializedName("userMessage")
    var userMessage: String? = null

    @SerializedName("systemMessage")
    var systemMessage: String? = null

    @SerializedName("code")
    var code: String? = null

    @SerializedName("notificationResponseList")
    var notificationList: ArrayList<NotificationDetails> = arrayListOf()
}