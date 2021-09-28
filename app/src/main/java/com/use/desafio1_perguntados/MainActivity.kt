package com.use.desafio1_perguntados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.use.desafio1_perguntados.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}


//TODO (1 -> Fazer Layout e Código do RESULT SCREEN
//TODO (2 -> Digitar manualmente as perguntas e respostas dentro dos Campos)
//TODO (3 -> Botão de voltar não funciona, pesquisar o contexto de VOLTAR EM FRAGMENT)
//TODO (4 -> Resolver treta do GIT)

