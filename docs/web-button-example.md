<!--docs:
title: "Example article: Web button"
layout: detail
section: components
excerpt: "This is an example of the Web Material Button developer article for material.io. It uses the template from [../article-component-template.md]"
iconId:
path: /
api_doc_root:
@import "@material/button/mdc-button";
-->
# Buttons (`mdc-buttons`)

`mdc-buttons` is a customizable button component with updated visual styles. This button component has several built-in styles to support different levels of emphasis, as typically any UI will contain a few different buttons to indicate different actions.

For more information on the buttons component, go to the material.io [Buttons](http://material.io/components/buttons) page.

## `mcd-buttons` variants

1. [Text (flat) button](#text-button): Text buttons are typically used for less-pronounced actions, including those located in dialogs and in cards. In cards, text buttons help maintain an emphasis on card content.
1. [Contained (raised) button](#contained-button): Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

<img src="images/buttons-types-all.png">


## Using `mdc-buttons`

The `mdc-buttons` component provides a complete implementation of Material Design’s button component.

### Install `mcd-button`
Install the `mdc-button` component before including it in your source.

```bash
npm install @material/buttons
```
### Add a theme (style)
The `mdc-buttons` component works with themes (styles). Import a style into your stylesheet to apply it to your website, including buttons:

```css
@import "@material/button/mdc-button";
```
### Import JavaScript button effects
You can also add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to your buttons by importing then instantiating `MCDRipple`. See the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md) for more information on importing JavaScript.

```js
import {MDCRipple} from '@material/ripple';

const buttonRipple = new MDCRipple(document.querySelector('.mdc-button'));
```

### Add icons to buttons

You can add icons to your buttons.

1. In your HTML file, reference the font library you would like to use (we recommend the [Material Icons](https://material.io/tools/icons/) from Google Fonts):
    ```HTML
    <head>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    ```
1. Include the `mcd-button__icon` class inside your button element. Set the attribute `area-hidden="true"`.
    **Note** The location of the icon element determines if the icon comes before (*leading*) or after (*trailing icon*) the text.

    **Example using [Material Icons](https://material.io/tools/icons/)**
    ```HTML
    <button class="mdc-button">
      <i class="material-icons mdc-button__icon" aria-hidden="true">favorite</i>
      <span class="mdc-button__label">Button</span>
    </button>
    ```
    **Example using SVG Icons**
    ```html
    <button class="mdc-button">
      <svg class="mdc-button__icon" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" viewBox="...">
        /*...*/
      </svg>
      <span class="mdc-button__label">Button</span>
    </button>
    ```


### Related APIs

[Source code](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button): GitHub source repository<br>
[Demo site](https://material-components.github.io/material-components-web-catalog/#/component/button): You can use this site to generate basic HTML source for button variants, such as text, outlined, raised, and unelevated.

**CSS Classes**

| CSS Class | Description |
|---|---|
| `mdc-button` | Mandatory. Defaults to a text button that is flush with the surface.|
| `mdc-button--raised`	| Optional. Styles a contained button that is elevated above the surface. |
| `mdc-button--unelevated` |	Optional. Styles a contained button that is flush with the surface. |
| `mdc-button--outlined` |	Optional. Styles an outlined button that is flush with the surface. |
| `mdc-button--dense` |	Optional. Makes the button text and container slightly smaller. |
| `mdc-button__label` |	Optional for buttons with leading or no icon, required for buttons with trailing icons. Indicates the element containing the button’s text label. |
| `mdc-button__icon` |	Optional. Indicates the element containing the button’s icon. |



### Text (flat) button

Text buttons are typically used for less-pronounced actions, including those located:
* In dialogs
* In cards
In cards, text buttons help maintain an emphasis on card content.


<img src="images/ios-text-button.gif">

element | class | class description
---|---|---
button | `mdc-button` | text button
span | `mdc-button__label` | applies the text to the button

#### Text button example

```html
 <button class="mdc-button">
  <span class="mdc-button__label">Button</span>
</button>
```

### Outlined button

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

<img src="images/ios-outlined.gif">

#### Outlined button example

```html
 <button class="mdc-button--outlined">
  <span class="mdc-button__label">Button</span>
</button>
```

### Contained (raised) button

Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

<img src="images/ios-contained.gif">

#### Contained button example

```html
 <button class="mdc-button--elevated">
  <span class="mdc-button__label">Button</span>
</button>
```


## Example: \[Describe a way to use the Component\]

<button class="mdc-button">
  <span class="mdc-button__label">Button</span>  
</button>

<details>
  <summary><b>Click to View Examples without Steps</b></summary>

  Describe the example and its components, including specific settings and instructions.

  > ### Example: Add a contained (filled) and elevated button
  > The following code adds a contained and elevated button to your app. Your theme's `colorPrimary` is the default background color and your theme's `colorOnPrimary` is the default text color.
  > <img src="/docs/contained-button-usage.png" alt="example of a filled an elevated button image">
  >   ```xml
  >    <com.google.android.material.button.MaterialButton
  >      android:id="@+id/material_button"
  >      android:layout_width="wrap_content"
  >      android:layout_height="wrap_content"
  >      android:text="@string/button_label_enabled"/>
  >  ```
  >  ### Example: Add a contained (filled) and unlevated button
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

  If the example entails multiple steps, use a numbered list for each step. Break out iny installation/importation steps into its own list.

 List the steps to use the compnent. Include any installation/importation instructions in a separate list.
> ### Add a themed text button
> Follow the steps below to add a text button in your iOS application:
> <img src="/docs/ios-text-button.gif" alt="animated gif of a text button">
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
