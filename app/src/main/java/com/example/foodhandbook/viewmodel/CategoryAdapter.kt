package com.example.foodhandbook.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.foodhandbook.R
import com.example.foodhandbook.view.ChildFragment
import com.example.foodhandbook.view.MainActivity

class CategoryAdapter: RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {


    private var category = arrayOf("Thức ăn vặt","Đồ uống","Thực phẩm bổ sung","Các loại thịt","Trái cây",
        "Hải sản","Rau củ","Tinh bột","Ngũ cốc")

    private var image = intArrayOf(R.drawable.thuc_an_vat,R.drawable.drink,R.drawable.thuc_pham_chuc_nang,R.drawable.meat,R.drawable.fruits,R.drawable.seafood
    ,R.drawable.vegetable,R.drawable.baby_food,R.drawable.cereal)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.item_catelogys,parent,false)

        return ViewHolder(v)

        }




    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        holder.itemCategory.text = category[position]
        holder.itemImage.setImageResource(image[position])
        holder.itemView.setOnClickListener(object :View.OnClickListener{

            override fun onClick(v: View?) {
                if (position == 1) {
                    val activity = v!!.context as AppCompatActivity
                    val childFragment = ChildFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.main, childFragment).addToBackStack(null).commit()
                }
            }

        })
    }

    override fun getItemCount(): Int {
        return category.size
    }

    inner class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var  itemCategory : TextView
        var itemImage : ImageView

        init {
            itemCategory = itemView.findViewById(R.id.tvCategory)
            itemImage = itemView.findViewById(R.id.imageCategory)
        }
    }
}