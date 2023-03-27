package com.codepath.bitfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SleepEntryRecyclerAdapter(
    private val entries: List<SleepEntry>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<SleepEntryRecyclerAdapter.SleepEntryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SleepEntryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_sleep_entry, parent, false)
        return SleepEntryViewHolder(view)
    }

    inner class SleepEntryViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {

        override fun toString(): String {
            return "hello, world"
        }
    }

    override fun onBindViewHolder(holder: SleepEntryViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return entries.size
    }
}