package com.nagraj.utils.network

import kotlinx.coroutines.flow.Flow

class ConnectivityObserver {
    interface ConnectivityObserver {
        val isConnected: Flow<Boolean>
    }
}