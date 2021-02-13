# Toggle Buttons

## Screenshots

<img src="screenshots/1_light.png" height="400" alt="Toggle buttons light theme screenshot"/> 
<img src="screenshots/2_dark.png" height="400" alt="Toggle buttons dark theme screenshot"/>

## Toggle bar
A toggle bar, or toggle button group, is implemented on Android using a [MaterialButtonToggleGroup](https://material.io/develop/android/components/material-button-toggle-group/). In this example, Button children of `MaterialButtonToggleGroup` are styled via a custom theme attribute which defines a button that contains a centered icon (no text).

## Icon buttons
Toggleable icon buttons are implemented in this sample using a RecyclerView whose [RecyclerView.Adapter](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.Adapter?hl=en) is notified of changes whenever an item in the list is checked or unchecked. 

## License

```
Copyright 2019 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```