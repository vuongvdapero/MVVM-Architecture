package com.example.loginnavigationmvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.loginnavigationmvvm.R


class SignUpFormFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up_form, container, false)
        val backSignUpForm = view.findViewById<TextView>(R.id.txtBackSignUpForm)
        val signUpButton = view.findViewById<Button>(R.id.btnSignUp)
        backSignUpForm.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.actionSignUpFormToSignUp) }

        signUpButton.setOnClickListener{
            Navigation.findNavController(view)
                .navigate(R.id.actionSignUpFormToSignIn) }
        return view
    }


}