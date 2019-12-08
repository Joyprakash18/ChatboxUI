package com.example.chatboxui

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.child_chat_list.view.*

class ChatListAdapter(activity: FragmentActivity) : RecyclerView.Adapter<ChatListAdapter.ChatListViewHolder>()  {

    private var mActivity: FragmentActivity = activity

    init {
        mActivity = activity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_chat_list, parent, false)
        return ChatListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        holder.totalLayout.setOnClickListener{
            val intent = Intent(mActivity,ChatDetailsActivity::class.java)
            mActivity.startActivity(intent)
        }
    }

    inner class ChatListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val totalLayout = itemView.childTotalLayout
    }
}