package com.example.ozkarin.gangame.rated

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.commons.BaseListFragment
import com.example.commons.DataBindingRecyclerAdapter
import com.example.ozkarin.gangame.BR
import com.example.ozkarin.gangame.R
import com.example.ozkarin.gangame.TopGame

class TopRatedFragment : BaseListFragment(){
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<TopGame>(
                BR.topGame,
                R.layout.item_top_game)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (listAdapter as DataBindingRecyclerAdapter<TopGame>)
                .items.addAll(getDummyTopGame())
        listAdapter.notifyDataSetChanged()
    }

    fun getDummyTopGame(): Collection<TopGame> {
        return arrayListOf(TopGame("Counter Strike",
                633024013,
                80,
                "Valve",
                9.99F,
                1,
                "http://cdn.akamai.steamstatic.com/steam/apps/10/capsule_184x69.jpg"
        ))
    }
}
