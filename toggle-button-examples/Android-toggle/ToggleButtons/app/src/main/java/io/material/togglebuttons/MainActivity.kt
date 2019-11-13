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

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ImageGridAdapter.Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageRecyclerView = findViewById<RecyclerView>(R.id.image_recycler_view)
        val adapter = ImageGridAdapter(this)
        imageRecyclerView.layoutManager = GridLayoutManager(this, 2)
        imageRecyclerView.adapter = adapter
        ImageItemStore.imageItems.observe(this) {
            adapter.submitList(it)
        }
    }

    override fun onItemClicked(item: ImageItem) {
        ImageItemStore.update(item.id) { isFavorite = !item.isFavorite }
    }
}
