package com.example.chatboxui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setChatListRecycler()
    }

    private fun setChatListRecycler(){
        chatList.setHasFixedSize(true)
        chatList.setLayoutManager(LinearLayoutManager(this, RecyclerView.VERTICAL, false))
        chatList.setAdapter(this?.let { ChatListAdapter(it) })
    }
}
