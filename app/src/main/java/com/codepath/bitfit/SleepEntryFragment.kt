package com.codepath.bitfit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SleepEntryFragment : Fragment(), OnListFragmentInteractionListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SleepEntryRecyclerAdapter
    private var entries: MutableList<SleepEntry> = mutableListOf()

    override fun onItemClick(item: SleepEntry) {
        Toast.makeText(context, "Hours slept: ${item.hours}", Toast.LENGTH_SHORT)
            .show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_sleep_entry_list, container,
            false
        )
        recyclerView = view.findViewById<View>(R.id.sleep_entry_list) as RecyclerView

        val context = view.context
        val linearLayoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = linearLayoutManager
        adapter = SleepEntryRecyclerAdapter(entries, this@SleepEntryFragment)
        recyclerView.adapter = adapter

        updateAdapter(recyclerView)

        return view
    }
}