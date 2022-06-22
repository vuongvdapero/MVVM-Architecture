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


class SignUpFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        val signIn = view.findViewById<TextView>(R.id.txtSignIn)
        val joinNowButton = view.findViewById<Button>(R.id.btnJoinNow)
        joinNowButton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.actionSignUpToSignUpForm) }

        signIn.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.actionSignUpToSignIn) }
        return view
    }



}