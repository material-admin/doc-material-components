<!--docs:
title: ""
layout: detail
section: components
excerpt: "This is the template for the developer articles for material.io."
iconId:
path: /
api_doc_root:
-->

<!-- this is an article template for the material.io developer site.
This template is based on the current design article template at
https://spec.googleplex.com/m2-spec-guide/authoring-content/component-article-template.html

The API documentation formatting is roughly based on https://developers.google.com/android-publisher/api-ref/inappproducts

Replace all instances of '[]' with your content (such as the component name you usually use)

Replace all uses of block quotes with relevant content.
-->

# \[Canonical Component Name\] (Commonly used Component Name)

> **example Android Buttons title:**
> # Buttons (Material Buttons)

Add a concise (1-2 sentence) description of the component here starting with the one-line definition from the design/guidance page. The corresponding design document should have a full description.

Add a link to the corresponding design page.
For example:

> Buttons allow users to take actions and make choices with a single tap.
> Buttons can be customized to meet your style requirements.
>
> [Buttons](https://material.io/components/buttons/#usage)

## \[Component variants\]

### When to use

If there are component variants, list them here and link to the local anchor link for its section.

> * [Text button](#ios-text-button)
> * [Outlined button](#ios-outlined-button)
> * [Contained button](#ios-contained-button)
> * [Toggle button](#ios-toggle-button)

Insert any related graphics: show instead of say.

example images from Buttons:
> <img src="docs/images/buttons-types-all.png" alt="Support button variants include text button in the upper left, outlined button in the upper right, contained button in the lower left, and toggle button in the lower right">

<!-- Note that the iOS team has added a TOC to their repo, and it appears to be from https://github.com/jonschlinkert/markdown-toc -->
<!-- toc -->

## Using \[Component Name \]

Use 1-2 sentences to describe how the component is used. Provide images of its relative position, if relevant. Use collapsible tags for examples that require more than a page of text.

If there are any instructions on using the component that applies to all component variants, include them here.

For example, for the iOS buttons component:

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

If relevant, insert all the related component code, and link to its API.

For example, from the [iOS Button component](https://material.io/components/ios/catalog/buttons/api-docs/Classes.html#/c:objc(cs)MDCRaisedButton):

> ### Class: [MCDRaisedButton](https://material.io/components/ios/catalog/buttons/api-docs/Classes.html#/c:objc(cs)MDCRaisedButton)
>
> #### Interface Class
> ```obj-C
> @interface MDCButton : UIButton <MDCElevatable, MDCElevationOverriding>
> ```
>
> #### Properties
> <details>
>   <summary><pre>inkStyle</pre></summary>
> This is a description of the inkStyle property for iOS.
> </details>
> <details>
>   <summary><pre>inkColor</pre></summary>
>     This is a description of the inkColor property for iOS.
> </details>

### \[Component section\]
Divide the component API into categories according to the TOC on its corresponding material.io/components page. Following a similar outline will help cross-link the pages between the design documents and the developer pages. You can skip **Theming** and **Specs** sections unless the component APIs deal specifically with either.

For example [buttons](material.io/components/buttons/) is divided into the following 3rd tier (`###` header) sections based on its variants:

* Text button
* Outlined button
* Contained button
* Toggle button


Whereas [cards](https://material.io/components/cards/) is divided into:

* Behavior
* Actions
* Card collections


Each section should have a 3rd tier header. Within each section, there should be a table that contains:
* an image of the section topic
* a general description
* classes, parameters, enums related to the section
* links to the applicable API(s) if there are any specific to the section.


If possible, each section should have its own example(s) with code snippets/settings relevant to the section and an image showing what the code could generate. All code samples should be self-contained easy to cut and paste into a user's existing code and be expected to work.


**Example: Android Button**

> ### Android text button
>
> <img src="docs/images/text-button-usage.png" alt="example text button image">
> The `TextButton` style has a transparent background with colored text. Text buttons are used for low-priority actions, especially when presenting multiple options.
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
* What functions/objects does it use?
* How does the example use the objects/functions?
* Are there any special settings/options used in this example, and why?
* Provide an image of what the example could produce. Mention any themes/settings used.

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
