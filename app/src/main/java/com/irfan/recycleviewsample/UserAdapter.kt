package com.irfan.recycleviewsample

import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.irfan.recycleviewsample.data.User
import com.irfan.recycleviewsample.fragment.FragmentHomeDirections

data class UserAdapter(private val user: List<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val usernameTextView: TextView = view.findViewById(R.id.username_text_view)
        val phoneNumberTextView: TextView = view.findViewById(R.id.phone_number_text_view)
        val rvItem: ConstraintLayout = view.findViewById(R.id.item_user)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.usernameTextView.text = user[position].username
        holder.phoneNumberTextView.text = user[position].phoneNumber.toString()
        holder.rvItem.setOnClickListener {
            val action = FragmentHomeDirections.actionFragmentHomeToFragmentDetail2(user[position])
            it.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return user.size
    }
}
