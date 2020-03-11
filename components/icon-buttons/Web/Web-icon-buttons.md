<!--docs:
title: "Icon buttons"
layout: detail
section: components
excerpt: "Web icon buttons"
iconId:
path: /components/buttons
api_doc_root:
-->

[Icon buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.


## Using icon buttons

### Install the Material icon button component

**`mdc-icon-button`**
```bash
npm install @material/icon-button
```

### Import JavaScript

You can optionally add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to your buttons by importing and then instantiating `MDCRipple` in your `*.js` file. See the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md) for more information.

To bundle your `*.js` file, go to the [quickstart page](https://github.com/material-components/material-components-web/blob/master/docs/getting-started.md#quick-start-cdn).

```js
import {MDCRipple} from '@material/ripple';

const iconButtonRipple = new MDCRipple(document.querySelector(`.mdc-icon-button`));
iconButtonRipple.unbounded = true;
```

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


