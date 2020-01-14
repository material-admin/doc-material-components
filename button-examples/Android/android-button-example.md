<!--docs:
title: "Buttons"
layout: detail
section: components
excerpt: "Android Buttons usage document"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /
api_doc_root:
-->

# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four types of buttons:

1. [Text button](#text-button)
2. [Outlined button](#outlined-button)
3. [Contained button](#contained-button)
4. [Toggle button](#toggle-button)

!["Button types for Android - text, outlined, contained and toggle."](assets/mio-button-types.png)

## Using buttons

Before you can use Material buttons, you need to add a dependency to the Material Components for Android library. For more information, go to the [Getting started](https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md) page.

### Making buttons accessible

Android's button component APIs support labeling for accessibility. To use labels...

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).

## Text button

[Text buttons](https://material.io/components/buttons/#text-button) are typically used for less-pronounced actions, including those located in dialogs and cards. In cards, text buttons help maintain an emphasis on card content.

### Text button examples

API and source code:

* `MaterialButton`
    * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)

The following example shows a text button with a text label.

!["Text button example for Android with purple text 'Text button' over a white background."](assets/text-button.svg)

In the layout:
```xml
<Button
    android:id="@+id/textButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Text button"
    style="@style/Widget.MaterialComponents.Button.TextButton"
/>
```

_**Note:** `<Button>` is auto-inflated as `<com.google.android.material.button.MaterialButton>` via `MaterialComponentsViewInflater` when using a non-Bridge `Theme.MaterialComponents.*` theme._

In code:
```kt
textButton.setOnClickListener {
    // Respond to button press
}
```

<details>
<summary><b>Adding an icon to a text button</b></summary>
<br>

The following example shows a text button with an icon.

!["Text button example for Android with purple text 'Text button' and '+' icon over a white background."](assets/text-button-icon.svg)

In the layout:
```xml
<Button
    ...
    app:icon="@drawable/ic_add_24dp"
    style="@style/Widget.MaterialComponents.Button.TextButton.Icon"
/>
```

</details>

### Anatomy and key properties

A text button has a text label, a transparent container and an optional icon.

![<Placeholder diagram of text button anatomy. Replace this text if/when there is an approved diagram\>](assets/text-button-diagram.png) ![smaller diagram](assets/text_button_anatomy.png)

<details>
<summary><b>Text label</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | `android:text` | `setText`<br/>`getText` | `null` |
| **Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorPrimary` |
| **Typography** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceButton` |

</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `@android:color/transparent` |
| **Stroke color** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `null` |
| **Stroke width** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `0dp` |
| **Shape** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `?attr/shapeAppearanceSmallComponent` |
| **Elevation** | `app:elevation` | `setElevation`<br/>`getElevation` | `0dp` |
| **Ripple color** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorPrimary` at 12% opacity (pressed) |

</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null` |
| **Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorPrimary` |
| **Size** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content` |
| **Gravity** (position relative to text label) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start` |
| **Padding** (space between icon and text label) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `4dp` |

</details>

<details>
<summary><b>Styles</b></summary>
<br>

|  | Style |
| --- | --- |
| **Default style** | `Widget.MaterialComponents.Button.TextButton` |
| **Icon style** | `Widget.MaterialComponents.Button.TextButton.Icon` |

Default style theme attribute: N/A

See the full list of [styles](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/styles.xml) and [attrs](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

## Outlined button

[Outlined buttons](https://material.io/components/buttons/#outlined-button) are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

### Outlined button examples

API and source code:

* `MaterialButton`
    * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)
    
The following example shows an outlined button with a text label and stroked container.    

!["Outlined button example for Android with purple text 'Outlined button' and grey border over a white background."](assets/outlined-button.svg)

In the layout:
```xml
<Button
    android:id="@+id/outlinedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Outlined button"
    style="?attr/materialButtonOutlinedStyle"
/>
```

_**Note:** `<Button>` is auto-inflated as `<com.google.android.material.button.MaterialButton>` via `MaterialComponentsViewInflater` when using a non-Bridge `Theme.MaterialComponents.*` theme._

In code:
```kt
outlinedButton.setOnClickListener {
    // Respond to button press
}
```

<details>
<summary><b>Adding an icon to an outlined button</b></summary>
<br>

The following example shows an outlined button with an icon.

!["Outlined button example for Android with purple text 'Outlined button', grey border and '+' icon over a white background."](assets/outlined-button-icon.svg)

In the layout:
```xml
<Button
    ...
    app:icon="@drawable/ic_add_24dp"
    style="@style/Widget.MaterialComponents.Button.OutlinedButton.Icon"
/>
```

</details>

### Anatomy and key properties

An outlined button has a text label, a stroked container and an optional icon.

![<Placeholder diagram of outlined button anatomy. Replace this text if/when there is an approved diagram\>](assets/outlined_button_anatomy.sm.png)

<details>
<summary><b>Text label</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | `android:text` | `setText`<br/>`getText` | `null` |
| **Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorPrimary` |
| **Typography** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceButton` |

</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `@android:color/transparent` |
| **Stroke color** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `?attr/colorOnSurface` at 12% opacity |
| **Stroke width** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `1dp` |
| **Shape** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `?attr/shapeAppearanceSmallComponent` |
| **Elevation** | `app:elevation` | `setElevation`<br/>`getElevation` | `0dp` |
| **Ripple color** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorPrimary` at 12% opacity (pressed) |

</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null` |
| **Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorPrimary` |
| **Size** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content` |
| **Gravity** (position relative to text label) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start` |
| **Padding** (space between icon and text label) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `4dp` |

</details>

<details>
<summary><b>Styles</b></summary>
<br>

|  | Style |
| --- | --- |
| **Default style** | `Widget.MaterialComponents.Button.OutlinedButton` |
| **Icon style** | `Widget.MaterialComponents.Button.OutlinedButton.Icon` |

Default style theme attribute: `?attr/materialButtonOutlinedStyle`

See the full list of [styles](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/styles.xml) and [attrs](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

## Contained button

[Contained buttons](https://material.io/components/buttons/#contained-button) are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

### Contained button examples

API and source code:

* `MaterialButton`
    * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)

The following example shows a contained button with a text label and a filled container.

!["Contained button example for Android with white text 'Contained button' and purple container over a white background."](assets/contained-button.svg)

In the layout:
```xml
<Button
    android:id="@+id/containedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Contained button"
/>
```

_**Note:** `<Button>` is auto-inflated as `<com.google.android.material.button.MaterialButton>` via `MaterialComponentsViewInflater` when using a non-Bridge `Theme.MaterialComponents.*` theme._

In code:
```kt
containedButton.setOnClickListener {
    // Respond to button press
}
```

<details>
<summary><b>Adding an icon to a contained button</b></summary>
<br>

The following example shows a contained button with an icon.

!["Contained button example for Android with white text 'Contained button', purple container and '+' icon over a white background."](assets/contained-button-icon.svg)

In the layout:
```xml
<Button
    ...
    app:icon="@drawable/ic_add_24dp"
    style="@style/Widget.MaterialComponents.Button.Icon"
/>
```

</details>

### Anatomy and key properties

A contained button has a text label, a filled container and an optional icon.

![<Placeholder diagram of contained button anatomy. Replace this text if/when there is an approved diagram\>](assets/contained-button-diagram.png)

<details>
<summary><b>Text label</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | `android:text` | `setText`<br/>`getText` | `null` |
| **Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorOnPrimary` |
| **Typography** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceButton` |

</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `?attr/colorPrimary` |
| **Stroke color** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `null` |
| **Stroke width** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `0dp` |
| **Shape** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `?attr/shapeAppearanceSmallComponent` |
| **Elevation** | `app:elevation` | `setElevation`<br/>`getElevation` | `2dp` |
| **Ripple color** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorOnPrimary` at 24% opacity (pressed) |

</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null` |
| **Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorOnPrimary` |
| **Size** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content` |
| **Gravity** (position relative to text label) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start` |
| **Padding** (space between icon and text label) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `4dp` |

</details>

<details>
<summary><b>Styles</b></summary>
<br>

|  | Style |
| --- | --- |
| **Default style** | `Widget.MaterialComponents.Button` |
| **Icon style** | `Widget.MaterialComponents.Button.Icon` |
| **Unelevated style** | `Widget.MaterialComponents.Button.UnelevatedButton` |
| **Unelevated icon style** | `Widget.MaterialComponents.Button.UnelevatedButton.Icon` |

Default style theme attribute: `?attr/materialButtonStyle`

See the full list of [styles](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/styles.xml) and [attrs](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

## Toggle button

[Toggle buttons](https://material.io/components/buttons/#toggle-button) can be used to select from a group of choices.

There are two types of toggle buttons:

* [Toggle button](#toggle-button)
* [Icon](#icon)

### Toggle button

To emphasize groups of related toggle buttons, a group should share a common container.

#### Toggle button examples

API and source code:

* `MaterialButtonToggleGroup`
    * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButtonToggleGroup.java)
* `MaterialButton`
    * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)

The following example shows a toggle button with three buttons that have text labels.

!["Toggle button example for Android with text labels - 'Button 1', 'Button 2' and 'Button 3' - and grey/purple borders over a white background."](assets/toggle-button-text.svg)

In the layout:
```xml
<com.google.android.material.button.MaterialButtonToggleGroup
    android:id="@+id/toggleButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
    <Button
        android:id="@+id/button1"    
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 1"    
        style="?attr/materialButtonOutlinedStyle"
    />
    <Button
        android:id="@+id/button2"    
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 2"    
        style="?attr/materialButtonOutlinedStyle"
    />
    <Button
        android:id="@+id/button3"    
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 3"    
        style="?attr/materialButtonOutlinedStyle"
    />
</com.google.android.material.button.MaterialButtonToggleGroup>
```

In code:
```kt
toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->
    // Respond to button selection
}
```

<details>
<summary><b>Implementing an icon-only toggle button</b></summary>
<br>

The following example shows a toggle button with three buttons that have icons.

!["Toggle button example for Android with icons - heart, eye and bell - and grey/purple borders over a white background."](assets/toggle-button.svg)

In `res/values/styles.xml`:
```xml
<style name="Widget.App.Button.OutlinedButton.IconOnly" parent="Widget.MaterialComponents.Button.OutlinedButton">
    <item name="iconPadding">0dp</item>
    <item name="android:insetTop">0dp</item>
    <item name="android:insetBottom">0dp</item>
    <item name="android:paddingLeft">12dp</item>
    <item name="android:paddingRight">12dp</item>
    <item name="android:minWidth">48dp</item>
    <item name="android:minHeight">48dp</item>
</style>
```

In the layout:
```xml
<com.google.android.material.button.MaterialButtonToggleGroup
    ...>
    <Button
        ...
        app:icon="@drawable/ic_favorite_24dp"
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
    />
    <Button
        ...
        app:icon="@drawable/ic_remove_red_eye_24dp"
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
    />
    <Button
        ...
        app:icon="@drawable/ic_notifications_24dp"
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
    />
</com.google.android.material.button.MaterialButtonToggleGroup>
```

</details>

### Anatomy and key properties

A toggle button has a shared stroked container, icons and/or text labels.

![<Placeholder diagram of toggle button anatomy. Replace this text if/when there is an approved diagram\>](assets/toggle-button-diagram.png)

<details>
<summary><b>Selection</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Single selection** | `app:singleSelection` | `setSingleSelection`<br/>`isSingleSelection` | `false` |
| **Selection required** | `app:selectionRequired` | `setSelectionRequired`<br/>`isSelectionRequired` | `false` |

</details>

<details>
<summary><b>Styles</b></summary>
<br>

|  | Style |
| --- | --- |
| **Default style** | `Widget.MaterialComponents.MaterialButtonToggleGroup` |

Default style theme attribute: `?attr/materialButtonToggleGroupStyle`

See the full list of [styles](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/styles.xml) and [attrs](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

### Icon

Icons can be used as toggle buttons when they allow selection, or deselection, of a single choice, such as marking an item as a favorite.

#### Icon example

API and source code:

* `CheckBox`
    * [Class description](https://developer.android.com/reference/android/widget/CheckBox)

The following example shows an icon that can be used independently or in items of a `RecyclerView`.

![<Placeholder image of icon toggle button. Replace this text if/when there is an approved diagram\>](assets/android_toggle_button.png)

In the layout:
```xml
<CheckBox
    android:id="@+id/icon"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:button="@drawable/sl_favourite_24dp"
    app:buttonTint="@android:color/white"
/>
```

In `res/drawable/sl_favourite_24dp.xml`:
```xml
<selector>
    <item
        android:drawable="@drawable/ic_favourite_outlined_24dp" 
        android:state_checked="false"
    />
    <item
        android:drawable="@drawable/ic_favourite_filled_24dp" 
        android:state_checked="true"
    />
    <item android:drawable="@drawable/ic_favourite_outlined_24dp" />
</selector>
```

In code:

```kt
icon.setOnCheckedChangeListener { checkBox, isChecked ->
    // Respond to icon toggle     
}
```

## Theming buttons

Buttons support [Material Theming](https://material.io/components/buttons/#theming) and can be customized in terms of color, typography and shape.

### Button theming example

API and source code:

* `MaterialButton`
    * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)
    
The following example shows text, outlined and contained button types with Material Theming.

!["Button theming example for Android with three buttons - text, outlined and contained - with green/black color theming and cut corners."](assets/button-theming.svg)

<details>
<summary><b>Implementing button theming</b></summary>
<br>

Using theme attributes and styles in `res/values/styles.xml` (themes all buttons and affects other components):
```xml
<style name="Theme.App" parent="Theme.MaterialComponents.*">
    ...
    <item name="colorPrimary">@color/green_a400</item>
    <item name="colorOnPrimary">@color/black</item>
    <item name="textAppearanceButton">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearanceSmallComponent">@style/ShapeAppearance.App.SmallComponent</item>
</style>

<style name="TextAppearance.App.Button" parent="TextAppearance.MaterialComponents.Button">
    <item name="fontFamily">@font/roboto_mono</item>
    <item name="android:fontFamily">@font/roboto_mono</item>
    <item name="android:textAllCaps">false</item>
</style>

<style name="ShapeAppearance.App.SmallComponent" parent="ShapeAppearance.MaterialComponents.SmallComponent">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">8dp</item>
</style>
```

or using a default style theme attribute, styles and theme overlay (themes all buttons but does not affect other components):
```xml
<style name="Theme.App" parent="Theme.MaterialComponents.*">
    ...
    <item name="materialButtonStyle">@style/Widget.App.Button</item>
</style>

<style name="Widget.App.Button" parent="Widget.MaterialComponents.Button">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Button</item>
    <item name="android:textAppearance">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.SmallComponent</item>
</style>

<style name="ThemeOverlay.App.Button" parent="">
    <item name="colorPrimary">@color/green_a400</item>
    <item name="colorOnPrimary">@color/black</item>
</style>
```

or using the style in the layout (affects only this button):
```xml
<Button
    ...
    style="@style/Widget.App.Button"
/>
```

</details>
