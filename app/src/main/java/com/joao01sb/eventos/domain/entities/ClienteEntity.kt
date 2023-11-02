package com.joao01sb.eventos.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable
import java.util.UUID

@Entity(tableName = "cliente")
data class ClienteEntity(
    @PrimaryKey
    val id: UUID,
    val primeiroNome: String,
    val ultimoNome: String,
    val email: String,
    val telefoneOuCelular: String,
    val statusDoCadastro: Boolean,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClienteEntity

        if (id != other.id) return false
        if (primeiroNome != other.primeiroNome) return false
        if (ultimoNome != other.ultimoNome) return false
        if (email != other.email) return false
        if (telefoneOuCelular != other.telefoneOuCelular) return false
        if (statusDoCadastro != other.statusDoCadastro) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + primeiroNome.hashCode()
        result = 31 * result + ultimoNome.hashCode()
        result = 31 * result + email.hashCode()
        result = 31 * result + telefoneOuCelular.hashCode()
        result = 31 * result + statusDoCadastro.hashCode()
        return result
    }

}
