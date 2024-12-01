package com.example.consolesantigos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var checkBoxAtari: CheckBox
    private lateinit var checkBoxNES: CheckBox
    private lateinit var checkBoxMasterSystem: CheckBox
    private lateinit var checkBoxMegaDrive: CheckBox
    private lateinit var checkBoxNintendoGameBoy: CheckBox
    private lateinit var checkBoxSNES: CheckBox
    private lateinit var checkBoxNintendo64: CheckBox

    private lateinit var buttonPublicadora: Button
    private lateinit var buttonHistoria: Button
    private lateinit var buttonLancamento: Button

    private lateinit var switchIdioma: Switch

    private lateinit var textViewSaida: TextView

    private lateinit var consolesPTBR: Array<ConsolesAntigos>
    private var consolesENG: Array<ConsolesAntigos>? = null

    private var ingles = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        consolesPTBR = arrayOf(
            ConsolesAntigos("Atari 2600", 1977, "Atari", "O Atari 2600 popularizou os jogos eletrônicos nos anos 80."),
            ConsolesAntigos("NES", 1983, "Nintendo", "O Nintendo Entertainment System revolucionou a indústria dos games."),
            ConsolesAntigos("Master System", 1985, "Sega", "O Master System foi o principal concorrente do NES."),
            ConsolesAntigos("Mega Drive", 1988, "Sega", "Conhecido como Genesis nos EUA, foi um sucesso na década de 90."),
            ConsolesAntigos("Nintendo Game Boy", 1989, "Nintendo", "O Game Boy popularizou os jogos portáteis."),
            ConsolesAntigos("SNES", 1990, "Nintendo", "O Super Nintendo Entertainment System foi um dos consoles mais amados."),
            ConsolesAntigos("Nintendo 64", 1996, "Nintendo", "O Nintendo 64 foi o último grande console a usar cartuchos."),
            ConsolesAntigos("PSX", 1994, "Sony", "O PlayStation original trouxe os CDs para os jogos de console."),
            ConsolesAntigos("Sega Dreamcast", 1999, "Sega", "O Dreamcast foi o primeiro console a incluir um modem para jogos online."),
            ConsolesAntigos("NEO Geo", 1990, "SNK", "O Neo Geo era conhecido por seus jogos de arcade e preço elevado."),
            ConsolesAntigos("PS2", 2000, "Sony", "O PlayStation 2 é o console mais vendido de todos os tempos."),
            ConsolesAntigos("XBOX", 2001, "Microsoft", "O Xbox foi o primeiro console da Microsoft, introduzindo o Xbox Live."),
            ConsolesAntigos("PS3", 2006, "Sony", "O PlayStation 3 trouxe o Blu-ray para os jogos de console."),
            ConsolesAntigos("Nintendo Wii", 2006, "Nintendo", "O Wii popularizou os controles por movimento e foi um enorme sucesso.")
        )

        consolesENG = arrayOf(
            ConsolesAntigos("Atari 2600", 1977, "Atari", "The Atari 2600 popularized video games in the 80s."),
            ConsolesAntigos("NES", 1983, "Nintendo", "The Nintendo Entertainment System revolutionized the gaming industry."),
            ConsolesAntigos("Master System", 1985, "Sega", "The Master System was the main competitor to the NES."),
            ConsolesAntigos("Mega Drive", 1988, "Sega", "Known as Genesis in the US, it was a hit in the 90s."),
            ConsolesAntigos("Nintendo Game Boy", 1989, "Nintendo", "The Game Boy made handheld gaming popular."),
            ConsolesAntigos("SNES", 1990, "Nintendo", "The Super Nintendo Entertainment System was one of the most beloved consoles."),
            ConsolesAntigos("Nintendo 64", 1996, "Nintendo", "The Nintendo 64 was the last major console to use cartridges."),
            ConsolesAntigos("PSX", 1994, "Sony", "The original PlayStation brought CDs to console gaming."),
            ConsolesAntigos("Sega Dreamcast", 1999, "Sega", "The Dreamcast was the first console to include a modem for online play."),
            ConsolesAntigos("NEO Geo", 1990, "SNK", "The Neo Geo was known for its arcade games and high price."),
            ConsolesAntigos("PS2", 2000, "Sony", "The PlayStation 2 is the best-selling console of all time."),
            ConsolesAntigos("XBOX", 2001, "Microsoft", "The Xbox was Microsoft's first console, introducing Xbox Live."),
            ConsolesAntigos("PS3", 2006, "Sony", "The PlayStation 3 brought Blu-ray to console gaming."),
            ConsolesAntigos("Nintendo Wii", 2006, "Nintendo", "The Wii popularized motion controls and was a huge success.")
        )

        checkBoxAtari = findViewById(R.id.checkBoxAtari)
        checkBoxNES = findViewById(R.id.checkBoxNES)
        checkBoxMasterSystem = findViewById(R.id.checkBoxMasterSystem)
        checkBoxMegaDrive = findViewById(R.id.checkBoxMegaDrive)
        checkBoxNintendoGameBoy = findViewById(R.id.checkBoxNintendoGameBoy)
        checkBoxSNES = findViewById(R.id.checkBoxSNES)
        checkBoxNintendo64 = findViewById(R.id.checkBoxNintendo64)

        buttonPublicadora = findViewById(R.id.buttonPublicadora)
        buttonHistoria = findViewById(R.id.buttonHistoria)
        buttonLancamento = findViewById(R.id.buttonLancamento)

        switchIdioma = findViewById(R.id.switchIdioma)

        textViewSaida = findViewById(R.id.textViewSaida)

        switchIdioma.setOnCheckedChangeListener { _, isChecked ->
            ingles = isChecked
        }

        buttonLancamento.setOnClickListener {
            val consolesSelecionados = buscarConsoleSelecionado()
            val lancamentos = consolesSelecionados.joinToString("\n") { it.getAnoLancamento().toString() }
            textViewSaida.text = if (lancamentos.isNotEmpty()) lancamentos else "Nenhum console selecionado"
        }

        buttonPublicadora.setOnClickListener {
            val consolesSelecionados = buscarConsoleSelecionado()
            val publicadoras = consolesSelecionados.joinToString("\n") { it.getPublicadora() }
            textViewSaida.text = if (publicadoras.isNotEmpty()) publicadoras else "Nenhum console selecionado"
        }

        buttonHistoria.setOnClickListener {
            val consolesSelecionados = buscarConsoleSelecionado()
            val historias = consolesSelecionados.joinToString("\n") { it.getHistoria() }
            textViewSaida.text = if (historias.isNotEmpty()) historias else "Nenhum console selecionado"
        }
    }

    private fun buscarConsoleSelecionado(): List<ConsolesAntigos> {
        val consoleSelecionado = if (ingles) consolesENG ?: return emptyList() else consolesPTBR
        val consolesSelecionados = mutableListOf<ConsolesAntigos>()

        if (checkBoxAtari.isChecked) consolesSelecionados.add(buscarConsolePorNome("Atari 2600", consoleSelecionado))
        if (checkBoxNES.isChecked) consolesSelecionados.add(buscarConsolePorNome("NES", consoleSelecionado))
        if (checkBoxMasterSystem.isChecked) consolesSelecionados.add(buscarConsolePorNome("Master System", consoleSelecionado))
        if (checkBoxMegaDrive.isChecked) consolesSelecionados.add(buscarConsolePorNome("Mega Drive", consoleSelecionado))
        if (checkBoxNintendoGameBoy.isChecked) consolesSelecionados.add(buscarConsolePorNome("Nintendo Game Boy", consoleSelecionado))
        if (checkBoxSNES.isChecked) consolesSelecionados.add(buscarConsolePorNome("SNES", consoleSelecionado))
        if (checkBoxNintendo64.isChecked) consolesSelecionados.add(buscarConsolePorNome("Nintendo 64", consoleSelecionado))

        return consolesSelecionados
    }

    private fun buscarConsolePorNome(nome: String, lista: Array<ConsolesAntigos>): ConsolesAntigos {
        return lista.find { it.getNome() == nome } ?: ConsolesAntigos(nome, 0, "Desconhecida", "Nenhuma informação disponível")
    }
}