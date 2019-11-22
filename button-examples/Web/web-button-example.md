# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four types of buttons:

* [Text button](#text-button)
* [Outlined button](#outlined-button) 
* [Contained button](#contained-button)
* [Toggle button](#toggle-button)

<!-- TODO(b/1234568): Add example image here when it is available. -->

## Using buttons

Before you can implement a Material button, you will need to install the following:

* [Material button(s)](#install-mdc-button-or-mdc-icon-button)
* [Add a theme](#add-a-theme)
* [Import JavaScript effects](import-javascript-effects)

### Install `mcd-button` or `mdc-icon-button`
Install the `mdc-button` component before including it in your source.

**`mdc-button`**
```bash
npm install @material/buttons
```

**`mdc-icon-button`**
```bash
npm install @material/icon-button
```

### Add a theme
Both `mdc-button` and `mdc-icon-button` work with themes (styles). Import a style into your `*.scss*` stylesheet to apply it to your website, including buttons or toggle icon buttons:

**mdc-button**
```css
@import "@material/button/mdc-button";
```

**mdc-icon-button**
```css
@import "@material/icon-button/mdc-icon-button";
```

### Import JavaScript effects
You can also add a JavaScript ripple effect (see [MDC Ripple](https://material.io/develop/web/components/ripples/)) to your buttons by importing and then instantiating `MCDRipple` in your `*.js` file. See the [page on importing the JavaScript component](https://material.io/develop/web/docs/importing-js/) for more information on importing JavaScript.

```js
import {MDCRipple} from '@material/ripple';

<!-- The following line applies to the `mdc-button` class-->
const buttonRipple = new MDCRipple(document.querySelector('.mdc-button'));


<!-- The following line applies to the `mdc-icon-button` class-->
const iconButtonRipple = new MDCRipple(document.querySelector(`.mdc-icon-button`));
iconButtonRipple.unbounded = true;
```

### Add an icon to `mdc-button`

Add an icon to your `mdc-button` instance using the following steps:

1. In your HTML file, reference the icon font library you would like to use (we recommend using our open-source [Material Icons](https://material.io/tools/icons/) from Google Fonts):
    ```HTML
    <head>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    ```
1. Include the `mcd-button__icon` class inside your button element. Set the attribute `area-hidden="true"`.
    **Note**: The location of the icon element determines if the icon comes before the text (*leading icon*) or after the text (*trailing icon*).

    **Example using [Material Icons](https://material.io/tools/icons/)**
    ```HTML
    <button class="mdc-button">
      <i class="material-icons mdc-button__icon" aria-hidden="true">favorite</i>
      <span class="mdc-button__label">Button</span>
    </button>
    ```
    **Example using SVG icons**
    ```html
    <button class="mdc-button">
      <svg class="mdc-button__icon" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" viewBox="...">
        /*...*/
      </svg>
      <span class="mdc-button__label">Button</span>
    </button>
    ```

### Sass mixins

Use Sass mixins when you want to customize the look and feel of your buttons. For installation instructions, see the [Install Sass page on sass-lang.com](https://sass-lang.com/install).

Before using Sass mixins for your project, you will need to do the following:

* Add the Sass package to your `*.json file` under `devDependencies`:
```json
"devDependencies": {
  "sass": "^1.14.3"
}
````

* Add a `.sassrc.js` file to your project directory:
```js

const path = require("path");

const CWD = process.cwd();

module.exports = {
  includePaths: [path.resolve(CWD, "node_modules"), path.resolve(CWD, "src")]
};
```

* In your `*.scss` file for your application, create an instance of your button with the Sass mixins settings of your choice. For example, if you have a button :

```css
.button-instance {
  @include mdc-button-container-fill-color(orange);
  @include mdc-button-icon-color(green);
  ...
}
```

<img src="images/web-sass-mixins-example.png" alt="Example button instance rendered for a contained button with an orange fill and green icon color">

#### Sass mixins for `mdc-button`

The following mixins are available to customize your `mdc-button` instance.

Mixin | Description
---|---
`mdc-button-container-fill-color($color)` | Sets the container fill color to the given color.
`mdc-button-icon-color($color)` | Sets the icon color to the given color.
`mdc-button-ink-color($color)` | Sets the ink color to the given color, and sets the icon color to the given color unless `mdc-button-icon-color` is also used.
`mdc-button-shape-radius($radius, $rtl-reflexive)` | Sets rounded shape to button with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`mdc-button-horizontal-padding($padding)` | Sets horizontal padding to the given number.
`mdc-button-outline-color($color)` | Sets the outline color to the given color.
`mdc-button-outline-width($width, $padding)` | Sets the outline width to the given number (defaults to 2px) and adjusts padding accordingly. `$padding` is only required in cases where `mdc-button-horizontal-padding` is also included with a custom value.

#### Sass mixins for `mdc-icon-button`

The following mixins are available to customize your `mdc-icon-button` instance.

Mixin | Description
---|---
`mdc-icon-button-size($width, $height, $padding)` | Sets the width, height, font-size and padding for the icon and ripple. `$height` is optional and defaults to `$width`. `$padding` is optional and defaults to `max($width, $height)/2`. `font-size` is set to `max($width, $height)`.
`mdc-icon-button-ink-color($color)` | Sets the font color and the ripple color to the provided color value.

## [Text button](https://material.io/components/buttons/#text-button)

Text buttons are typically used for less-pronounced actions, including those located in dialogs and cards. In cards, text buttons help maintain an emphasis on card content.


### Text button example

Source code API:

* mdc-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria)
    
    The following example shows a text button with purple text on a white background.

<img src="images/web-text-button.png" alt="Text button example for the web with the purple text 'text button' over a white background.">

```html
 <button class="mdc-button">
  <span class="mdc-button__label">Text Button</span>
</button>
```

#### Text button with icon example

<img src="images/web-text-icon-button.png" alt="Text button with icon example for the web with a bookmark icon and the purple text 'text button plus icon' over a white background.">

```html
<button class="mdc-button">
  <i class="material-icons mdc-button__icon" aria-hidden="true"
    >bookmark</i
  >
  <span class="mdc-button__label">Text Button plus icon</span>
</button>
```

## [Outlined button](https://material.io/components/buttons/#outlined-button)

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.


### Outlined button example

Source code API:

* mdc-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria):
    
The following example shows an outlined button with purple text and a purple stroke.
    
<img src="images/web-outlined-button.png" alt="Outlined button example for the web with the purple text 'outlined button' surrounded by a purple outline.">

```html
<button class="mdc-button--outlined">
  <span class="mdc-button__label">Outlined Button</span>
</button>
```

### Outlined button with icon example

Source code API:

* mdc-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria)
    
 The following example shows an outlined button with a purple icon, purple text, and a purple stroke.

<img src="images/web-outlined-icon-button.png" alt="Outlined button example for the web with a purple bookmark icon and the purple text 'outlined button plus icon' surrounded by a purple outline.">

```html
<button class="mdc-button mdc-button--outlined">
  <i class="material-icons mdc-button__icon" aria-hidden="true">bookmark</i>
    <span class="mdc-button__label">Outlined Button plus Icon</span>
</button>
```

## [Contained button](https://material.io/components/buttons/#contained-button)

Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

#### Contained button example

Source code API:

* mdc-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria)

The following example shows a contained button with white text on a purple background.

<img src="images/web-contained-button.png" alt="Contained button example for the web with the white text 'contained button' on a purple background.">

```html
<button class="mdc-button--elevated">
  <span class="mdc-button__label">Contained Button</span>
</button>
```

### Contained button with icon example

Source code API:

* mdc-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button)
    * [Demo site](https://glitch.com/~shadow-jobaria)
    
The following example shows a contained button with a white icon and text on a purple background.

<img src="images/web-contained-icon-button.png" alt="Contained button example for the web with a bookmark icon and the white text 'contained button plus icon' on a purple background.">

```html
<button class="mdc-button mdc-button--raised">
  <i class="material-icons mdc-button__icon" aria-hidden="true"
    >bookmark</i
  >
  <span class="mdc-button__label">Contained Button plus Icon</span>
</button>
```

## [Toggle button](https://material.io/components/buttons/#toggle-button)

Toggle buttons can be used to group related options. To emphasize groups of related toggle buttons, a group should share a common container.

There are two types of toggle buttons:
* [Toggle bar](#toggle-bar)
* [Toggle icon button](#toggle-icon-button)

### Toggle bar

The toggle bar (also known as a toggle button group) is a group of related toggle buttons sharing a common container:

<img src="toggle-bar.png" alt="Two toggle bars used for text editing. The first group shows icons for italics, bold underline, and text color. The second group shows icons for center-, left-, and right-aligned text.">

The toggle bar is not currently supported by Material Components for the web. If your application needs a toggle bar, you can use one from a different framework such as [Vuetify](https://vuetifyjs.com/en/components/button-groups#button-groups).

### Toggle icon button

The toggle icon button allows you to select from a group using an icon.

#### Toggle icon button example with background images

Source code API:

* mdc-icon-button
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-icon-button)
    * [Demo site](https://glitch.com/~shadow-jobaria)
    
The following example shows four images arranged in a two-by-two array with a favorite icon in the upper-right corner of each image.

<img src="images/web-toggle-icon-button.png" alt="Web toggle icon button example showing four images in an array with a favorite icon in the upper-right corner of each image.">
To generate the example with background images of your choosing, you will need to do the following:

* In your `*.scss` file:
  1. Create containers to contain your tiled images:
      ```css
      .container {
        display: flex;
        flex-wrap: wrap;
        max-width: 450px;
        justify-content: center;
      }
      ```
  1. Create containers for your images, with the images cut to fit within the predefined height and width:
      ```css
        image-with-fave {
          position: relative;
          margin: 2px;
        }

        .image-with-fave img {
          width: 200px;
          height: 200px;
          object-fit: cover;
        }
      ```
  1. If your images are dark, then you may need use Sass mixins to change the icon color from the default. For example, you can create an instance of an icon button with white ink instead of the default black:
        ```css
            .fave-button {
              @include mdc-icon-button-ink-color(white);

              position: absolute;
              top: 0;
              right: 0;
            }
        ```
* In your `*.js` file,
    1. Import `MDCIconButtonToggle`:
        ```js
        import {MDCIconButtonToggle} from '@material/icon-button';
        ```
    1. Instantiate the icon button toggle:
        ```js
        const iconToggle = new MDCIconButtonToggle(document.querySelector('.mdc-icon-button'));
        iconToggle.unbounded = true;
        ```
    1. If you want to add a ripple effect to your button press:

        ```js
        import { MDCRipple } from "@material/ripple";
        ...
        const iconButtonRipple = new MDCRipple(document.querySelector('.mdc-icon-button'));
        iconButtonRipple.unbounded = true;
        ```
* In your `*.html` file, you can now add the iterations of the following, which shows containers with background images:
    ```html
    <div class="container">
          <div class="image-with-fave">
            <img src="https://cdn.glitch.com/4f0b2993-dd70-46bf-916f-a6e81af58957%2Fimage1.jpeg?v=1570131499813" />
            <button
              id="bookmark-0"
              class="mdc-icon-button fave-button"
              aria-label="Add to favorites"
              aria-hidden="true"
              aria-pressed="false"
            >
              <i
                class="material-icons mdc-icon-button__icon mdc-icon-button__icon--on"
                >bookmark</i
              >
              <i class="material-icons mdc-icon-button__icon">bookmark_border</i>
            </button>
          </div>
          <div class="image-with-fave">
            <img
          src="https://cdn.glitch.com/4f0b2993-dd70-46bf-916f-a6e81af58957%2Fimage2.jpeg?v=1570131499876" />
            <button
              id="bookmark-1"
              class="mdc-icon-button fave-button"
              aria-label="Add to favorites"
              aria-hidden="true"
              aria-pressed="false"
            >
              <i
                class="material-icons mdc-icon-button__icon mdc-icon-button__icon--on"
                >bookmark</i
              >
              <i class="material-icons mdc-icon-button__icon">bookmark_border</i>
              </button>
          </div>
          ...
        </div>
    ```
