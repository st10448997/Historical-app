package com.example.myhistoryapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtInfor = findViewById<TextView>(R.id.txtInfor)
        val txtResults = findViewById<TextView>(R.id.txtResults)
        val editText = findViewById<EditText>(R.id.editText)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnClear = findViewById<Button>(R.id.btnClear)


        btnCalculate.setOnClickListener {
            val history = editText.text.toString().toInt()

            /* if ((history == null))
           {
             txtResults.text = "Invalid Input > Please enter a valid number"

            }*/
            var age = " "
            if (history == 20) {
                age =
                    "Andrew Sibusiso Zondo was an Umkhonto we Sizwe operative.He detonated a bomb at Sanlam centre in Amanzimtoti on 23 December 1985 killing five people"
            } else if (history == 22) {
                age =
                    "Solomon Kalushi Mahlangu was a South African freedom fighter,struggle activist and operative of the African National congress militant wing , Umkhontho we Sizwe"
            } else if (history == 30) {
                age =
                    "Steven Biko was born in Tylden, Eastern Cape South Africa in 1946.As a medical student,he founded a black student organisation in 1969 and created a national 'black consciousness' movement . the movement's aim was to combat racism and the South African apartheid government "
            } else if (history == 41) {
                age =
                    "David Bambatha Maphgumzana Sibeko was known as the 'malcolm x of South Africa' and begin his political career as a journalist for the black South African magazine Drum"
            } else if (history == 44) {
                age =
                    "Vuyisile Mini was a trade unionist, Umkhonto we Sizwe activist ; singer and one of the first African National congress member to be executed bt apartheid government"
            } else if (history == 51) {
                age =
                    "Chris Hani,born Martin Thembisile Hani SSA,SBS,CLS,DMG,MMS,was the leader of the South African communist party and chief of staff of Umkhonto we Sizwe the wing of the African National Congress"
            } else if (history == 53) {
                age =
                    "Robert Sobukwe founded the Pan Africanist congress in 1959.He was imprisoned from 1960 - 1969. "
            } else if (history == 75) {
                age =
                    "Olive Reginald Kaizana Tambo was a South African anti-apartheid politician and activist who served as President of the African National congress from 1967 to 1991"
            } else if (history == 90) {
                age =
                    "Desmond Tutu was a South African Anglican bishop and theologian,known for his work as an anti-apartheid and human right activist"
            } else if (history == 91) {
                age =
                    "Peter Sexford Magubane was a South African photographer and anti-apartheid activist. He was also the personal photograher  of Nelson Mandela"
            }
            txtResults.text = "$age"
        }
        btnClear.setOnClickListener {
            editText.text.clear()
            txtResults.text = " "
        }

        }

    }









