package com.nagraj.utils

import android.content.Context
import android.location.Location
import android.util.Log
import android.widget.Toast

class Utils {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }

        fun log(message: String) {
            Log.v("NAGRAJ", message)
        }

        fun distance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
            val results = FloatArray(1)
            Location.distanceBetween(lat1, lon1, lat2, lon2, results)
            return String.format("%.2f", results[0] / 1000).toDouble()
        }
    }
}