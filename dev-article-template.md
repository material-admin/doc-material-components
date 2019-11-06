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

The API documentation formatting is roughly based on https://developers.google.com/android-publisher/api-ref/inappproducts

Replace all instances of '[]' with your content (such as the component name you usually use)

Replace all uses of block quotes with relevant content.
-->

# \[Canonical Component Name\]

> **example Android Buttons title:**
> # Buttons

Add a concise (1-2 sentence) description of the component here starting with the one-line definition from the design/guidance page. The corresponding design document should have a full description.

Add a link to the corresponding design page that the component (helps) implement.

For example:

> Buttons allow users to take actions and make choices with a single tap.
> Buttons can be customized to meet your style requirements.
>
> For more information, go to the [Buttons](https://material.io/components/buttons/#usage) guidance page.

## \[Component variants\]

If there are component variants, list them here and link to the local anchor link for its section.

> * [Text button](#text-button)
> * [Outlined button](#outlined-button)
> * [Contained button](#contained-button)
> * [Toggle button](#toggle-button)

Insert any related graphics: show instead of say.

<img src="" alt="insert a description of the graphic and any variant of the principle component variant it implements.">

example images from Buttons:
> <img src="docs/images/buttons-types-all.png" alt="Support button variants include text button in the upper left, outlined button in the upper right, contained button in the lower left, and toggle button in the lower right">

<!-- Note that the iOS team has added a TOC to their repo, and it appears to be from https://github.com/jonschlinkert/markdown-toc -->
<!-- toc -->

## Using \[Component Name \]

If there are any instructions on using the component that applies to all component variants (for example, installation or theming), include them here.

For example, for the iOS buttons component:

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
> 1. Import `MDCButtons` and MDC buttons theming and initialize `MDCButtons` using `alloc`/`init`. Initialize your theme  before applying it to your button.
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
>    To help make your buttons usable to as many users as possible:
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
Divide the component API into its variants, preferably as described in the [material.io/components] pages.



For example [buttons](material.io/components/buttons/) is divided into the following 3rd tier (`###` header) sections based on its variants:

* Text button
* Outlined button
* Contained button
* Toggle button


Whereas [cards](https://material.io/components/cards/) is divided into:

* Behavior
* Actions
* Card collections


Each section should have a 3rd tier header. Add 1-2 sentences from the material.io website that describes when and how to use the component.

**Important** If your platform does not support a particular variant, EXPLICITLY STATE THAT IT DOESN'T.

**Example: Android Text Button**
> ### Text button
>
> Text buttons are typically used for less-pronounced actions, including those located:
>     * In dialogs
>     * In cards
> In cards, text buttons help maintain an emphasis on card content.
>
> ...
>
> ### Toggle button
> Toggle button is divided into two subvariants:
> * Toggle button group <img src="images/button-toggle.png" alt="Toggle button group example.">
> * Icon button <img src"images/button-icon-toggle.png" alt="Icon toggle button group example">
>
> **Android currently does not support toggle button groups.** If you need a framework for a toggle button group, use \<example framework with link\>.
>
> To add an icon button ...


#### Example: \[Component Example\]

Each example should have 1-2 sentences to describe the example. The example should include an image rendering whatever sample code is included:

**Example: Android Text Button**

> #### Example: Text button
>
> <img src="" alt="example text button image">

##### APIs used

The APIs section should have the following:
* Links to the applicable API(s) listed from highest level to lowest level
* Provide example source code that can generate the example in the image. Mention any themes/settings used.

**Example: Android Button**

> #### APIs used
> * [MaterialButton](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
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
> ### Outline button
>
> Outline buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.
>
> <img src="" alt="example outlined button image">
>
> #### APIs used
> * [MaterialButton](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
>
>
> #### Outline button sample code
> ```xml
> <com.google.android.material.button.MaterialButton
>    android:id="@+id/material_text_button"
>    style="@style/Widget.MaterialComponents.Button.OutlinedButton"
>    android:layout_width="wrap_content"
>    android:layout_height="wrap_content"
>    android:text="@string/outlined_button_label_enabled"/>
> ```
> ### Contained button
>
> Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.
>
> <img src="" alt="example contained button image">
>
>
> **Note** Elevated `MaterialButtons` have a shadow that can extend outside the bounds of the button. For this reason, the wrapping parent element should set to android:clipToPadding="false" in cases where the button shadow could be clipped by the parent bounds.
>
> #### APIs used
> * [MaterialButton](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button)
> * [GridLayout](https://developer.android.com/reference/com/google/android/material/)
>
> #### Contained button sample code
> <img src="" alt="example contained button image">
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
> ### Toggle button
>
> The toggle button is a `ViewGroup` that groups together several `MaterialButton`
>
> ### APIs Used
>
> [MaterialButtonToggleGroup](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup)
>
> <img src="" alt="examplebutton image with grid layout">
>
> #### Toggle button sample code
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
