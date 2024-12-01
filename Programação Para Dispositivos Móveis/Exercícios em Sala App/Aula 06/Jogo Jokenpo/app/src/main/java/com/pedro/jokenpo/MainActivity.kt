package com.pedro.jokenpo

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var ringueIAPapel: ImageView
    private lateinit var ringueIAPedra: ImageView
    private lateinit var ringueIATesoura: ImageView
    private lateinit var ringueJogadorPapel: ImageView
    private lateinit var ringueJogadorPedra: ImageView
    private lateinit var ringueJogadorTesoura: ImageView
    private lateinit var circuloAzul: ImageView
    private lateinit var circuloVermelho: ImageView
    private lateinit var vitoriaJogador01: TextView
    private lateinit var vitoriaJogador02: TextView
    private lateinit var vitoriaJogador03: TextView
    private lateinit var vitoriaIA01: TextView
    private lateinit var vitoriaIA02: TextView
    private lateinit var vitoriaIA03: TextView
    private lateinit var nomeJogador: TextView
    private lateinit var nomeIA: TextView
    private lateinit var versus: TextView
    private lateinit var vencedor: ImageView
    private lateinit var perdedor: ImageView
    private var jogadorVenceu = 0
    private var iaVenceu = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ringueIAPapel = findViewById(R.id.ringueIAPapel)
        ringueIAPedra = findViewById(R.id.ringueIAPedra)
        ringueIATesoura = findViewById(R.id.ringueIATesoura)
        ringueJogadorPapel = findViewById(R.id.ringueJogadorPapel)
        ringueJogadorPedra = findViewById(R.id.ringueJogadorPedra)
        ringueJogadorTesoura = findViewById(R.id.ringueJogadorTesoura)
        vitoriaJogador01 = findViewById(R.id.vitoriaJogador01)
        vitoriaJogador02 = findViewById(R.id.vitoriaJogador02)
        vitoriaJogador03 = findViewById(R.id.vitoriaJogador03)
        nomeJogador = findViewById(R.id.nomeJogador)
        vitoriaIA01 = findViewById(R.id.vitoriaIA01)
        vitoriaIA02 = findViewById(R.id.vitoriaIA02)
        vitoriaIA03 = findViewById(R.id.vitoriaIA03)
        nomeIA = findViewById(R.id.nomeIA)
        versus = findViewById(R.id.versus)
        circuloAzul = findViewById(R.id.circuloAzul)
        circuloVermelho = findViewById(R.id.circuloVermelho)
        vencedor = findViewById(R.id.vencedor)
        perdedor = findViewById(R.id.perdedor)

        findViewById<View>(R.id.escolhaJogadorPapel).setOnClickListener { jogar(0) }
        findViewById<View>(R.id.escolhaJogadorPedra).setOnClickListener { jogar(1) }
        findViewById<View>(R.id.escolhaJogadorTesoura).setOnClickListener { jogar(2) }
    }

    fun jogar(escolhaJogador: Int) {
        resetarVisibilidade()

        val escolhaIA = Random().nextInt(3)
        mostrarEscolhaIA(escolhaIA)
        mostrarEscolhaJogador(escolhaJogador)

        if (escolhaJogador == escolhaIA) {
            // Empate
        } else if ((escolhaJogador == 0 && escolhaIA == 1) ||
            (escolhaJogador == 1 && escolhaIA == 2) ||
            (escolhaJogador == 2 && escolhaIA == 0)) {
            jogadorVenceu++
            contabilizarVitoriaJogador()
        } else {
            iaVenceu++
            contabilizarVitoriaIA()
        }

        verificarVencedor()
    }

    fun mostrarEscolhaIA(escolha: Int) {
        when (escolha) {
            0 -> ringueIAPapel.visibility = View.VISIBLE
            1 -> ringueIAPedra.visibility = View.VISIBLE
            2 -> ringueIATesoura.visibility = View.VISIBLE
        }
    }

    fun mostrarEscolhaJogador(escolha: Int) {
        when (escolha) {
            0 -> ringueJogadorPapel.visibility = View.VISIBLE
            1 -> ringueJogadorPedra.visibility = View.VISIBLE
            2 -> ringueJogadorTesoura.visibility = View.VISIBLE
        }
    }

    fun verificarVencedor() {
        if (jogadorVenceu == 3) {
            esconderPlacarERingue()
            vencedor.visibility = View.VISIBLE
            Handler().postDelayed({ resetarJogo() }, 3000)
        } else if (iaVenceu == 3) {
            esconderPlacarERingue()
            perdedor.visibility = View.VISIBLE
            Handler().postDelayed({ resetarJogo() }, 3000)
        }
    }

    private fun esconderPlacarERingue() {
        vitoriaJogador01.visibility = View.INVISIBLE
        vitoriaJogador02.visibility = View.INVISIBLE
        vitoriaJogador03.visibility = View.INVISIBLE
        nomeJogador.visibility = View.INVISIBLE
        vitoriaIA01.visibility = View.INVISIBLE
        vitoriaIA02.visibility = View.INVISIBLE
        vitoriaIA03.visibility = View.INVISIBLE
        nomeIA.visibility = View.INVISIBLE
        ringueIAPapel.visibility = View.INVISIBLE
        ringueIAPedra.visibility = View.INVISIBLE
        ringueIATesoura.visibility = View.INVISIBLE
        ringueJogadorPapel.visibility = View.INVISIBLE
        ringueJogadorPedra.visibility = View.INVISIBLE
        ringueJogadorTesoura.visibility = View.INVISIBLE
        circuloAzul.visibility = View.INVISIBLE
        circuloVermelho.visibility = View.INVISIBLE
        versus.visibility = View.INVISIBLE
    }

    private fun resetarJogo() {
        jogadorVenceu = 0
        iaVenceu = 0
        vitoriaJogador01.visibility = View.INVISIBLE
        vitoriaJogador02.visibility = View.INVISIBLE
        vitoriaJogador03.visibility = View.INVISIBLE
        nomeJogador.visibility = View.VISIBLE
        vitoriaIA01.visibility = View.INVISIBLE
        vitoriaIA02.visibility = View.INVISIBLE
        vitoriaIA03.visibility = View.INVISIBLE
        nomeIA.visibility = View.VISIBLE
        circuloAzul.visibility = View.VISIBLE
        circuloVermelho.visibility = View.VISIBLE
        versus.visibility = View.VISIBLE
        vencedor.visibility = View.INVISIBLE
        perdedor.visibility = View.INVISIBLE
    }

    fun resetarVisibilidade() {
        ringueJogadorPapel.visibility = View.INVISIBLE
        ringueJogadorPedra.visibility = View.INVISIBLE
        ringueJogadorTesoura.visibility = View.INVISIBLE
        ringueIAPapel.visibility = View.INVISIBLE
        ringueIAPedra.visibility = View.INVISIBLE
        ringueIATesoura.visibility = View.INVISIBLE
        vencedor.visibility = View.INVISIBLE
        perdedor.visibility = View.INVISIBLE
    }

    fun contabilizarVitoriaJogador() {
        when (jogadorVenceu) {
            1 -> vitoriaJogador01.visibility = View.VISIBLE
            2 -> vitoriaJogador02.visibility = View.VISIBLE
            3 -> vitoriaJogador03.visibility = View.VISIBLE
        }
    }

    fun contabilizarVitoriaIA() {
        when (iaVenceu) {
            1 -> vitoriaIA01.visibility = View.VISIBLE
            2 -> vitoriaIA02.visibility = View.VISIBLE
            3 -> vitoriaIA03.visibility = View.VISIBLE
        }
    }
}
