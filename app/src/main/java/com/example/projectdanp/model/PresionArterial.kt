package com.example.projectdanp.model

import com.google.gson.Gson

data class PresionArterial(
    val timestamp: String,
    val presionSistolica: Int,
    val presionDiastolica: Int,
    val unit: String,
    val notes: String
){
    companion object {
        fun fromJson(json: String): PresionArterial? {
            return try{
                val gson = Gson()
                gson.fromJson(json, PresionArterial::class.java)
            } catch (e: Exception){
                e.printStackTrace()
                null
            }
        }
    }
}