package com.nagraj.utils

import android.content.Context
import android.widget.Toast

class Toast {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}