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
The API documentation formatting is roughly based on https://cloud.google.com/service-usage/docs/overview
-->

**Reminder** This is a template. Delete this paragraph and update and review all information requestsw within the comments.

# \[Component Name\]

Add a concise description of the component here. for example:

> Buttons allow users to take actions and make choices using a tap to press the button.
> Buttons can be customized to meet your style requirements.

If there are component subtypes, list them here and link to the relevant article.

Insert any related graphics. **Don't say what you can show**

**Note** if there component subtypes that require more than a page to describe/require examples, do not describe them in this article: create a separate article in its own folder.

<!-- Note that the iOS team has added a TOC to their repo, and it appears to be from https://github.com/jonschlinkert/markdown-toc -->
<!-- toc -->

<!-- design-and-api -->

## Using \[Component Name\]

Describe how the component is used. Provide images of its relative position, if relevant. Use collapsible tags for examples that require more than a page of text.

   
### Example: \[Describe a way to use the Component\]
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
