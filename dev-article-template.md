<!--docs:
title: ""
layout: detail
section: components
excerpt: "This is the template for the developer articles for material.io."
iconId:
path: /
api_doc_root:
initial_release:
-->
<!--initial_release field required with first platform version supported -->
<!-- this is an article template for the material.io developer site.
This template is based on the current design article template at
https://spec.googleplex.com/m2-spec-guide/authoring-content/component-article-template.html

<!--
Replace all instances of '<>' with your content (such as the component name you usually use)

Replace all uses of block quotes with relevant content.
-->

# \[Canonical Component Name\]

> **example Android Button title:**
> # Button

Add a concise (1-2 sentence) description of the component here starting with the one-line definition from the design/guidance page. The corresponding design document should have a full description.

Add a link to the corresponding design page that the component (helps) implement.

[<component cannonical name>](https://material.io/components/<component>)

For example:

> Button allows users to take actions and make choices with a single tap.
> Button can be customized to meet your style requirements.
>
> For more information on the button component, go to the [Button](https://material.io/components/buttons/#usage) guidance page.

## \[Component variants\]

If there are component variants, list them here and link to the local anchor link for its section.

> * [Text button](#text-button)
> * [Outlined button](#outlined-button)
> * [Contained button](#contained-button)
> * [Toggle button](#toggle-button)

Insert any related graphics (such as a graphic showing all variants of this component): show instead of say. If there is no graphic available, skip this. 

<img src="" alt="Include a graphic here with all the variants for this component. Insert a description of the graphic and any variant of the principle component variant it implements.">

example images from Button:
> <img src="docs/images/buttons-types-all.png" alt="Support button variants include text button in the upper left, outlined button in the upper right, contained button in the lower left, and toggle button in the lower right">

<!-- Note that the iOS team has added a TOC to their repo, and it appears to be from https://github.com/jonschlinkert/markdown-toc -->
<!-- toc -->

## Using \[Component Name \]

If there are any instructions on using the component that applies to all component variants (for example, installation or theming), include them here.

If there is a separate page that has instructions, link to that page.

For example, for the Android button component:

> ## Using button
>
> Before you can use the Material.io button, you need to install the Material.io Android library. For more information, go to the [Getting started](https://www.google.com/url?q=https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md&sa=D&ust=1573585349965000&usg=AFQjCNF75a0u6bbQ6-XftBRNV4EQevylkw) page.



For example, for the iOS button component:

> ### Install `mcd-button`
>
> Before using the `MDCButtons` component to implement its variants you must install `MCDButtons`. In your source files import the component, and then apply your theme:
>  1. Install `MDCButtons`
>     * Use CocoaPods to install `MDCButtons`
>       1. Add the following to your `Podfile`:
>         ```bash
>        pod MaterialComponents/Buttons
>         ```
>       1. Run the installer:
>         ```bash
>         pod install
>         ```
> 1. Import `MaterialButtons` and `MaterialButtons_Theming` and initialize `MDCButtons` using `alloc`/`init`. Initialize your theme  before applying it to your button.
>
>    **Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS.
>
>       **Swift**
>       ```swift
>       import MaterialComponents.MaterialButtons
>       import MaterialComponents.MaterialButtons_Theming
>       /*...*/
>       let <local theme name> = <theme name>
>       let button = MDCButton()
>       ```
>       **Objective-C**
>       ```objc
>       #import "MaterialButtons.h"
>       #import <MaterialComponentsBeta/MaterialButtons+Theming.h>
>       /*...*/
>       <theme name> *<local theme name> = [[<theme name> alloc] init];
>       MDCButton *button = [[MDCButton alloc] init];
>       ```
> 1. Apply accessibility settings
>
>    Help make your buttons usable to as many users as possible:
>    * Set an appropriate [`accessibilityLabel`](https://developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel) value if your button does not have a title or only has an icon.
>        **Objective-C**
>        ```objc
>        button.accessibilityLabel = @"Create";
>        ```
>        **Swift**
>        ```swift
>        button.accessibilityLabel = "Create"
>        ```



### \[Component section\]
Divide the component into its variants, preferably as described in the [material.io/components] pages.



For example [button](material.io/components/buttons/) is divided into the following 3rd tier (`###` header) sections based on its variants:

* Text button
* Outlined button
* Contained button
* Toggle button
  * Toggle bar <!-- not actually described in guidance; need to work backwards to design to update design guidance -->
  * Toggle icon <!-- not actually described in guidance; need to work backwards to design to update design guidance-->


Whereas [chips](https://material.io/components/chips/) is divided into:

* Input chip
* Choice chip
* Filter clip
* Action clip

Each section should have a 2nd tier header. Add 1-2 sentences from the material.io website that describes when and how to use the component.

**Important** If your platform does not support a particular variant, EXPLICITLY STATE THAT IT DOESN'T. Consider including a link to library that does support the variant.

**Example: Android Text Button**

> ## Text button
>
> Text buttons are typically used for less-pronounced actions, including those located:
>
>     * In dialogs
>     * In cards
>
> In cards, text buttons help maintain an emphasis on card content.
>
> ...
>
> ## Toggle button
> Toggle button is divided into two subvariants:
> 
> * Toggle bar <img src="images/button-toggle.png" alt="Toggle button group example.">
> * Toggle icon <img src"images/button-icon-toggle.png" alt="Icon toggle button group example">
>
> **Android currently does not support toggle bar.** 
>
> To add an icon button ...


### \[Component Example\] example

The component example header should be one level below the component section header.

The Example section should have the following:
* 1-2 sentences to describe the example
* An image rendering whatever sample code is included
* A list of links to the applicable API(s) listed from highest level to lowest level: include both developer source (e.g., [developer.android.com], or as available) and GitHub source
* Provide example source code that can generate the example in the image. Mention any themes/settings used

**Example: Android Button**

> ## Text button example
>
> The follwing example shows a text button.
>
> <img src="" alt="Text button for Android showing a ... text and ... background">
>
> Source code API:
> * Material Button:
>     * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
>     * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)

>
> ```xml
>  <com.google.android.material.button.MaterialButton
>    android:id="@+id/material_text_button"
>    style="@style/Widget.MaterialComponents.Button.TextButton"
>    android:layout_width="wrap_content"
>    android:layout_height="wrap_content"
>    android:text="@string/text_button_label_enabled"/>
>```
>
> ## Outlined button
>
> Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.
>
>
> ### Outlined button example
>
> <img src="" alt="example outlined button image">
>
> Source code API
> * Material Button:
>     * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
>     * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)
>
> ```xml
> <com.google.android.material.button.MaterialButton
>    android:id="@+id/material_text_button"
>    style="@style/Widget.MaterialComponents.Button.OutlinedButton"
>    android:layout_width="wrap_content"
>    android:layout_height="wrap_content"
>    android:text="@string/outlined_button_label_enabled"/>
> ```
> ## Contained button
>
> Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.
>
> ### Contained button example 
>
> The following examples show a contained button without and with a wrapping parent element, `GridLayout`.
>
> <img src="" alt="example contained button image">
>
>
> **Note** Elevated `MaterialButtons` have a shadow that can extend outside the bounds of the button. For this reason, the wrapping parent element should set to `android:clipToPadding="false"` in cases where the button shadow could be clipped by the parent bounds.
>
> Source code APIs:
> * MaterialButton
>     * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
>     * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)

> * [GridLayout](https://developer.android.com/reference/com/google/android/material/) &ndash; optional
>
> <img src="" alt="example contained button image">
>
> #### Contained button example without wrapping parent element
>
> ``` xml
> <com.google.android.material.button.MaterialButton
>    android:id="@+id/material_button"
>    style="@style/Widget.MaterialComponents.Button"
>    android:layout_width="wrap_content"
>    android:layout_height="wrap_content"
>    android:text="@string/button_label_enabled"/>
> ```
>
> <img src="" alt="example contained button image with grid layout">
>
> #### Contained button example with wrapping parent element GridLayout
>
> ```xml
> <GridLayout
>      android:id="@+id/grid"
>      android:layout_width="match_parent"
>      android:layout_height="wrap_content"
>      android:layout_gravity="center"
>      android:padding="16dp"
>      android:clipToPadding="false"
>      android:columnCount="2">
>
>    <com.google.android.material.button.MaterialButton
>        android:id="@+id/material_button"
>        android:layout_width="wrap_content"
>        android:layout_height="wrap_content"
>        android:text="@string/button_label_enabled"/>
>
>    <Space/>
>  </GridLayout>
> ```
>
> ## Toggle button
>
> The toggle button is a `ViewGroup` that groups together several `MaterialButton`
>
> ### Toggle button sample code
>
> The following example shows a toggle bar.
>
> <img src="" alt="examplebutton image with grid layout">
>
> Source code APIs:
>
> * MaterialButton
>     * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
>     * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)
> * MaterialButtonToggleGroup:
>    * [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup)
>    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButtonToggleGroup.java)

>
>
> ```
> <com.google.android.material.button.MaterialButtonToggleGroup
>    xmlns:android="http://schemas.android.com/apk/res/android"
>    android:id="@+id/toggle_button_group"
>    android:layout_width="wrap_content"
>    android:layout_height="wrap_content">
>
>    <com.google.android.material.button.MaterialButton
>        style="?attr/materialButtonOutlinedStyle"
>        android:layout_width="wrap_content"
>        android:layout_height="wrap_content"
>        android:text="@string/button_label_private"/>
>    <com.google.android.material.button.MaterialButton
>        style="?attr/materialButtonOutlinedStyle"
>        android:layout_width="wrap_content"
>        android:layout_height="wrap_content"
>        android:text="@string/button_label_team"/>
>    <com.google.android.material.button.MaterialButton
>        style="?attr/materialButtonOutlinedStyle"
>        android:layout_width="wrap_content"
>        android:layout_height="wrap_content"
>        android:text="@string/button_label_everyone"/>
>    <com.google.android.material.button.MaterialButton
>        style="?attr/materialButtonOutlinedStyle"
>        android:layout_width="wrap_content"
>        android:layout_height="wrap_content"
>        android:text="@string/button_label_custom"/>
>
> </com.google.android.material.button.MaterialButtonToggleGroup>```
