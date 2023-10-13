package com.example.codinginflownavcom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.codinginflownavcom.databinding.FragmentHomeBinding
import com.example.codinginflownavcom.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonConfirm()
    }

    private fun buttonConfirm() {
        binding.btmConfirm.setOnClickListener {

            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username,password)
            findNavController().navigate(action)
        }
    }

}