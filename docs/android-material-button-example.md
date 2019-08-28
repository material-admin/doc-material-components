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
#### Material button attributes
Attribute | Description | Possible values
---|---|---
`android:id` | | `"@+id/material_button"` </br> `"@+id/disabled_material_button"` </br> `"@+id/material_unelevated_button"`
`android:layout_width` | | `"wrap_content"`
`android:layout_height` | | `"wrap_content"`
`android:enabled` | | `true`\|`false`
`android:text` | | `"@string/button_label_enabled"`</br> `"@string/button_label_disabled"`
`style`| | `"@style/Widget.MaterialComponents.Button.UnelevatedButton"` </br> `"@style/Widget.MaterialComponents.Button.TextButton"`
   
### Text button

The `TextButton` style has a transparent background with colored text. Text buttons are used for low-priority actions, especially when presenting multiple options.
https://developer.android.com/reference/com/google/android/material/button/MaterialButton

Attribute | Attribute value | Element description
---|---|---
 android:id | `"@+id/material_text_button"` | 
 style | `"@style/Widget.MaterialComponents.Button.TextButton"` | 
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

The `OutlinedButton` style has a transparent background with colored text, and a small stroke around the button. Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

https://developer.android.com/reference/com/google/android/material/button/MaterialButton

 Attribute | Attribute value | Element description 
---|---|--- 
 android:id | `"@+id/material_text_button"` | 
 style | `"@style/Widget.MaterialComponents.Button.TextButton"` | 
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

https://developer.android.com/reference/com/google/android/material/button/MaterialButton

Attribute | Attribute value | Element description 
---|---|---
android:id | `"@+id/material_text_button"` | 
style | `"@style/Widget.MaterialComponents.Button.TextButton"`| 
android:layout_width | `"wrap_content"` | 
android: layout_height | `"wrap_content"`| 
android:text | `"@string/text_button_label_enabled"` |  

#### Contained button example
```xml

```
### Toggle button

 https://developer.android.com/reference/com/google/android/material/button/MaterialButton
 
Attribute | Attribute value | Element description 
---|---|---
android:id | `"@+id/material_text_button"` | 
style  | `"@style/Widget.MaterialComponents.Button.TextButton"` | 
android:layout_width | `"wrap_content"` | 
android: layout_height | `"wrap_content"`| 
android:text | `"@string/text_button_label_enabled"` | 

#### Toggle button example
```xml

```
### Specs
Attribute| Attribute value | Element description 
---|---|---
 | | 

   
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
  
