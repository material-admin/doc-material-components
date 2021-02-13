/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.material.togglebuttons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ImageGridAdapter(
    private val listener: Listener
) : ListAdapter<ImageItem, ImageGridViewHolder>(ImageItemDiffCallback) {

    interface Listener {
        fun onItemClicked(item: ImageItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageGridViewHolder {
        return ImageGridViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.image_grid_item_layout, parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: ImageGridViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class ImageGridViewHolder(
    view: View,
    private val listener: ImageGridAdapter.Listener
) : RecyclerView.ViewHolder(view) {
    private val container = view.findViewById<FrameLayout>(R.id.container)
    private val imageView = view.findViewById<ImageView>(R.id.image_view)
    private val favoriteView = view.findViewById<CheckBox>(R.id.favorite_check_box)
    fun bind(item: ImageItem) {
        imageView.setImageResource(item.imageRes)
        favoriteView.isChecked = item.isFavorite
        container.setOnClickListener {
            listener.onItemClicked(item)
        }
    }
}