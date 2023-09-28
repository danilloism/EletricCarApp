package br.com.dnn.eletriccarapp.presentation.adapter

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.dnn.eletriccarapp.presentation.CarFragment
import br.com.dnn.eletriccarapp.presentation.FavoritosFragment

class TabsAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int) = when (position) {
        0 -> CarFragment()
        1 -> FavoritosFragment()
        else -> CarFragment()
    }
}