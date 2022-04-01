package com.irfan.recycleviewsample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.irfan.recycleviewsample.R
import com.irfan.recycleviewsample.UserAdapter
import com.irfan.recycleviewsample.data.User

class FragmentHome : Fragment() {

    private lateinit var recyelerview: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyelerview = view.findViewById(R.id.rv_user)

        val userList = listOf(
            User("Muhammad Irfan", +628905632),
            User("Muhammad Hamzah", +653343890),
            User("Yuyu", +65334367)
        )
        val userAdapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyelerview.layoutManager = layoutManager
        recyelerview.adapter = userAdapter
    }

}