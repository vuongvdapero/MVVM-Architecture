package com.example.loginnavigationmvvm.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.loginnavigationmvvm.R
import com.example.loginnavigationmvvm.ShowListActivity
import com.example.loginnavigationmvvm.model.User
import com.example.loginnavigationmvvm.viewModel.LoginViewModel


class SignInFragment : Fragment() {

    lateinit var viewModelUser: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)
        val backButton = view.findViewById<TextView>(R.id.txtBackSignIn)
        val signInButton = view.findViewById<Button>(R.id.btnSignIn)
        val email = view.findViewById<EditText>(R.id.edtEmailSignIn)
        val password = view.findViewById<EditText>(R.id.edtPasswordSignIn)
        val intent = Intent(activity,ShowListActivity::class.java)

        viewModelUser = ViewModelProvider(this)[LoginViewModel::class.java]
        viewModelUser.currentUser.observe(viewLifecycleOwner, Observer {
            val bundle = Bundle()
            bundle.putString("email", it.email)
            bundle.putString("password", it.password)
            intent.putExtras(bundle)
        })
        signInButton.setOnClickListener{
            val user = User(email.text.toString(), password.text.toString())
            viewModelUser.currentUser.value = user
            activity?.startActivity(intent)
        }

        backButton.setOnClickListener{
            Navigation.findNavController(view)
                .navigate(R.id.actionSignInToSignUpForm) }
        return view
    }


}