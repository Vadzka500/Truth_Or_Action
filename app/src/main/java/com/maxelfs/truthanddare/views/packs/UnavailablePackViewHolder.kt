package com.maxelfs.truthanddare.views.packs

import android.view.LayoutInflater
import android.view.ViewGroup
import com.maxelfs.truthanddare.databinding.PackUnavailableItemBinding
import com.maxelfs.truthanddare.views.ViewHolderBase

internal class UnavailablePackViewHolder private constructor(
    private val _binding: PackUnavailableItemBinding
): ViewHolderBase<PackViewModel>(_binding.root) {
    override fun bind(item: PackViewModel, itemsCount: Int) {
        _binding.pack = item
        _binding.executePendingBindings()
    }


    companion object {
        fun from(parent: ViewGroup) : UnavailablePackViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = PackUnavailableItemBinding.inflate(inflater, parent, false)

            return UnavailablePackViewHolder(binding)
        }
    }
}