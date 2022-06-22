package com.example.loginnavigationmvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginnavigationmvvm.model.User

class LoginViewModel : ViewModel() {
    val currentUser: MutableLiveData<User> by lazy {
        MutableLiveData<User>()
    }
}