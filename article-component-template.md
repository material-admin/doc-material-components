<!--docs:
title: ""
layout: detail
section: components
excerpt: "This is the template for the developer articles for material.io."
iconId: 
path: /
api_doc_root: 
-->

<!-- this is a draft of a an article template for the material.io developer site.
This template is based on the current design article template at 
https://spec.googleplex.com/m2-spec-guide/authoring-content/component-article-template.html
The API documentation formatting is roughly based on https://developers.google.com/android-publisher/api-ref/inappproducts
-->

**Reminder** This is a template. Delete this paragraph and update and review all information requestsw within the comments.

# \[Component Name\]

Add a concise description of the component here. For example:

> Buttons allow users to take actions and make choices using a tap to press the button.
> Buttons can be customized to meet your style requirements.

If there are component subtypes, list them here and link to the relevant article.

Insert any related graphics. **Don't say what you can show**

**Note** if there component subtypes that require more than a page to describe/require examples, do not describe them in this article: create a separate article in its own folder.

<!-- Note that the iOS team has added a TOC to their repo, and it appears to be from https://github.com/jonschlinkert/markdown-toc -->
<!-- toc -->

## Using \[Component Name\]

Describe how the component is used. Provide images of its relative position, if relevant. Use collapsible tags for examples that require more than a page of text.

### Related APIs

If relevant, insert all the related component code and link to its API.

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
   > stuff
   > </details>
>   <details>
   > <summary><pre>inkColor</pre></summary>
   > stuff
>   </detalis>

### \[Component section\]
Divide the component API into categories according to its TOC on its corresponsoding material.io/components page. Following a similar outline will help cross-link the pages between the design documents and the developer pages.

For example [buttons](material.io/components/buttons/) is divided into the following 3rd tier sections:

* Text button
* Outlined button
* Contained button
* Toggle button
* Theming
* Specs

Whereas [cards](https://material.io/components/cards/) is divided into:

* Behavior
* Actions
* Card collections
* Theming
* Specs

Each section should have a 3rd tier header. Within each section, there should be a table that contains:
* classes, parameters, enums related to the section
* a general description
* links applicable classes, constants, typedefs, etc. 

If possible, each section should have its own example(s) with code snippets/settings relevant to the section.

**Example: iOS button**

> 
> ### Text button
> Related element | Parameter(s) | Parameter value | Element description | API link
> ---|---|---|---|---
> MCDButton | underlyingColorHint | hex (?) |Determines a button's background color and surrounding area. | https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html
>
> #### Text button example
> **Swift**
> ```swift
> let button = MCDButton()
> ```
> **Objective-C**
> ```obj-c
> MDCButton *button = [[MDCButton alloc] init];
> ```
> ...
>
> ### Specs
> Related element | Parameter(s) | Parameter value | Element description | API link
> ---|---|---|---|---
> | | | |
> 
> ###


**Example: Android Button**

> ### Text button
> Related element | Parameter(s) | Parameter value | Element description | API link
> ---|---|---|---|---
> MaterialButton | android:id </br> style </br> android:layout_width </br> android: layout_height </br> android:text | "@+id/material_text_button" </br> "@style/Widget.MaterialComponents.Button.TextButton" </br> "wrap_content" </br> "wrap_content" </br> "@string/text_button_label_enabled" | | https://developer.android.com/reference/com/google/android/material/button/MaterialButton
>
> ...
>
> ### Specs
> Related element | Parameter(s) | Parameter value | Element description | API link
> ---|---|---|---|---
> | | | |

   
## Example: \[Describe a way to use the Component\]
* What functions/objects does it use?
* How does the example use the objects/functions?
* Are there any special settings/options used in this example, and why?

<details>
  <summary><b>Click to View Examples without Steps</b></summary>
  
  Describe the example and its components, including specific settings and instructions.
  
  > ### Example: Add a Filled and Elevated Button
  > The following code adds a filled and elevated button to your app. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
  >   ```xml
  >    <com.google.android.material.button.MaterialButton
  >      android:id="@+id/material_button"
  >      android:layout_width="wrap_content"
  >      android:layout_height="wrap_content"
  >      android:text="@string/button_label_enabled"/>
  >  ```
  >  ### Example: Add a Filled and Unlevated Button
  > The following code adds a filled and unelevated button. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
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
  
  If the example entails multiple steps, use a numbered list for each step. Break out iny installation/importation steps into its own list.
 
 List the steps to use the compnent. Include any installation/importation instructions in a separate list.
> ### Install `MaterialButton`
> Follow the steps below to add the `MaterialButton` component in your iOS application:
>
> 1. Add the following to your `Podfile`:
>   ```bash
>   pod 'MaterialComponents/Buttons'
>   ```
> 1. Run the `install` command:
>   ```bash
>    pod install
>    ```
>  1. Import `MaterialButton` component
>    ```swift
>      import MaterialComponents.MaterialButtons
>    ```
> ### Add a Floating Action Button
> `DCFloatingButton` is a subclass of `MDCButton` that implements the Material Design floating action button style and behavior. Floating action buttons should be provided with a templated image for their normal state and then themed accordingly.
> ```swift
> // Note: you'll need to provide your own image - the following is just an example.
> let plusImage = UIImage(named: "plus").withRenderingMode(.alwaysTemplate)
> let button = MDCFloatingButton()
> button.setImage(plusImage, forState: .normal)
>```
</details>
