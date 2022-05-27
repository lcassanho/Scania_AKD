package br.com.odd.scania_akd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.odd.scania_akd.databinding.FragmentRespostasBinding

class RespostasFragment : Fragment() {

    private lateinit var binding: FragmentRespostasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_respostas, container, false)

        binding.btBonus.setOnClickListener {
            view?.findNavController()?.navigate(R.id.respostasFragment)
        }

        binding.btProsseguir.setOnClickListener {
            view?.findNavController()?.navigate(R.id.respostasFragment)
        }

        return binding.root
    }
}