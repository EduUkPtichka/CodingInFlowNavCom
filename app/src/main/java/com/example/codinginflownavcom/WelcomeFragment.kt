package com.example.codinginflownavcom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.codinginflownavcom.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private val args: WelcomeFragmentArgs by navArgs()

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataGetLoginFragmentToWelcomeFragment()
    }

    private fun dataGetLoginFragmentToWelcomeFragment() {
        binding.tvWelcomeUsername.text = args.username
        binding.tvWelcomePassword.text = args.password
    }

}
