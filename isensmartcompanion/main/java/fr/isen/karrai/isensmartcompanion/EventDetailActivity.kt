package fr.isen.karrai.isensmartcompanion

import android.os.Bundle
import androidx.activity.ComponentActivity

class EventDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val eventId = intent.getStringExtra("event_id") ?: return
        val eventTitle = intent.getStringExtra("event_title") ?: "Événement"
        val eventDescription = intent.getStringExtra("event_description") ?: "Aucune description"
        val eventLocation = intent.getStringExtra("event_location") ?: "Lieu inconnu"
        val eventDate = intent.getStringExtra("event_date") ?: "Date non précisée"


    }
}



