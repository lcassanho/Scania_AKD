package br.com.odd.scania_akd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.odd.scania_akd.databinding.FragmentPerguntasBinding

class PerguntasFragment : Fragment() {

    private lateinit var binding: FragmentPerguntasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_perguntas, container, false)

        binding.btSubmit.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_perguntasFragment_to_respostasFragment)
        }

        return binding.root
    }
}