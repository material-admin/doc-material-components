<!--docs:
title: "Buttons"
layout: detail
section: components
excerpt: "Web Buttons"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /:
api_doc_root:
-->

# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four types of buttons:

1. [Text button](#text-button)
2. [Outlined button](#outlined-button)
3. [Contained button](#contained-button)
4. [Toggle button](#toggle-button)

![Example of the four button types](assets/buttons_types.png)

## Using buttons

Before you can use a button, you will need to first:

* Install the Material button component
* Import JavaScript

### Install the Material button component

Install the `mdc-button` component before including it in your source.

<details><summary><b>Expand for installation commands for <code>mdc-button</code></b></summary>

**`mdc-button`**
```bash
npm install @material/button
```

</details>

### Import JavaScript ripple effect

You can optionally add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to your buttons by importing and then instantiating `MDCRipple` in your `*.js` file. For more information, see the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md).

To bundle your `*.js` file, go to the [quickstart page](https://github.com/material-components/material-components-web/blob/master/docs/getting-started.md#quick-start-cdn).

<details><summary><b>Expand for instructions to add JavaScript ripple effect</b></summary>

```js
import {MDCRipple} from '@material/ripple';

const buttonRipple = new MDCRipple(document.querySelector('.mdc-button'));
```

</details>

### Add an icon to `mdc-button`

<details><summary><b>Expand for instructions to add an icon to your <code>mdc-button</code></b></summary>

Add an icon to your `mdc-button` instance as follows:

1. In your HTML file, reference the icon font library you would like to use (we recommend the [Material Icons](https://material.io/tools/icons/) from Google Fonts):
    ```HTML
    <head>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    ```
1. Include the `mdc-button__icon` class inside your button element. Set the attribute `aria-hidden="true"`.
    **Note**: The location of the icon element determines if the icon comes before (*leading*) or after (*trailing icon*) the button label.

    **Example using [Material Icons](https://material.io/tools/icons/)**
    ```HTML
    <button class="mdc-button">
      <div class="mdc-button__ripple"></div>
      <i class="material-icons mdc-button__icon" aria-hidden="true">favorite</i>
      <span class="mdc-button__label">Button</span>
    </button>
    ```

    **Example using SVG Icons**
    ```html
    <button class="mdc-button">
      <div class="mdc-button__ripple"></div>
      <svg class="mdc-button__icon" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" viewBox="...">
      ...
      </svg>
      <span class="mdc-button__label">Button</span>
    </button>
    ```
</details>

### Making buttons accessible

Material Design spec advises that touch targets should be at least 48 x 48 px.
To meet this requirement, add the following to your button:

```html
<div class="mdc-touch-target-wrapper">
  <button class="mdc-button mdc-button--touch">
    <div class="mdc-button__ripple"></div>
    <span class="mdc-button__label">My Accessible Button</span>
    <div class="mdc-button__touch"></div>
  </button>
</div>
```

_**Note**: The outer `mdc-touch-target-wrapper` element is only necessary if you want to avoid potentially overlapping touch targets on adjacent elements (due to collapsing margins)._

## Text button

[Text buttons](https://material.io/components/buttons/#text-button) are typically used for less-pronounced actions, including those located in dialogs and cards. In cards, text buttons help maintain an emphasis on card content.

### Text button example

Source code API:

* `mdc-button`
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria)

<img src="assets/web-text-button.png" alt="Text button example">

```html
 <button class="mdc-button">
   <div class="mdc-button__ripple"></div>
   <span class="mdc-button__label">Text Button</span>
</button>
```

<details><summary><b>Text button with icon example</b></summary>

<img src="assets/web-text-icon-button.png" alt="Text button with bookmark icon example">

```html
<button class="mdc-button">
  <div class="mdc-button__ripple"></div>
  <i class="material-icons mdc-button__icon" aria-hidden="true"
    >bookmark</i
  >
  <span class="mdc-button__label">Text Button plus icon</span>
</button>

```
</details>

### Anatomy and key properties

A text button has a text label, a transparent container and an optional icon.

![Text button anatomy diagram](assets/text_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details>
<summary><b>Text label</b> attributes</summary>
<br>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | N/A |  N/A
Text color | Primary color |
Typography | Default |

</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Container ink color | Primary color | `mdc-button-ink-color($color)`
</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>


 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
 Icon | N/A |
C | Icon color | Primary color | ` mdc-button-icon-color($color)`

</details>


## Outlined button

[Outlined buttons](https://material.io/components/buttons/#outlined-button) are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

### Outlined button example

Source code API:

* `mdc-button`
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria):

<img src="assets/web-outlined-button.png" alt="Outlined button example">

```html
<button class="mdc-button--outlined">
  <div class="mdc-button__ripple"></div>
  <span class="mdc-button__label">Outlined Button</span>
</button>
```

<details><summary><b>Outlined button with icon example</b></summary>


<img src="assets/web-outlined-icon-button.png" alt="Outlined button with bookmark icon">

```html
<button class="mdc-button mdc-button--outlined">
  <div class="mdc-button__ripple"></div>
  <i class="material-icons mdc-button__icon" aria-hidden="true">bookmark</i>
  <span class="mdc-button__label">Outlined Button plus Icon</span>
</button>
```
</details>

### Anatomy and key properties

An outline button has text, a container, and an optional icon.


![Outlined button anatomy diagram](assets/outlined_button_anatomy.png)

1. Text label
1. Container
1. Icon


<details><summary><b>Text label attributes</b></summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | N/A |  N/A
Text color | Primary color |
Typography | Default |

</details>

<details><summary><b>Container attributes</b></summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Container ink color | Primary color | `mdc-button-ink-color($color)`
Container shape radius | Default | `mdc-button-shape-radius($radius, $rtl-reflexive)`
Container outline color | Secondary color | `mdc-button-outline-color($color)`
Container outline width | | `mdc-button-outline-width($width, $padding)`
Container horizontal padding | | `mdc-button-horizontal-padding($padding)`

</details>


<details><summary><b>Icon attributes</b></summary>

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
 Icon | N/A |
C | Icon color | Primary color | ` mdc-button-icon-color($color)`

We recommend using [Material Theming](https://material.io/components/buttons/#theming) to apply your customizations across your application. For a full list of component properties, go to the [Outlined button API doc]()


</details>


## Contained button

[Contained buttons](https://material.io/components/buttons/#contained-button) are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

#### Contained button example

Source code API:

* mdc-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria)


<img src="assets/web-contained-button.png" alt="Contained button example">

```html
<button class="mdc-button--elevated">
  <span class="mdc-button__label">Contained Button</span>
</button>
```

<details><summary><b>Contained button with icon example</b></summary>

Source code API:

<img src="assets/web-contained-icon-button.png" alt="Contained button with a bookmark icon">

```html
<button class="mdc-button mdc-button--raised">
  <div class="mdc-button__ripple"></div>
  <i class="material-icons mdc-button__icon" aria-hidden="true"
    >bookmark</i
  >
  <span class="mdc-button__label">Contained Button plus Icon</span>
</button>
```
</details>

### Anatomy and key attributes

A contained button has text, a container, and an optional icon.

[Contained button anatomy diagram](assets/contained_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details><summary><b>Text label attributes</b></summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | N/A |  N/A
Text color | Secondary color |
Typography | Default |

</details>

<details><summary><b>Container attributes</b></summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Container fill color| Primary color | ` mdc-button-container-fill-color($color)`
Container ink color | Primary color | `mdc-button-ink-color($color)`
Container shape radius | Default | `mdc-button-shape-radius($radius, $rtl-reflexive)`
Container outline color | Secondary color | `mdc-button-outline-color($color)`
Container outline width | | `mdc-button-outline-width($width, $padding)`
Container horizontal padding | | `mdc-button-horizontal-padding($padding)`

</details>


<details><summary><b>Icon attributes</b></summary>

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Icon | N/A |
Icon color | Secondary color | ` mdc-button-icon-color($color)`


We recommend using [Material Theming](https://material.io/components/buttons/#theming) to apply your customizations across your application. For a full list of component properties, go to the [contained button API doc]()

</details>

## Toggle button


[Toggle buttons](https://material.io/components/buttons/#toggle-button) can be used to select from a group of choices.

There are two types of toggle buttons:

* [Toggle button](#toggle-button)
* [Icon](#icon)

### Toggle button

<img src="toggle-bar.png" alt="toggle button group">

MDC Web currently does not support toggle button groups.

### Icon

Icons can be used as toggle buttons when they allow selection, or deselection, of a single choice, such as marking an item as a favorite.

For more details, see the <TODO: Add link to icon-button docs>

### Button theming example

The following example shows text, outlined and contained button types with Material Theming.

<img src="assets/button-theming.png" width="400" alt="Button theming with three buttons - text, outlined, and contained - with Shrine theming.">

<details>
<summary><b>Implementing button theming</b></summary>

#### Theming with Sass variables

Before importing any MDC Web modules, set `$mdc-theme-primary` and
`mdc-theme-on-primary` in your Sass file:

```scss
$mdc-theme-primary: #FEDBD0;
$mdc-theme-on-primary: #442C2E;
```

In this case we also want to customize the label color of the text and outlined
buttons, to fulfill color contrast requirements:

```scss
@use "@material/button/mdc-button" as button;

.mdc-button.my-custom-text-button,
.mdc-button.my-custom-outlined-button {
  @include button.mdc-button-ink-color(#84565E);
}
```

#### Theming with CSS Custom Properties

If you want to customize the theme for buttons without changing the theme
across the app, you can also use CSS custom properties:

```scss
@use "@material/button/mdc-button" as button;

.mdc-button.my-custom-text-button,
.mdc-button.my-custom-outlined-button {
  --mdc-theme-primary: #FEDBD0;
  --mdc-theme-on-primary: #442C2E;

  @include button.mdc-button-ink-color(#84565E);
}
```

For a more information on theming in general, see
[this page](../../docs/theming.md).

</details>
 
## Style Customization
 
### CSS Classes
 
CSS Class | Description
--- | ---
`mdc-button` | Mandatory. Defaults to a text button that is flush with the surface.
`mdc-button__ripple` | Mandatory. Indicates the element which shows the ripple styling.
`mdc-button--raised` | Optional. Styles a contained button that is elevated above the surface.
`mdc-button--unelevated` | Optional. Styles a contained button that is flush with the surface.
`mdc-button--outlined` | Optional. Styles an outlined button that is flush with the surface.
`mdc-button__label` | Recommended.\* Indicates the element containing the button's text label.
`mdc-button__icon` | Optional. Indicates the element containing the button's icon.
 
> \*_NOTE_: The `mdc-button__label` element is required for buttons with a trailing icon, but it is currently optional for
> buttons with no icon or a leading icon. In the latter cases, it is acceptable for the text label to simply exist
> directly within the `mdc-button` element.
> However, the `mdc-button__label` class may become mandatory for all cases in the future, so it is recommended to
> always include it to be future-proof.
 
### Sass Mixins
 
To customize a button's color and properties, you can use the following mixins.
 
#### Basic Sass Mixins
 
MDC Button uses [MDC Theme](../mdc-theme)'s `primary` color by default. Use the following mixins to customize it.
 
Mixin | Description
--- | ---
`mdc-button-filled-accessible($container-fill-color)` | Sets the container fill color for a contained (_raised_ or _unelevated_) button, and updates the button's ink, icon, and ripple colors to meet accessibility standards
 
#### Advanced Sass Mixins
 
These mixins will override the color of the container, ink, outline or ripple. It is up to you to ensure your button meets accessibility standards.
 
Mixin | Description
--- | ---
`mdc-button-container-fill-color($color)` | Sets the container fill color to the given color for an enabled button.
`mdc-button-disabled-container-fill-color($color)` | Sets the container fill color to the given color for a disabled button.
`mdc-button-icon-color($color)` | Sets the icon color to the given color for an enabled button.
`mdc-button-disabled-icon-color($color)` | Sets the icon color to the given color for a disabled button.
`mdc-button-ink-color($color)` | Sets the ink color to the given color for an enabled button, and sets the icon color to the given color unless `mdc-button-icon-color` is also used.
`mdc-button-disabled-ink-color($color)` | Sets the ink color to the given color for a disabled button, and sets the icon color to the given color unless `mdc-button-icon-color` is also used.
`mdc-button-density($density-scale)` | Sets density scale for button. Supported density scale values (`-3`, `-2`, `-1`, `0`).
`mdc-button-height($height)` | Sets custom height for button.
`mdc-button-shape-radius($radius, $density-scale, $rtl-reflexive)` | Sets rounded shape to button with given radius size. `$density-scale` is only required when `$radius` value is in percentage unit, defaults to `$mdc-button-density-default-scale`. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`mdc-button-horizontal-padding($padding)` | Sets horizontal padding to the given number.
`mdc-button-outline-color($color)` | Sets the outline color to the given color for an enabled button.
`mdc-button-disabled-outline-color($color)` | Sets the outline color to the given color for a disabled button.
`mdc-button-outline-width($width, $padding)` | Sets the outline width to the given number (defaults to 2px) and adjusts padding accordingly. `$padding` is only required in cases where `mdc-button-horizontal-padding` is also included with a custom value.
