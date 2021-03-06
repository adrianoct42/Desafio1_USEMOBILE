package com.use.desafio1_perguntados

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.use.desafio1_perguntados.databinding.FragmentSecondBinding
import com.use.desafio1_perguntados.databinding.FragmentTenthBinding


class TenthFragment : Fragment() {

    private lateinit var binding: FragmentTenthBinding
    private val args: TenthFragmentArgs by navArgs()
    private lateinit var imageButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTenthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var acertos: Int = args.pontos

        imageButton = activity?.findViewById(R.id.back_btn_toolbar)!!
        imageButton.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.ResponderBtn.setOnClickListener {
            if (binding.RadioBtn1.isChecked) {
                binding.RadioBtn1.setBackgroundColor(Color.parseColor("#38C53D"))
                binding.ResponderBtn.visibility = View.GONE
                binding.NextBtn.visibility = View.VISIBLE
                acertos++
            } else if (binding.RadioBtn2.isChecked) {
                binding.RadioBtn1.setBackgroundColor(Color.parseColor("#38C53D"))
                binding.RadioBtn2.setBackgroundColor(Color.parseColor("#FF5A5A"))
                binding.ResponderBtn.visibility = View.GONE
                binding.NextBtn.visibility = View.VISIBLE
            } else if (binding.RadioBtn3.isChecked) {
                binding.RadioBtn1.setBackgroundColor(Color.parseColor("#38C53D"))
                binding.RadioBtn3.setBackgroundColor(Color.parseColor("#FF5A5A"))
                binding.ResponderBtn.visibility = View.GONE
                binding.NextBtn.visibility = View.VISIBLE
            } else if (binding.RadioBtn4.isChecked) {
                binding.RadioBtn1.setBackgroundColor(Color.parseColor("#38C53D"))
                binding.RadioBtn4.setBackgroundColor(Color.parseColor("#FF5A5A"))
                binding.ResponderBtn.visibility = View.GONE
                binding.NextBtn.visibility = View.VISIBLE
            }
        }

        binding.NextBtn.setOnClickListener {
            if (binding.RadioBtn1.isChecked) {
                findNavController().navigate(
                    TenthFragmentDirections.actionTenthFragmentToEleventhFragment(acertos)
                )
            } else if (binding.RadioBtn2.isChecked) {
                findNavController().navigate(
                    TenthFragmentDirections.actionTenthFragmentToEleventhFragment(acertos)
                )
            } else if (binding.RadioBtn3.isChecked) {
                findNavController().navigate(
                    TenthFragmentDirections.actionTenthFragmentToEleventhFragment(acertos)
                )
            } else if (binding.RadioBtn4.isChecked) {
                findNavController().navigate(
                    TenthFragmentDirections.actionTenthFragmentToEleventhFragment(acertos)
                )
            }
        }
    }
}