<!--docs:
title: "Example Article: Android Button"
layout: detail
section: components
excerpt: "This is an example of the Android Material Button developer article for material.io. It uses the template from [../article-component-template.md]"
iconId:
path: /
api_doc_root:
-->

# Buttons

Buttons allow users to take actions and make choices with a single tap.
Buttons can be customized to meet your style requirements.

For more information, go to the [Buttons](https://material.io/components/buttons/#usage) guidance page.

## Button variants

1. [Text button](#text-button)
2. [Outlined button](#outlined-button)
3. [Contained button](#contained-button)
4. [Toggle button](#toggle-button)

<img src="images/buttons-types-all.png">

## Using buttons

Before you can use buttons on Android, you need to depend on the Material Components for Android library. For more information, go to the [getting started](https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md) page.

### Add a `MaterialButton` to your XML layout

All standalone button variants on Android are implemented with the [`MaterialButton`](https://developer.android.com/reference/com/google/android/material/button/MaterialButton) class.

They can be added to an XML layout:
```xml
<com.google.android.material.button.MaterialButton
    android:id="@+id/button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Button"
/>
```

_**Note:** it is also acceptable to simply use the `<Button>` XML tag. This will be automatically inflated as a `MaterialButton` by [`MaterialComponentsViewInflater`](https://developer.android.com/reference/com/google/android/material/theme/MaterialComponentsViewInflater), provided a `Theme.MaterialComponents.*` theme is in use._

### Use a style to enable a variant

In order to achieve a certain button variant, you need to use a style:
```xml
<com.google.android.material.button.MaterialButton
    ...
    style="@style/Widget.MaterialComponents.Button.*"
/>
```

The available styles are mentioned below in the button variant sections. If no style is specified, the contained button variant is the default.

To view the full list of available styles, go to the `MaterialButton` [styles](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/styles.xml).

### Use theme attributes to set default variant styles

A consistent style for all buttons of a certain variant can be applied with theme attributes. These can reference existing variant styles or a custom style you have defined.

Description | Attribute | Related style(s)
---|---|---
Contained button style | `materialButtonStyle` | `Widget.MaterialComponents.Button.*`
Outlined button style | `materialButtonOutlinedStyle` | `Widget.MaterialComponents.Button.OutlinedButton.*`
Toggle button style | `materialButtonToggleGroupStyle` | `Widget.MaterialComponents.MaterialButtonToggleGroup`

These attributes can be overridden in a `Theme.MaterialComponents.*` theme:
```xml
<style name="Theme.App" parent="Theme.MaterialComponents.*">
    ...
    <item name="materialButtonStyle">@style/Widget.App.Button</item>
    <item name="materialButtonOutlinedStyle">@style/Widget.App.Button.OutlinedButton</item>
    <item name="materialButtonToggleGroupStyle">@style/Widget.App.MaterialButtonToggleGroup</item>
</style>
```

They can also be used to apply styles to individual buttons:
```xml
<com.google.android.material.button.MaterialButton
    ...
    style="?attr/materialButtonOutlinedStyle"
/>
```

### `MaterialButton` attributes

Description | Attribute(s) | Related method(s)
---|---|---
Container color | `app:backgroundTint`<br/>`app:backgroundTintMode` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList`<br/>`setBackgroundTintMode`<br/>`getBackgroundTintMode`
Container stroke | `app:strokeColor`<br/>`app:strokeWidth` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor`<br/>`setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth`
Container shape | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel`
Container elevation | `app:elevation` | `setElevation`<br/>`getElevation`
Text label | `android:text` | `setText`<br/>`getText`
Text label color | `android:textColor` | `setTextColor`<br/>`getTextColor`
Text label typography | `android:textAppearance` | `setTextAppearance`
Icon | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon`
Icon size | `app:iconSize` | `setIconSize`<br/>`getIconSize`
Icon gravity (position relative to text label) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity`
Icon padding (space between icon and text label) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding`
Ripple color | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor`

To view the full list of available atttributes, go to the `MaterialButton` [attrs](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

### `MaterialButton` methods

Description | Method(s)
---|---
Listen for press | `setOnClickListener`<br/>`setOnLongClickListener`

To view the full list of available methods, go to the `MaterialButton` [API](https://developer.android.com/reference/com/google/android/material/button/MaterialButton#public-methods_1).

### Use `MaterialButtonToggleGroup` for toggle buttons

Toggle buttons are implemented by grouping `MaterialButton`s using the [`MaterialButtonToggleGroup`](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup) class:

```xml
<com.google.android.material.button.MaterialButtonToggleGroup
    android:id="@+id/toggleButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.google.android.material.button.MaterialButton
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 1"
        style="?attr/materialButtonOutlinedStyle"
    />

    <com.google.android.material.button.MaterialButton
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 2"
        style="?attr/materialButtonOutlinedStyle"
    />
    
    <com.google.android.material.button.MaterialButton
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 3"
        style="?attr/materialButtonOutlinedStyle"
    />
    
    ...

</com.google.android.material.button.MaterialButtonToggleGroup>
```

_**Note:** it is recommended that the outline button variant style is applied to the child `MaterialButton`s._

### `MaterialButtonToggleGroup` attributes

Description | Attribute(s) | Related method(s)
---|---|---
Single selection behavior toggle | `app:singleSelection` | `isSingleSelection`<br/>`setSingleSelection`
Default selected button ID | `app:checkedButton` | `check`<br/>`getCheckedButtonId`

To view the full list of available atttributes, go to the `MaterialButtonToggleGroup` [attrs](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

### `MaterialButtonToggleGroup` methods

Description | Method(s)
---|---
Listen for child button selection | `addOnButtonCheckedListener`<br/>`removeOnButtonCheckedListener`<br/>`clearOnButtonCheckedListeners`
Determine selected child button(s) | `getCheckedButtonId`<br/>`getCheckedButtonIds`
Programmatically select child button | `check`<br/>`uncheck`<br/>`clearChecked`
Programmatically add child button | `addView`

To view the full list of available methods, go to the `MaterialButtonToggleGroup` [API](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup#public-methods_1).

### Text button

Text buttons are typically used for less-pronounced actions, including those located:
* In dialogs.
* In cards, text buttons help maintain an emphasis on card content.

<img src="images/text-button-usage.png">

#### Relevant styles

Description | Style(s)
---|---
Default text button style | `Widget.MaterialComponents.Button.TextButton`
Text button style when icon is present | `Widget.MaterialComponents.Button.TextButton.Icon`
Text button style for snackbar | `Widget.MaterialComponents.Button.TextButton.Snackbar`
Text button style for dialog | `Widget.MaterialComponents.Button.TextButton.Dialog`
Text button style for dialog (no leading margin) | `Widget.MaterialComponents.Button.TextButton.Dialog.Flush`
Text button style for dialog (when icon is present) | `Widget.MaterialComponents.Button.TextButton.Dialog.Icon`

### Outlined button

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

<img src="images/outlined-button-usage.png">

#### Relevant styles

Description | Style(s)
---|---
Default outlined button style | `Widget.MaterialComponents.Button.OutlinedButton`
Outlined button style (when icon is present) | `Widget.MaterialComponents.Button.OutlinedButton.Icon`

### Contained button

Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

<img src="images/contained-button-usage.png">

#### Relevant styles

Description | Style(s)
---|---
Default contained button style | `Widget.MaterialComponents.Button`
Contained button style (when icon is present) | `Widget.MaterialComponents.Button.Icon`
Contained button style with no elevation | `Widget.MaterialComponents.Button.UnelevatedButton`
Contained button style with no elevation (when icon is present) | `Widget.MaterialComponents.Button.UnelevatedButton.Icon`

_**Note:** `*.Icon` styles adjust padding slightly to achieve a better visual balance. This style should only be used with a start-gravity icon. If your icon is end-gravity, mirror the padding such that this adjustment happens on the other side. This applies to all button variants._

### Toggle button

Toggle buttons can be used to group related options. To emphasize groups of related toggle buttons, a group should share a common container.

<img src="images/button-toggle.png">

#### Relevant styles

Description | Style(s)
---|---
Default toggle button style | `Widget.MaterialComponents.MaterialButtonToggleGroup`

### Related APIs

#### Material button

 Go  to the [Android MaterialButton API](https://developer.android.com/reference/com/google/android/material/button/MaterialButton) for more details.
```xml
<com.google.android.material.button.MaterialButton
  android:<property>="<property value>"
   ...
   style="@style/widget.MaterialComponents.<style value>"
/>
```
#### Material button attributes without icons

Attribute | Description | Possible values
---|---|---
`android:id` | | `"@+id/material_button"` </br> `"@+id/disabled_material_button"` </br> `"@+id/material_unelevated_button"`
`android:layout_width` | | `"wrap_content"`
`android:layout_height` | | `"wrap_content"`
`android:enabled` | | `true`\|`false`
`android:text` | | `"@string/button_label_enabled"`</br> `"@string/button_label_disabled"`
`style`| |`"@style/Widget.MaterialComponents.Button.UnelevatedButton"` </br> `"@style/Widget.MaterialComponents.Button.TextButton"`

##### Material button attributes with icons

The .Icon style should only be used for start-gravity icon buttons. If your icon is end-gravity, you cannot use a .Icon style and must instead manually adjust your padding such that the visual adjustment is mirrored.

<img src="images/buttons-elements-icon-01.png">

Attribute | Description | Possible values
---|---|---
`android:id` |  | `"@+id/material_icon_button"` </br> `"@+id/disabled_icon_material_button"` </br> `"@+id/material_icon_unelevated_button"`
`android:layout_width` |  | `"wrap_content"`
`android:layout_height` |  | `"wrap_content"`
`android:enabled` |  | `true`\|`false`
`android:text` |  | `"@string/icon_button_label_enabled"`</br> `"@string/icon_button_label_disabled"`
`app:icon` | adds an icon to the button | `"@drawable/icon_24px"`
`style`|  | `"@style/Widget.MaterialComponents.Button.Icon"` </br> `"@style/Widget.MaterialComponents.Button.TextButton.Icon"`

#### Material Button Toggle Group
Go  to the [Android MaterialButtonToggleGroup API](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup) for more details.

**Note** We recommend that child buttons use an outlined style. 

```xml
<com.google.android.material.button.MaterialButtonToggleGroup
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/toggle_button_group"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_private"/>
        /*...*/
    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_custom"/>

</com.google.android.material.button.MaterialButtonToggleGroup>
```

#### Material button toggle group attributes

Attribute | Description | Possible values
---|---|---
`android:id` | | `"@+id/toggle_button_group"`
`android:layout_width` | | `"wrap_content"`
`android:layout_height` | | `"wrap_content"`
`android:enabled` | | `true`\|`false`
`style`| |`"@style/Widget.MaterialComponents.Button.UnelevatedButton"` </br> `"@style/Widget.MaterialComponents.Button.TextButton"`

#### Material button toggle group methods

Method | Description
---|---
`addView(View)`| Programmatically adds buttons to the toggle group
`OnButtonCheckedListener` | Listens for changes to the child buttons' checked state
`addOnButtonCheckedListener`| Adds a listener to check the state of child buttons
`removeOnButtonCheckedListener` | Removes listener that checks the sate of child buttons

Go  to the [Android MaterialButtonToggleGroup API](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup) for more details.

**Note** We recommend that child buttons use an outlined style. For more information on button styling, see [MaterialButton](MaterialButtonExample.md)

```xml
<com.google.android.material.button.MaterialButtonToggleGroup
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/toggle_button_group"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_private"/>
        /*...*/
    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_custom"/>

</com.google.android.material.button.MaterialButtonToggleGroup>
```

#### Material button toggle group attributes

Attribute | Description | Possible values
---|---|---
`android:id` | | `"@+id/toggle_button_group"`
`android:layout_width` | | `"wrap_content"`
`android:layout_height` | | `"wrap_content"`
`android:enabled` | | `true`\|`false`
`style`| |`"@style/Widget.MaterialComponents.Button.UnelevatedButton"` </br> `"@style/Widget.MaterialComponents.Button.TextButton"`

#### Material button toggle group methods

Method | Description
---|---
`addView(View)`| Programmatically adds buttons to the toggle group
`OnButtonCheckedListener` | Listens for changes to the child buttons' checked state
`addOnButtonCheckedListener`| Adds a listener to check the state of child buttons
`removeOnButtonCheckedListener` | Removes listener that checks the sate of child buttons


### Text button

Text buttons are typically used for less-pronounced actions, including those located:
* In dialogs
* In cards
In cards, text buttons help maintain an emphasis on card content.



<img src="images/text-button-usage.png">

Attribute | Attribute value | Element description
---|---|---
 android:id | `"@+id/material_text_button"` |
 style | `"@style/Widget.MaterialComponents.Button.TextButton"` </br> `"@style/Widget.MaterialComponents.Button.TextButton.Icon"` |
 android:layout_width | `"wrap_content" ` |
 android: layout_height | `"wrap_content"` |
 android:text | `"@string/text_button_label_enabled"`|

#### Text button example
```xml
 <com.google.android.material.button.MaterialButton
    android:id="@+id/material_text_button"
    style="@style/Widget.MaterialComponents.Button.TextButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/text_button_label_enabled"/>
```
### Outlined button

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

<img src="images/outlined-button-usage.png">

 Attribute | Attribute value | Element description
---|---|---
 android:id | `"@+id/material_text_button"` |
 style | `"@style/Widget.MaterialComponents.Button.TextButton"` </br>`"@style/Widget.MaterialComponents.Button.OutlinedButton.Icon"` |
 android:layout_width | `"wrap_content"`|
 android: layout_height | `"wrap_content"`|
 android:text | `"@string/text_button_label_enabled"` |  

#### Outlined button example
```xml
<com.google.android.material.button.MaterialButton
    android:id="@+id/material_text_button"
    style="@style/Widget.MaterialComponents.Button.OutlinedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/outlined_button_label_enabled"/>
```
### Contained button
Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

**Note** Elevated `MaterialButtons` have a shadow that can extend outside the bounds of the button. For this reason, the wrapping parent element should set to `android:clipToPadding="false"` in cases where the button shadow could be clipped by the parent bounds.

<img src="images/contained-button-usage.png">

Attribute | Attribute value | Element description
---|---|---
android:id | `"@+id/material_button"` |
style | `"@style/Widget.MaterialComponents.Button"` </br> `"@style/Widget.MaterialComponents.Button.Icon"` </br> `"@style/Widget.MaterialComponents.Button.UnelevatedButton"` </br> `"@style/Widget.MaterialComponents.Button.UnelevatedButton.Icon"` |
android:layout_width | `"wrap_content"` |
android: layout_height | `"wrap_content"`|
android:text | `"@string/text_button_label_enabled"` |  

#### Contained button example
```xml
<com.google.android.material.button.MaterialButton
    android:id="@+id/material_button"
    style="@style/Widget.MaterialComponents.Button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_label_enabled"/>
```

#### Contained button example with wrapping parent element `GridLayout`

```xml
<GridLayout
      android:id="@+id/grid"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_gravity="center"
      android:padding="16dp"
      android:clipToPadding="false"
      android:columnCount="2">

    <com.google.android.material.button.MaterialButton
        android:id="@+id/material_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_enabled"/>

    <Space/>
  </GridLayout>
```

## Example: Contained button

<details>
  <summary><b>Add a filled and elevated button</b></summary>

    <img src="" alt="Contained button Android render without an icon">  

 The following code adds a filled and elevated button to your app. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
   ```xml
    <com.google.android.material.button.MaterialButton
      android:id="@+id/material_button"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="@string/button_label_enabled"/>
  ```
</details>

## Example: Contained button with icon
<details>
<summary><b>Add a filled and unelevated button</b></summary>

  <img src="" alt="Contained button Android render with an icon">

 The following code adds a filled and unelevated button. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
  ```xml
    <com.google.android.material.button.MaterialButton
      android:id="@+id/disabled_material_button"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:enabled="false"
      android:text="@string/button_label_disabled"/>
  ```

</details>

### Example: Toggle group with buttons
<details>
<summary><b>The following example shows a toggle group with outlined buttons.</b></summary>

<img src="" alt="toggle button group with outlined buttons">

```xml
\* example code here *\
```
</details>

### Example: Toggle group with icon toggle buttons over images

<details>
<summary><b>he following example shows a icon toggle group over images.</b></summary>
<img src="" alt="toggle button group with icons buttons over images">

```xml
\* example code here *\
```
</details>
