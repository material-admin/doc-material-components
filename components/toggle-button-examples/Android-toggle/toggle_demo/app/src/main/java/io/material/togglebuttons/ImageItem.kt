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

import androidx.annotation.DrawableRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.DiffUtil
import java.util.*

data class ImageItem(
    val id: Long,
    @DrawableRes val imageRes: Int,
    var isFavorite: Boolean = false
)

object ImageItemDiffCallback : DiffUtil.ItemCallback<ImageItem>() {
    override fun areItemsTheSame(oldItem: ImageItem, newItem: ImageItem): Boolean =
        oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: ImageItem, newItem: ImageItem): Boolean =
        oldItem.imageRes == newItem.imageRes && oldItem.isFavorite == newItem.isFavorite
}

object ImageItemStore {

    private val allImageItems = mutableListOf(
        ImageItem(
            0,
            R.drawable.img1
        ),
        ImageItem(
            1,
            R.drawable.img2,
            true
        ),
        ImageItem(
            2,
            R.drawable.img3
        ),
        ImageItem(
            3,
            R.drawable.img4
        )
    )

    private val _imageItems: MutableLiveData<List<ImageItem>> = MutableLiveData()
    val imageItems: LiveData<List<ImageItem>>
        get() = _imageItems

    init {
        _imageItems.value = allImageItems.toList()
    }

    fun update(id: Long, with: ImageItem.() -> Unit) {
        val i = allImageItems.indexOfFirst { it.id == id }
        if (i == -1) return

        allImageItems[i] = allImageItems[i].copy().apply(with)
        _imageItems.value = allImageItems.toList()
    }
}

