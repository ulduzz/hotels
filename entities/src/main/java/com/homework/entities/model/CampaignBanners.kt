package com.example.example

import com.google.gson.annotations.SerializedName


data class CampaignBanners (

  @SerializedName("domestic"      ) var domestic      : ArrayList<Domestic> = arrayListOf(),
  @SerializedName("international" ) var international : ArrayList<String>   = arrayListOf()

)