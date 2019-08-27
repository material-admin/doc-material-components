<!--docs:
title: "Example Article: Android Material Button"
layout: detail
section: components
excerpt: "This is an example of the Android Material Button developer article for material.io. It uses the template from [../article-component-template.md]"
iconId: 
path: /
api_doc_root: 
-->

# Material button

`Material Button` is a customizable button component with updated visual styles. This button component has several built-in styles to support different levels of emphasis, as typically any UI will contain a few different buttons to indicate different actions. 

## Material button types

* [Text button](#text-button)
* [Outlined button](#outlined-button)
* [Contained button](#contained-button)
* [Toggle button](#toggle-button)

Insert any related graphics. **Don't say what you can show**

<!-- Note that the iOS team has added a TOC to their repo, and it appears to be from https://github.com/jonschlinkert/markdown-toc -->
<!-- toc -->

## Using `MaterialButton`

The `MaterialButton` component provides a complete implementation of Material Design’s button component. 

### Related APIs

#### Material button element
```xml
<com.google.android.material.button.MaterialButton
  android:<property>="<property value>"
   ...
   style="@style/widget.MaterialComponents.<style value>"
/>
```
#### Material button propery values
Property | Description | Possible values
---|---|---
`android:id` | | `"@+id/material_button"` </br> `"@+id/disabled_material_button"` </br> `"@+id/material_unelevated_button"`
`android:layout_width` | | `"wrap_content"`
`android:layout_height` | | `"wrap_content"`
`android:enabled` | | `true`\|`false`
`android:text` | | `"@string/button_label_enabled"`</br> `"@string/button_label_disabled"`
`style`| | `"@style/Widget.MaterialComponents.Button.UnelevatedButton"` </br> `"@style/Widget.MaterialComponents.Button.TextButton"`
   
### Text button
Related element | Parameter(s) | Parameter value | Element description | API link
---|---|---|---|---
MaterialButton | android:id </br> style </br> android:layout_width </br> android: layout_height </br> android:text | "@+id/material_text_button" </br> "@style/Widget.MaterialComponents.Button.TextButton" </br> "wrap_content" </br> "wrap_content" </br> "@string/text_button_label_enabled" | | https://developer.android.com/reference/com/google/android/material/button/MaterialButton

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
Related element | Parameter(s) | Parameter value | Element description | API link
---|---|---|---|---
MaterialButton | android:id </br> style </br> android:layout_width </br> android: layout_height </br> android:text | "@+id/material_text_button" </br> "@style/Widget.MaterialComponents.Button.TextButton" </br> "wrap_content" </br> "wrap_content" </br> "@string/text_button_label_enabled" | | https://developer.android.com/reference/com/google/android/material/button/MaterialButton

#### Outlined button example
```xml

```
### Contained button
Related element | Parameter(s) | Parameter value | Element description | API link
---|---|---|---|---
MaterialButton | android:id </br> style </br> android:layout_width </br> android: layout_height </br> android:text | "@+id/material_text_button" </br> "@style/Widget.MaterialComponents.Button.TextButton" </br> "wrap_content" </br> "wrap_content" </br> "@string/text_button_label_enabled" | | https://developer.android.com/reference/com/google/android/material/button/MaterialButton

#### Contained button example
```xml

```
### Toggle button
Related element | Parameter(s) | Parameter value | Element description | API link
---|---|---|---|---
MaterialButton | android:id </br> style </br> android:layout_width </br> android: layout_height </br> android:text | "@+id/material_text_button" </br> "@style/Widget.MaterialComponents.Button.TextButton" </br> "wrap_content" </br> "wrap_content" </br> "@string/text_button_label_enabled" | | https://developer.android.com/reference/com/google/android/material/button/MaterialButton

#### Toggle button example
```xml

```
### Specs
Related element | Parameter(s) | Parameter value | Element description | API link
---|---|---|---|---
 | | | |

   
## Examples

<details>
  <summary><b>Add a filled and elevated button</b></summary>
  
 The following code adds a filled and elevated button to your app. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
   ```xml
    <com.google.android.material.button.MaterialButton
      android:id="@+id/material_button"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="@string/button_label_enabled"/>
  ```
</details>

<details>
<summary><b>Add a filled and unelevated button</b></summary>
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
  
