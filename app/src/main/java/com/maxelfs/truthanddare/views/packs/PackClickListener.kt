package com.maxelfs.truthanddare.views.packs

class PackClickListener(private val clickListener: (pack: PackViewModel) -> Unit) {
    fun onClick(pack: PackViewModel) = clickListener(pack)
}