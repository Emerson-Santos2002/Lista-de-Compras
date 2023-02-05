package com.example.listadecompras

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadecompras.models.PurchaseItem
import kotlinx.android.synthetic.main.res_item_list.view.*

class PurchaseItemAdapter(
    private val onItemClicked: (PurchaseItem) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<PurchaseItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PurchaseItemViewHolder(
            LayoutInflater.from(parent.context.applicationContext).inflate(R.layout.res_item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is PurchaseItemViewHolder ->{
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setList(purchaseItemList: List<PurchaseItem>){
        this.items = purchaseItemList
    }

    class PurchaseItemViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView){

        private val itemTitle = itemView.itemTitle
        private val itemPrice = itemView.itemPrice
        private val itemImage = itemView.itemImage

        fun bind(list: PurchaseItem, onItemClicked: (PurchaseItem) -> Unit){

            itemTitle.text = list.title
            itemPrice.text = list.price
            itemImage.setImageResource(list.itemImageUrl)

            itemView.buttonBuy.setOnClickListener {
                onItemClicked(list)
            }
        }


    }

}