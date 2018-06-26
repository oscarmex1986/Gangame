package com.example.ozkarin.gangame.deals


import com.example.ozkarin.gangame.R
import BaseFragment
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.commons.BaseListFragment
import com.example.commons.DataBindingRecyclerAdapter
import com.example.ozkarin.gangame.Deal
import com.example.ozkarin.gangame.BR


class DealsFragment : BaseListFragment() {

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<Deal>(
                BR.deal,
                R.layout.item_deal
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (listAdapter as DataBindingRecyclerAdapter<Deal>)
                .items.addAll(getDummyDeals())
        listAdapter.notifyDataSetChanged()
    }

    fun getDummyDeals(): Collection<Deal> {
        return arrayListOf(Deal("Counter Strike",
                0.99F,
        9.99F,
                80,
                80,
                "http://cdn.akamai.steamstatic.com/steam/apps/10/capsule_184x69.jpg"
        ))
    }

}
