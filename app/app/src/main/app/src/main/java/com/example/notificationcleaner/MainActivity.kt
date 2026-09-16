package com.example.notificationcleaner

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.graphics.Color

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 64, 48, 48)
        }

        val title = TextView(this).apply {
            text = "Notification Cleaner"
            textSize = 26f
            setTextColor(Color.BLACK)
        }

        val info = TextView(this).apply {
            text = """
                
Automatically dismiss notifications from other apps while keeping WhatsApp notifications.

WhatsApp and WhatsApp Business are kept.
            """.trimIndent()

            textSize = 17f
            setTextColor(Color.DKGRAY)
        }

        val button = Button(this).apply {
            text = "Enable Notification Access"

            setOnClickListener {
                startActivity(
                    Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)
                )
            }
        }

        layout.addView(title)
        layout.addView(info)
        layout.addView(button)

        setContentView(layout)
    }
}
