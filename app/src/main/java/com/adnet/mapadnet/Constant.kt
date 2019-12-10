package com.adnet.mapadnet

import com.google.android.gms.maps.model.LatLng
import java.util.*

object Constant {
    var LEVEL_ZOOM_DEFAULT = 15f
    var RADIUS_DEFAULT = 0f
    val RADIUS_1_5KM = 1.5f
    var RADIUS_3KM = 3f
    var RADIUS_5KM = 5f
    var RADIUS_10KM = 10f
    var RADIUS_30KM = 30f
    var RADIUS_ALL = 6371f

    val BAY_AREA_LANDMARKS = HashMap<String, LatLng>().apply {
        put("SFO", LatLng(21.03014475423343,105.78406646847725))
    }
}