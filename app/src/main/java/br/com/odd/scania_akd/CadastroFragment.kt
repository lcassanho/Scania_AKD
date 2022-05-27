package br.com.odd.scania_akd

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.odd.scania_akd.databinding.FragmentCadastroBinding


class CadastroFragment : Fragment() {

    private lateinit var binding: FragmentCadastroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cadastro, container, false)

        emailFocusListener()
        passwordFocusListener()

        binding.btCadastrar.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_cadastroFragment_to_loginFragment)
        }
        return binding.root
    }

    private fun emailFocusListener() {
        binding.etEmailCad.setOnFocusChangeListener { _, focused ->
            if (!focused) {
                binding.emailContainer.helperText = validEmail()
            }
        }
    }
    private fun validEmail(): String? {
        val emailText = binding.etEmailCad.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
            return "Endereço de e-mail inválido!"
        }
        return null
    }
    private fun passwordFocusListener() {
        binding.etSenhaCad.setOnFocusChangeListener { _, focused ->
            if(!focused)
            {
                binding.senhaContainer.helperText = validPassword()
            }
        }
    }
    private fun validPassword(): String? {
        val passwordText = binding.etSenhaCad.text.toString()
        if (passwordText.length < 8) {
            return "Mínimo 8 Caracteres"
        }
        if (!passwordText.matches(".*[A-Z].*".toRegex())) {
            return "Obrigatório 1 caractere upper-case"
        }
        if (!passwordText.matches(".*[a-z].*".toRegex())) {
            return "Obrigatório 1 caractere lower-case "
        }
        if (!passwordText.matches(".*[@#\$%^&+=].*".toRegex())) {
            return "Obrigatório 1 caractere Especial (@#\$%^&+=)"
        }

        return null
    }
}