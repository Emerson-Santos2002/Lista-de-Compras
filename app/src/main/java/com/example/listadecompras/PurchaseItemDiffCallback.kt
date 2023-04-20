package com.example.listadecompras

import androidx.recyclerview.widget.DiffUtil
import com.example.listadecompras.models.PurchaseItem

class PurchaseItemDiffCallback(
    private val oldList: List<PurchaseItem>,
    private val newList: List<PurchaseItem>
): DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition].title == newList[newItemPosition].title
                && oldList[oldItemPosition].price == newList[newItemPosition].price
                && oldList[oldItemPosition].itemImageUrl == newList[newItemPosition].itemImageUrl

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.title == newItem.title &&
                oldItem.price == newItem.price &&
                oldItem.itemImageUrl == newItem.itemImageUrl
    }

}