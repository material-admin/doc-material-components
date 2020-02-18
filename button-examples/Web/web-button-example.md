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

Before you can use a button, you will need to install and import the following:

* Install the Material button component
* Import JavaScript

### Install the Material button component

Install the `mdc-button` (for text, outlined, or contained button) or `mdc-icon-button` (for the icon toggle button) component before including it in your source.


<details><summary><b>Expand for installation commands for <code>mdc-button</code> or <code>mdc-icon-button</code>.</b></summary>

**`mdc-button`**
```bash
npm install @material/buttons
```

**`mdc-icon-button`**
```bash
npm install @material/icon-button
```

</details>

### Import JavaScript

You can optionally add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to your buttons by importing and then instantiating `MDCRipple` in your `*.js` file. See the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md) for more information.

To bundle your `*.js` file, go to the [quickstart page](https://github.com/material-components/material-components-web/blob/master/docs/getting-started.md#quick-start-cdn).

<details><summary><b>Expand for instructions to add JavaScript</b></summary>

```js
import {MDCRipple} from '@material/ripple';

// The following line applies to the `mdc-button` class
const buttonRipple = new MDCRipple(document.querySelector('.mdc-button'));


// The following line applies to the `mdc-icon-button` class
const iconButtonRipple = new MDCRipple(document.querySelector(`.mdc-icon-button`));
iconButtonRipple.unbounded = true;
```

</details>

### Add an icon to `mdc-button`

<details><summary><b>Expand for instructions to add an icon to your <code>mdc-button</code></b></summary>

Add an icon to your `mdc-button` instance using the following steps:

1. In your HTML file, reference the icon font library you would like to use (we recommend the [Material Icons](https://material.io/tools/icons/) from Google Fonts):
    ```HTML
    <head>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    ```
1. Include the `mdc-button__icon` class inside your button element. Set the attribute `aria-hidden="true"`.
    **Note** The location of the icon element determines if the icon comes before (*leading*) or after (*trailing icon*) the button label.

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
      <<svg class="mdc-button__icon" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" viewBox="...">
  ...svg class="mdc-button__icon" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" viewBox="...">
        /*...*/
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

_**Note** The outer `mdc-touch-target-wrapper` element is only necessary if you want to avoid potentially overlapping touch targets on adjacent elements (due to collapsing margins)._

### Sass mixins

Use Sass mixins when you want to customize the look and feel of your buttons. Go to [sass-lang.com](https://sass-lang.com/install) for installation instructions.

Buttons support [Material Theming](https://material.io/components/buttons/#theming) and can be customized in terms of color, typography and shape.

<details><summary><b>Expand for instructions to use Sass mixins to customize your <code>mdc-button</code> or <code>mdc-icon-button</code></b></summary>

Before using Sass mixins for your project you will need to do the following:

* Add the Sass package to your `*.json file` under `devDependencies`:
```json
"devDependencies": {
  "sass": "^1.24.3"
}
```

* Add a `.sassrc.js` file to your project root directory:

```js
const path = require("path");

const CWD = process.cwd();

module.exports = {
  includePaths: [path.resolve(CWD, "node_modules"), path.resolve(CWD, "src")]
};
```
</details>

Import base styles of button into your `*.scss` stylesheet using :

<details><summary><b>Expand for theming instructions for <code>mdc-button</code> or <code>mdc-icon-button</code>.</b></summary>

**mdc-button**
```scss
@use '@material/button/mdc-button';
```

**mdc-icon-button**
```scss
@use '@material/icon-button/mdc-icon-button';
```

* In your `*.scss` file for your application, create an instance of your button with the Sass mixins settings of your choice. For example, if you have a button :

```scss
@use '@material/button/mixins' as button;

.button-instance {
  @include button.container-fill-color(orange);
  @include button.icon-color(green);
  // ...
}
```

<img src="assets/web-sass-mixins-example.png" alt="Contained button with orange fill and green icon ">

#### Sass mixins for `mdc-button`

The following mixins are available to customize your `mdc-button` instance.

Mixin | Description
---|---
`container-fill-color($color)` | Sets the container fill color to the given color.
`icon-color($color)` | Sets the icon color to the given color.
`ink-color($color)` | Sets the ink color to the given color, and sets the icon color to the given color unless `icon-color` is also used.
`shape-radius($radius, $rtl-reflexive)` | Sets rounded shape to button with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`horizontal-padding($padding)` | Sets horizontal padding to the given number.
`outline-color($color)` | Sets the outline color to the given color.
`outline-width($width, $padding)` | Sets the outline width to the given number (defaults to 2px) and adjusts padding accordingly. `$padding` is only required in cases where `horizontal-padding` is also included with a custom value.

#### Sass mixins for `mdc-icon-button`

The following mixins are available to customize your `mdc-icon-button` instance.

Mixin | Description
---|---
`size($width, $height, $padding)` | Sets the width, height, font-size and padding for the icon and ripple. `$height` is optional and defaults to `$width`. `$padding` is optional and defaults to `max($width, $height)/2`. `font-size` is set to `max($width, $height)`.
`ink-color($color)` | Sets the font color and the ripple color to the provided color value.

</details>

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
Icon color | Primary color | ` mdc-button-icon-color($color)`

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
Text color | Primary color | `mdc-button-ink-color($color)`
Accessible text color | Calculated | `mdc-button-filled-accessible($container-fill-color)`

</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Container ink color | Primary color | `mdc-button-container-fill-color($color)`
Container density | Default (`0`) | `mdc-button-density($density-scale)`
Container height | Default | `mdc-button-height($height)`
Container shape radius | Default | `mdc-button-shape-radius($radius, $density-scale, $rtl-reflexive)`
Container horizontal padding | Default | `mdc-button-horizontal-padding($padding)`
Container outline color | Primary Color | `mdc-button-outline-color($color)`
Container outline width | Default (`2px`) | `mdc-button-outline-width($width, $padding)`
</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>


 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Icon color | Primary color | ` mdc-button-icon-color($color)`

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

![Contained button anatomy diagram](assets/contained_button_anatomy.png)

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
Container horzontal padding | | `mdc-button-horizontal-padding($padding)`

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

The Material.io framework for Web currently does not support toggle button groups, such as:

<img src="toggle-bar.png" alt="toggle button group">

If your application needs a toggle button group, you will need to use a different framework such as [Vuetify](https://vuetifyjs.com/en/components/button-groups#button-groups).

### Icon

Icons can be used as toggle buttons when they allow selection, or deselection, of a single choice, such as marking an item as a favorite.


#### Toggle icon bar example with background images

Source code API:

* mdc-icon-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-icon-button)
    * [Demo site](https://glitch.com/edit/#!/join/8ef9db8e-e36f-4e03-ba14-39b1a8b69405)

<img src="assets/web-toggle-icon-button.png" alt="4 images arranged in a 2 by 2 array, each image with a favorite icon in the upper-right corner" width="50%">
To generate the example with background images of your choosing, you will need containers for your tiled images, and containers to resize your images. You may also need to change the icon color to ensure that the icon is visible on your image (see the `index.scss` file for the tiled container \[`container`\] and the image container \[`image-with-fav`\] and the icon button color \[`favve-button`\]).

* In your `*.js` file,
    1. Import `MDCIconButtonToggle`:
        ```js
        import {MDCIconButtonToggle} from '@material/icon-button';
        ```
    1. Instantiate the icon button toggle for each button:
        ```js
		const iconToggle0 = new MDCIconButtonToggle(document.querySelector('.btn1'));
		iconToggle0.unbounded = true;

		const iconToggle1 = new MDCIconButtonToggle(document.querySelector('.btn2'));
		iconToggle1.unbounded = true;
	```
* In your `*.html` file, you can now add the iterations of the following, which shows containers with background images:
    ```html
    <div class="container">
          <div class="image-with-fave">
            <img src="https://cdn.glitch.com/4f0b2993-dd70-46bf-916f-a6e81af58957%2Fimage1.jpeg?v=1570131499813" />
            <button
              id="bookmark-0"
              class="mdc-icon-button btn1 fave-button"
              aria-label="Add to favorites"
              aria-hidden="true"
              aria-pressed="false"
            >
              <i
                class="material-icons mdc-icon-button__icon mdc-icon-button__icon--on"
                >favorite</i
              >
              <i class="material-icons mdc-icon-button__icon">favorite_border</i>
            </button>
          </div>
          <div class="image-with-fave">
            <img
          src="https://cdn.glitch.com/4f0b2993-dd70-46bf-916f-a6e81af58957%2Fimage2.jpeg?v=1570131499876" />
            <button
              id="bookmark-1"
              class="mdc-icon-button btn2 fave-button"
              aria-label="Add to favorites"
              aria-hidden="true"
              aria-pressed="false"
            >
              <i
                class="material-icons mdc-icon-button__icon mdc-icon-button__icon--on"
                >favorite</i>
              <i class="material-icons mdc-icon-button__icon">favorite_border</i>
              </button>
          </div>
          ...
        </div>
    ```

#### Anatomy and key properties

The icon button consists of two icons for 'on' and 'off'.

![Toggle button anatomy](assets/toggle_button_anatomy.png)

1. Container
1. Icon

 Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Icon | N/A |
Icon color | Secondary color | ` mdc-button-icon-color($color)`|

We recommend using [Material Theming](https://material.io/components/buttons/#theming) to apply your customizations across your application. For a full list of component properties, go to the [Icon button API doc]()


</details>

### Button theming example

API and source code:

* `MaterialButton`
    * [Class description](https://)
    * [GitHub source](https://github.com/material-components/)

The following example shows text, outlined and contained button types with Material Theming.

!["Button theming with three buttons - text, outlined and contained - with shrine theming."](assets/button-theming.svg)

<details>
<summary><b>Implementing button theming</b></summary>
<br>

[Shrine theme](https://material.io/design/material-studies/shrine.html)
```
Include source code implementing text, outlined, and contained buttons using "Shrine" theme.

Upload a screenshot of the render and update the image.
```

</details>
