package com.joao01sb.eventos.data.remotedate.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.joao01sb.eventos.domain.entities.ClienteEntity

@Database(entities = [ClienteEntity::class], version = 1)
abstract class EventosDatabase : RoomDatabase() {

}