<!--docs:
title: ""
layout: detail
section: components
excerpt: "This is the template for the developer APIs for material.io."
iconId:
path: /
api_doc_root:
initial_release:
-->
<!--initial_release field required with first platform version supported -->
<!-- This template is based on the current design article template at
https://spec.googleplex.com/m2-spec-guide/authoring-content/component-article-template.html

The API documentation formatting is roughly based on https://developers.google.com/android-publisher/api-ref/inappproducts

Replace all instances of '[]' with your content (such as the component name you usually use)

Replace all uses of block quotes with relevant content.
-->

# \[API name\]

**example Android Buttons title:**
> # Material Buttons

Add a concise (1-2 sentence) description of the API here.

Describe in 1-2 paragraphs how the API is used. If possible, reference any relevant [material.io](http://material.io/components) articles.

Add a link to the corresponding developer pages that the component (helps) implement.

**Example: Android Material Buttons**

> [Material Button](https://developer.android.com/reference/com/google/android/material/button/MaterialButton) is a a child object clqww of Buttons, which allow users to take action and make choices with a single tap.
>
> The Material Button class displays Material default styles without the use of a style flag.
>
> **Relevant Links**
>
> [Material Buttons guidance](https://material.io/components/buttons/#usage)
> [Android Material Button Examples](page that includes code samples to implement the examples shown on the m.io guidance page)
> [Android MaterialButton developer page](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)


If the API implements multiple component variants described in [material.io](https://material.io/components), list them here and link to the local anchor link for its section.

**Example from Android Material Button**
> Material Button implements the following of the Buttons components from [Material.io](https://material.io/components/buttons):
> ß
> * [Text button](#text-button)
> * [Outlined button](#outlined-button)
> * [Contained button](#contained-button)

Insert any related graphics: show instead of say.

<img src="" alt="insert a description of the graphic and any variant of the principle component variant it implements.">

**example images from Buttons:**
> <img src="docs/images/buttons-types-all.png" alt="Support button variants include text button in the upper left, outlined button in the upper right, contained button in the lower left, and toggle button in the lower right">


## Installing \[Component Name \]

If there are any instructions on installing the API, include them here.

For example, for the iOS buttons component:

> ## Install `mcd-button`
>
>  You must install `MCDButtons` before you can use it in your application. In your source files import the component, and then apply your theme:
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

## \[API\] prototype

Insert the API prototype here.

Include tables for any of the prototype's properties, such as child classes, constants, variables, etc.

**Example from iOS: MCDRaisedButton**
> ## MCDRaisedButton prototype
>
> ### Interface Class
> ```obj-C
> @interface MDCButton : UIButton <MDCElevatable, MDCElevationOverriding>
> ```
>
> ### Properties
> <details>
>   <summary><pre>inkStyle</pre></summary>
> This is a description of the inkStyle property for iOS.
> </details>
> <details>
>   <summary><pre>inkColor</pre></summary>
>     This is a description of the inkColor property for iOS.
> </details>
If relevant, insert all related component code and a table for related properties. If the prototype references other APIs, list them and include the relevant links.




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


Each section should have a 3rd tier header. Add 1-2 sentences from the material.io website that describes when and how to use the component. Within each section, there should be a table that contains:
* an image of the section topic
* a general description
* classes, parameters, enums related to the section
* links to the applicable API(s) if there are any specific to the section.


If possible, each section should have its own example(s) with code snippets/settings relevant to the section and an image showing what the code could generate. All code samples should be self-contained easy to cut and paste into a user's existing code and be expected to work.

<img src="" alt="Insert your graphic showing an screenshot of the described implemented on your platform here. Make sure that the alt description is accurate">

**Example: Android Button**

> ### Android text button
>
> <img src="docs/images/text-button-usage.png" alt="example text button image">
> Text buttons are typically used for less-pronounced actions, including those located:
>     * In dialogs
>     * In cards
> In cards, text buttons help maintain an emphasis on card content.
>
> Attribute | Attribute value | Element description
> ---|---|---
> android:id | `"@+id/material_text_button"` |
> style | `"@style/Widget.MaterialComponents.Button.TextButton"` |
> android:layout_width | `"wrap_content" ` |
> android: layout_height | `"wrap_content"` |
> android:text | `"@string/text_button_label_enabled"`|
>
> #### Android text button example
> ```xml
>  <com.google.android.material.button.MaterialButton
>    android:id="@+id/material_text_button"
>    style="@style/Widget.MaterialComponents.Button.TextButton"
>    android:layout_width="wrap_content"
>    android:layout_height="wrap_content"
>    android:text="@string/text_button_label_enabled"/>
>```
>
> ...
>


## Example: \[Describe a way to use the Component\]
* Provide an example scenario of how the component might be used. Preferably, chose an example that implements something that resembles one of the design examples for the related [material.io/components] page, such as an [extended floating action button](https://material.io/components/buttons-floating-action-button/#extended-fab)
    * What functions/objects/methods does it use?
    * How does the example use the objects/functions?
    * Are there any special settings/options used in this example, and why?
* Provide an image of what the example could produce. Mention any themes/settings used. Ideally each example will have an image or video showing a render of code example. <img src="" alt="insert a desription of the graphic and any variant of the principle component variant it implements.">


<details>
  <summary><b>Click to View Examples without Steps</b></summary>

  Describe the example and its components, including specific settings and instructions.

  > ### Example: Add a contained (filled) and elevated button
  > The following code adds a contained and elevated button to your app. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
  > <img src="docs/images/contained-button-usage.png" alt="example of a filled an elevated button image">
  >   ```xml
  >    <com.google.android.material.button.MaterialButton
  >      android:id="@+id/material_button"
  >      android:layout_width="wrap_content"
  >      android:layout_height="wrap_content"
  >      android:text="@string/button_label_enabled"/>
  >  ```
  >  ### Example: Add a contained (filled) and unelevated button
  > The following code adds a contained and unelevated button. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
  >  ```xml
  >    <com.google.android.material.button.MaterialButton
  >      android:id="@+id/disabled_material_button"
  >      android:layout_width="wrap_content"
  >      android:layout_height="wrap_content"
  >      android:enabled="false"
  >      android:text="@string/button_label_disabled"/>
  >  ```

</details>

<details>
  <summary><b>Click to View Examples with Steps</b></summary>

  If the example entails multiple steps, use a numbered list for each step. Break out any installation/importation steps into its own list.

 List the steps to use the component. Include any installation/importation instructions in a separate list.
> ### Add a themed text button
> Follow the steps below to add a text button in your iOS application:
> <img src="docs/images/ios-text-button.gif" alt="animated gif of a text button">
>
> 1. Add the following to your `Podfile`:
>   ```bash
>   pod 'MaterialComponents/Buttons'
>   ```
> 2. Run the `install` command:
>   ```bash
>    pod install
>    ```
> 3. In your source file, you will need to:
>    * import `MaterialButtons`
>      ```swift
>        import MaterialComponents.MaterialButtons
>      ```
>    * import `MaterialButtons_Theming`
>        ```swift
>        import MaterialComponents.MaterialButtons_Theming
>        ```
>    * initialize the button
>        ```swift
>        let button = MDCButton()
>        ```
>    * apply a theme to the text button
>        ```swift
>        button.applyTextTheme(withScheme: containerScheme)
>        ```

</details>
