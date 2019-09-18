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

<img src="" alt="insert a desription of the graphic and any variant of the principle component variant it implements.">

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

### Related APIs

Link to related APIs.

For example, for iOS
> [MDCRaisedButton](https://material.io/components/ios/catalog/buttons/api-docs/Classes.html#/c:objc(cs)MDCRaisedButton).

For example, for Android
> * [Material Button](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
> * [Material Button Toggle Group](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup)

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


Each section should have a 3rd tier header. Add 1-2 sentences from the material.io website that describes when and how to use the component. Within each section, there should be:
* an image of the section topic
* Provide examples that implement the platonic ideals described on the[material.io/components] page, such as an [extended floating action button](https://material.io/components/buttons-floating-action-button/#extended-fab)
* Provide an image of what the example could produce. Mention any themes/settings used. Ideally each example will have a screen capture or video showing a render of code example. <img src="" alt="insert a desription of the graphic and any variant of the principle component variant it implements.">
* links to the applicable API(s) if there are any specific to the section.


Each section should have its own example(s) with code snippets/settings relevant to the section and an image showing what the code could generate. All code samples should be self-contained easy to cut and paste into a user's existing code and be expected to work.

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


## Examples


<details>
  <summary><b>Click to View Examples without Steps</b></summary>

  Describe the example and its components, including specific settings and instructions.
For example, a contained button implementation in Android:

  > ### Contained Button
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

For example, a text button implementation in iOS:
> ### Add a text button
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
