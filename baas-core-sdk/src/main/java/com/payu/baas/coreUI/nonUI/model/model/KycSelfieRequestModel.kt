package com.payu.baas.coreUI.nonUI.model.model

import com.google.gson.annotations.SerializedName
import okhttp3.MultipartBody

class KycSelfieRequestModel {
    @SerializedName("live_photo")
    var live_photo: MultipartBody? = null
}