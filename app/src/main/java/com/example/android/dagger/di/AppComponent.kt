package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity

// Definition of a Dagger component
interface AppComponent {

    // Class that can be injected by this Component
    fun inject(activity: RegistrationActivity)
}