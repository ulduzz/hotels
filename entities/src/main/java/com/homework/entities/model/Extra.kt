package com.example.example

import com.google.gson.annotations.SerializedName


data class Extra (

  @SerializedName("image_count"    ) var imageCount     : Int?    = null,
  @SerializedName("thumbnailImage" ) var thumbnailImage : String? = null

)