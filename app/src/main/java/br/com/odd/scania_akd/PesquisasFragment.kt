package br.com.odd.scania_akd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.odd.scania_akd.databinding.FragmentPesquisasBinding

class PesquisasFragment : Fragment() {

    private lateinit var binding: FragmentPesquisasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pesquisas, container, false)

        binding.btInPesquisa1.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_pesquisasFragment_to_perguntasFragment)
        }

        binding.btInPesquisa2.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_pesquisasFragment_to_perguntasFragment)
        }

        return binding.root
    }
}